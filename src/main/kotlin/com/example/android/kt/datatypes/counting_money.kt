package com.example.android.kt.datatypes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val c = 1.46f
    var sum = 0f

    for (i in 0..99999) {
        sum += c
    }

    println(sum)
}