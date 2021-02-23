package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun process(data: IntArray, f: (IntArray) -> Any): Any {

    return f(data)
}

fun main() {

    val values = intArrayOf(1, 2, 3, 4, 5, 6)

    val res1 = process(values, IntArray::sum)
    println(res1)

    val res2 = process(values, IntArray::average)
    println(res2)
}