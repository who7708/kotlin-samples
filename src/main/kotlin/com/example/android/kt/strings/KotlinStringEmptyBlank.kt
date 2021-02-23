package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val s = "\t"

    if (s.isEmpty()) {

        println("The string is empty")
    } else {

        println("The string is not empty")
    }

    if (s.isBlank()) {

        println("The string is blank")
    } else {

        println("The string is not blank")
    }
}