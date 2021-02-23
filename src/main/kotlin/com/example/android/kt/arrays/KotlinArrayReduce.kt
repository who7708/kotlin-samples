package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = intArrayOf(2, 3, 4, 5, 6, 7)

    val total = nums.reduce { product, next -> product * next }

    println(total)
}