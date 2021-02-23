package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(4, 5, 3, 2, 1, 7, 6, 8, 9)

    val sum = nums.reduce { total, next -> total + next }
    println(sum)
}