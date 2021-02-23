package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val hasAllEvens = nums.all { it % 2 == 0 }

    if (hasAllEvens) {

        println("The array contains only even values")
    } else {

        println("The array contains odd values")
    }
}