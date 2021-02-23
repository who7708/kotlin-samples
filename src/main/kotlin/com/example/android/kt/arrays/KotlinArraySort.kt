package com.example.android.kt.arrays

import java.util.*

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = arrayOf(7, 3, 3, 4, 5, 9, 1)

    val sortedNums = nums.sortedArray()
    println(Arrays.toString(sortedNums))

    val sortedNumsDesc = nums.sortedArrayDescending()
    println(Arrays.toString(sortedNumsDesc))
}