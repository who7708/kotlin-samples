package com.example.android.kt.ranges

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val r = (1..10)

    println(r.minOrNull())
    println(r.maxOrNull())
    println(r.sum())
    println(r.average())
}