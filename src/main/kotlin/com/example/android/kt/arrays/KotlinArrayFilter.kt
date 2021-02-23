package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = arrayOf(1, -2, 3, 4, -5, 7)

    nums.filter { e -> e > 0 }.forEach { e -> print("$e ") }
}