package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.util.*

fun main() {

    val nums = arrayOf(1, 2, 3, 4, 5)
    println(nums.get(0))

    nums.set(0, 0)
    println(Arrays.toString(nums))

    val nums2 = nums.plus(1)
    println(Arrays.toString(nums2))

    val slice = nums.sliceArray(1..3)
    println(Arrays.toString(slice))

    println(nums.first())
    println(nums.last())
    println(nums.indexOf(5))
}