package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.util.Arrays

fun main() {

    val nums = arrayOf(1, 2, 3, 4, 5)
    println(Arrays.toString(nums))

    val nums2 = (3..12).toList().toTypedArray()
    println(Arrays.toString(nums2))

    val nums3 = IntArray(5, { i -> i * 2 + 3})
    println(Arrays.toString(nums3))
}