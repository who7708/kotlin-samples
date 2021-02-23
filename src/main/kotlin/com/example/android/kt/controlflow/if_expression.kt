package com.example.android.kt.controlflow

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val a = 34
    val b = 43

    val max = if (a > b) a else b

    println("max of $a and $b is $max")
}