package com.example.android.kt.demo

import com.google.gson.GsonBuilder
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import org.junit.jupiter.api.Test
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

/**
 * @author Chris
 * @date 2021/07/27
 * @since 1.0.0
 */
class TestCoroutine {
    @Test
    fun test1() {
        GlobalScope.launch {
            delay(1000L)
            println("world")
        }

        println("hello")
        // Thread.sleep(2000L)
        runBlocking {
            delay(2000L)
        }
    }

    @Test
    fun test2() {
        thread {
            Thread.sleep(1000L)
            println("world")
        }
        println("hello")
        Thread.sleep(2000L)
    }

    @Test
    fun test3() {
        val list = arrayListOf<Long>()
        val atomicLong = AtomicLong(0)
        val time = measureTimeMillis {
            runBlocking {
                for (i in 1..100) {
                    launch(Dispatchers.IO) {
                        val result = random()
                        list.add(result)
                    }
                }
            }
        }
        println("finish $time ms")
        println("atomicLong sum = ${atomicLong.get()}")
        println(list.sum())
    }

    private suspend fun random(): Long {
        val random = (1000L..5000).random()
        println("${Thread.currentThread()}")
        delay(random)
        return random
    }

    @Test
    fun test4() {
        runBlocking {
            for (i in 1..100) {
                fetchDocs()
            }
        }
        println("finish...")
    }

    private suspend fun fetchDocs() {
        val result = get("https://developer.android.com")
        println(result)
    }

    private suspend fun get(url: String) = withContext(Dispatchers.IO) {
        return@withContext random()
    }

    /**
     * 测试异步协程
     */
    @Test
    fun testAsync() {
        val gson = GsonBuilder().setPrettyPrinting().create()
        // 统计时间
        val time = measureTimeMillis {
            // 阻塞线程，直到所有协程全部执行完成
            val result = runBlocking(Dispatchers.IO) {
                val list = arrayListOf<Deferred<TestObj>>()
                for (i in 1..10) {
                    // 异步请求
                    val asyncResult = async {
                        var random = 0L
                        return@async runCatching {
                            // 发送请求
                            random = request()
                            TestObj().apply { id = random; msg = "SUCCESS" }
                        }.getOrElse { ex ->
                            TestObj().apply { id = random; msg = ex.message }
                        }
                    }
                    list.add(asyncResult)
                }
                println("wait for the result...")
                list.map { it.await() }.toList()
            }
            // println(JSON.toJSONString(result, true))
            println(gson.toJson(result))
        }
        println()
        println("finish $time ms")
    }

    /**
     * 测试同步协程
     */
    @Test
    fun testLaunch() {
        val gson = GsonBuilder().setPrettyPrinting().create()
        // 统计时间
        val time = measureTimeMillis {
            // 阻塞线程，直到所有协程全部执行完成
            // val result = runBlocking(Dispatchers.IO) {
            val result = runBlocking {
                val list = arrayListOf<TestObj>()
                for (i in 1..10) {
                    // 由于使用了 Dispathcers 线程池，所以会一直new线程做处理。
                    // 如果不使用 Dispatchers ，则会在当前线程 main 新建一个协程进行处理
                    // 两个均是异步
                    launch {
                        var random = 0L
                        val result = runCatching {
                            // 发送请求
                            random = request()
                            TestObj().apply { id = random; msg = "SUCCESS" }
                        }.getOrElse { ex ->
                            TestObj().apply { id = random; msg = ex.message }
                        }
                        list.add(result)
                    }
                }
                return@runBlocking list
            }
            // println(JSON.toJSONString(result, true))
            println(gson.toJson(result))
        }
        println("finish $time ms")
    }

    /**
     * 模拟耗时请求
     */
    private suspend fun request(): Long {
        val random = (1000L..5000).random()
        println("$random, ${Thread.currentThread().name}")
        delay(random)
        // 模拟请求报错
        if (random.mod(3) == 0) throw ArithmeticException("算术异常")
        return random
    }
}