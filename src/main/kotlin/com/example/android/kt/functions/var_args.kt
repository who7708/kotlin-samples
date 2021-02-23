package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun mysum(vararg vals: Int): Int {

    return vals.sum()
}

fun main() {

    val s1 = mysum(1, 2, 3)
    val s2 = mysum(1, 2, 3, 4)
    val s3 = mysum(1, 2, 3, 4, 5)

    println(s1)
    println(s2)
    println(s3)
}