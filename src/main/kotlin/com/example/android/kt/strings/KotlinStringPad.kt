package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = intArrayOf(657, 122, 3245, 345, 99, 18)

    nums.toList().forEach { e -> println(e.toString().padStart(20, '.')) }
}