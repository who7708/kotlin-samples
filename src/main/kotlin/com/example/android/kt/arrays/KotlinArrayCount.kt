package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = intArrayOf(2, 3, 4, 5, 6, 7)

    println("There are ${nums.count()} elements in the array")

    val nOfEvens = nums.count { it % 2 == 0 }

    println("There are $nOfEvens even values in the array")
}