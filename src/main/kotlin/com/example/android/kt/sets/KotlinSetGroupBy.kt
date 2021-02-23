package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(1, 2, 3, 4, 5, 6, 7, 8)

    val res = nums.groupBy { if (it % 2 == 0) "even" else "odd" }
    println(res)

    val words = setOf("as", "pen", "cup", "doll", "my", "dog", "spectacles")

    val res2 = words.groupBy { it.length }
    println(res2)
}