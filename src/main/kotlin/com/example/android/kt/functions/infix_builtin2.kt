package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */

fun main() {

    val regex = Regex("[tT]rue|[yY]es")
    val values = arrayOf("yes", "no", "YES", "True", "null", "")

    values.forEach { value ->
        if (value matches regex) println("$value matches")
        else println("$value does not match")
    }
}