package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(1, 2, 3, 4, 5, 6)

    val nums2 = nums.map { e -> e * 2 }
    println(nums2)
}