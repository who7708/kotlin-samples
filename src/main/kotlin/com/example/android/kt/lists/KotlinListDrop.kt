package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)

    val nums2 = nums.drop(3)
    println(nums2)

    val nums3 = nums.dropLast(3)
    println(nums3)

    val nums4 = nums.sorted().dropWhile { e -> e < 0 }
    println(nums4)

    val nums5 = nums.sorted().dropLastWhile { e -> e > 0 }
    println(nums5)
}