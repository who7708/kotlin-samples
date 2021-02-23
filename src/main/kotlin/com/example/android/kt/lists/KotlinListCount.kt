package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)

    val len = nums.count()
    println("There are $len elements")

    val size = nums.size
    println("The size of the list is $size")

    val n1 = nums.count { e -> e < 0 }
    println("There are $n1 negative values")

    val n2 = nums.count { e -> e % 2 == 0 }
    println("There are $n2 even values")
}