package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun double(num: Int): Int = num * 2
fun triple(num: Int) = num * 3

fun main() {

    val r1 = double(3)
    val r2 = triple(3)

    println(r1)
    println(r2)
}