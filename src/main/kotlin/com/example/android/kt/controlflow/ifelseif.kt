package com.example.android.kt.controlflow

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val a = 34
    val b = 43

    if (a == b) {

        println("$a and $b are equal")
    } else if (a < b) {

        println("$a is less than $b")
    } else {

        println("$b is less than $a")
    }
}