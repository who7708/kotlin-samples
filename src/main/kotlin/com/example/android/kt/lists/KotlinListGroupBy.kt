package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    val res = nums.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(res)

    val words = listOf("as", "pen", "cup", "doll", "my", "dog", "spectacles")

    val res2 = words.groupBy { it.length }
    println(res2)
}