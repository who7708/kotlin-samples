package com.example.android.kt.ranges

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    for (c in 'a'..'k')
        print("$c ")

    println()

    for (c in 'k' downTo 'a')
        print("$c ")
}
