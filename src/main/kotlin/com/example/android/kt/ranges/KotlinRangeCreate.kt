package com.example.android.kt.ranges

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    for (i in 1..30)
        print("$i ")

    println()

    for (i in 30 downTo 1)
        print("$i ")

    println()

    for (i in 1.rangeTo(30))
        print("$i ")

    println()

    for (i in 30.downTo(1))
        print("$i ")

    println()
}