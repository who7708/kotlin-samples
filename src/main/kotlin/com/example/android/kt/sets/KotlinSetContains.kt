package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)

    val r = nums.contains(4)

    if (r) println("The set contains 4")
    else println("The set does not contain 4")

    val r2 = nums.containsAll(setOf(1, -1))

    if (r2) println("The set contains -1 and 1")
    else println("The set does not contain -1 and 1")
}