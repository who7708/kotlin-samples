package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(1, 2, 3, 4, 5, 6)

    val res = nums.chunked(2).fold(0) { total, next -> total + next[0] * next[1] }

    println(res)
}