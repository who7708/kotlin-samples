package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(1, 2, 3, 4, 5, 6)

    val nums2 = nums.map { e -> e * 2 }
    println(nums2)
}