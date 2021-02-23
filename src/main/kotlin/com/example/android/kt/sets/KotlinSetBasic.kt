package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = setOf(11, 5, 3, 8, 1, 9, 6, 2)

    val len = nums.count()
    val max = nums.maxOrNull()
    val min = nums.minOrNull()
    val sum = nums.sum()
    val avg = nums.average()

    val msg = """
               max: $max, min: $min,
               count: $len, sum: $sum,
               average: $avg
              """
    println(msg.trimIndent())
}