package kotlinx.coroutines.guide.demo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
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
                        val result = random(atomicLong)
                        list.add(result)
                    }
                }
            }
        }
        println("finish $time ms")
        println("atomicLong sum = ${atomicLong.get()}")
        println(list.sum())
    }

    private suspend fun random(atomicLong: AtomicLong = AtomicLong(0)): Long {
        val random = (1000L..5000).random()
        println("${Thread.currentThread()}")
        atomicLong.addAndGet(random)
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

}