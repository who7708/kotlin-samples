package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun square(x: Int): Int {

    return x * x
}

fun square2(x: Int): Int = x * x


fun main() {

    println(square(5))
    println(square2(6))
}