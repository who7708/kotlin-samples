package com.example.android.kt.ranges

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    (1..5).forEach(::println)

    (1..5).reversed().forEach { e -> print("$e ") }
}