package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(4, 5, 3, 2, 1, 7, 6, 8, 9)

    val sum = nums.reduce { total, next -> total + next }
    println(sum)

    val colours = listOf("red", "green", "white", "blue", "black")

    val res = colours.reduceRight { next, total -> "$total-$next" }
    println(res)
}