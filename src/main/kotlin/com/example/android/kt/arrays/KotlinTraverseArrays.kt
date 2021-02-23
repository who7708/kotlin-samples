package com.example.android.kt.arrays

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = arrayOf(1, 2, 3, 4, 5, 6, 7)

    nums.forEach({ e -> print("$e ") })

    println()

    nums.forEachIndexed({ i, e -> println("nums[$i] = $e") })

    for (e in nums) {
        print("$e ")
    }

    println()

    val it: Iterator<Int> = nums.iterator()

    while (it.hasNext()) {

        val e = it.next()
        print("$e ")
    }
}