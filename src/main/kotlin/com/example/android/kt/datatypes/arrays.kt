package com.example.android.kt.datatypes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val numbers = IntArray(5)

    numbers[0] = 3
    numbers[1] = 2
    numbers[2] = 1
    numbers[3] = 5
    numbers[4] = 6

    val len = numbers.size

    for (i in 0 until len) {

        println(numbers[i])
    }
}