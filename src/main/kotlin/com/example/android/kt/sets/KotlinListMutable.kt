package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = mutableSetOf(3, 4, 5)

    nums.add(6)
    nums.add(7)
    nums.addAll(setOf(8, 9, 10))

    println(nums)

    nums.remove(10)

    println(nums)

    nums.retainAll(setOf(12, 14, 16, 18))

    println(nums)

    nums.clear()

    if (nums.isEmpty()) println("The set is empty")
    else println("The set is not epty")
}