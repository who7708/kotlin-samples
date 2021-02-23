package com.example.android.kt.ranges

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    for (e in 1..20 step 2) {
        print("$e ")
    }

    println()

    for (e in 1..20 step 5) {
        print("$e ")
    }

    println()

    println((1..10 step 2).last)
    println((1..10 step 3).first)
    println((1..10 step 4).step)

    println()
}