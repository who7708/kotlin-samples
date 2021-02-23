package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun power(a: Int, b: Int = 2): Int {

    if (b == 2) {

        return a * a
    }

    var value = 1

    repeat(b) {
        value *= a
    }

    return value;
}

fun main() {

    val r1 = power(3)
    println(r1)

    val r2 = power(3, 3)
    println(r2)
}