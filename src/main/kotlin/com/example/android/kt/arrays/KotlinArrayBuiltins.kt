package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5)

    val avg = nums.average()
    println("The average is $avg")

    val nOfValues = nums.count()
    println("There are $nOfValues elements")

    val sumOfValues = nums.sum()
    println("The sum of values is $sumOfValues")

    // val maxValue = nums.max()
    val maxValue = nums.maxOrNull()
    println("The maximum is $maxValue")

    // val minValue = nums.min()
    val minValue = nums.minOrNull()
    println("The minimum is $minValue")
}