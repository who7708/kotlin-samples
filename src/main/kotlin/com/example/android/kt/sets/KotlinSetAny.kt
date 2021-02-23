package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(4, 5, 3, 2, -1, 7, 6, 8, 9)

    val r = nums.any { e -> e > 10 }
    if (r) println("There is a value greater than ten")
    else println("There is no value greater than ten")

    val r2 = nums.any { e -> e < 0 }
    if (r2) println("There is a negative value")
    else println("There is no negative value")
}