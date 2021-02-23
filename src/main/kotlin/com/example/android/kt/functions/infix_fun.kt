package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
class Builder {

    infix fun square(n: Int) {

        for (i in 1..n) {

            println("0".repeat(n))
        }
    }
}

fun main() {

    val builder = Builder()
    builder square 4
    println()

    builder square 6
}
