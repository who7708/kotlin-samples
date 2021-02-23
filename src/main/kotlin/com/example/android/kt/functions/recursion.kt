package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun fact(num: Int): Int {

    return if (num == 1) {
        num
    } else {
        num * fact(num - 1)
    }
}

fun main() {

    val f1 = fact(5)
    val f2 = fact(8)
    val f3 = fact(12)

    println(f1)
    println(f2)
    println(f3)
}