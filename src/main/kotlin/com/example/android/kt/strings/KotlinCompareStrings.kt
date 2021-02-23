package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val s1 = "Eagle"
    val s2 = "eagle"

    if (s1 == s2) {

        println("Strings are equal")
    }  else {

        println("Strings are not equal")
    }

    println("Ignoring case")

    val res = s1.compareTo(s2, true)

    if (res == 0) {

        println("Strings are equal")
    }  else {

        println("Strings are not equal")
    }
}