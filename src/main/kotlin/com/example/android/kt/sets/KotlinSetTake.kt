package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)

    val nums2 = nums.take(3)
    println(nums2)

    val nums3 = nums.sorted().take(3)
    println(nums3)

    val nums4 = nums.takeWhile { e -> e > 0 }
    println(nums4)

    val nums5 = nums.sortedDescending().takeWhile { e -> e > 0 }
    println(nums5)

    val nums6 = nums.takeIf { e -> e.contains(6) }
    println(nums6)
}