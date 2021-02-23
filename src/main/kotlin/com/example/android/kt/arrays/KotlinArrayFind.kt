package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val firstEven = nums.find { it % 2 == 0 }
    println("The first even value is: $firstEven")

    val lastEven = nums.findLast { it % 2 == 0 }
    println("The last even value is: $lastEven")
}