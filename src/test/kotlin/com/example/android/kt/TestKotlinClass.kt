package com.example.android.kt

import org.junit.Test
import java.util.concurrent.locks.ReentrantLock
import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.read
import kotlin.concurrent.thread
import kotlin.concurrent.withLock

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/05/14
 */
class TestKotlinClass {

    @Test
    fun test3() {
        val student = Student()
        student.id = 123
        student.age = 1
        student.name = "Chris"
        println(student)
    }

    @Test
    fun test1() {
        // 使用 ReentrantReadWriteLock
        val reentrantReadWriteLock = ReentrantReadWriteLock()
        reentrantReadWriteLock.read {
            println("test ReentrantReadWriteLock")
        }

        // ReentrantLock
        val reentrantLock = ReentrantLock()
        reentrantLock.withLock {
            println("test ReentrantLock")
        }

        // 使用 线程
        thread(name = "threadNameTest") {
            println("test thread")
        }

        // 契约 contract
        foo("hello world")

        // synchronized 同步
        synchronized(this) {
            println("hello world")
        }
    }

    @Test
    fun test2() {
        var a: String? = null
        println(a.isNullOrEmpty())
        a = "     "
        println(a.isNullOrBlank())
        println(a.takeIf {
            a.isNullOrEmpty()
        })
    }

    /**
     *
     */
    fun foo(s: String?) {
        // 1.3 新特性 contract 契约
        require(s is String)
        // s 在这里智能转换为“String”，因为否则
        // “require”会抛出异常
    }
}

interface Foo {
    companion object {
        @JvmField
        val answer: Int = 42

        @JvmStatic
        fun sayHello() {
            println("Hello, world!")
        }
    }
}

// 相当于这段 Java 代码：

// interface Foo {
//     public static int answer = 42;
//     public static void sayHello() {
//         // ……
//     }
// }