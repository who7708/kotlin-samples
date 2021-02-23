package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val words = listOf("Jane", "Thomas", "Robert",
        "Lucy", "Beky", "John", "Peter", "Andy")

    val pattern = "Jane|Beky|Robert".toRegex()

    words.forEach { word ->

        if (pattern.matches(word)) {

            println(word)
        }
    }
}
