package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)

    val r = nums.contains(4)

    if (r) println("The list contains 4")
    else println("The list does not contain 4")

    val r2 = nums.containsAll(listOf(1, -1))

    if (r2) println("The list contains -1 and 1")
    else println("The list does not contain -1 and 1")
}