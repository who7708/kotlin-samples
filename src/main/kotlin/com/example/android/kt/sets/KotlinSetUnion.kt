package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(1, 2, 3)
    val nums2 = setOf(3, 4, 5)

    val nums3 = nums.union(nums2)

    println(nums3)
}