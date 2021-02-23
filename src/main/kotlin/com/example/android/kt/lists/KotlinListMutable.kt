package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = mutableListOf(3, 4, 5)

    nums.add(6)
    nums.add(7)
    nums.addAll(listOf(8, 9, 10))
    nums.add(0, 0)
    nums.add(1, 1)
    nums.add(2, 2)

    println(nums)

    nums.shuffle()

    println(nums)

    nums.sort()

    println(nums)

    nums.removeAt(0)
    nums.remove(10)

    println(nums)

    nums.replaceAll { e -> e * 2 }

    println(nums)

    nums.retainAll(listOf(12, 14, 16, 18))

    println(nums)

    nums.fill(0)

    println(nums)

    nums.set(0, 22)
    println(nums[0])

    nums.clear()

    if (nums.isEmpty()) println("The list is empty")
    else println("The list is not epty")
}