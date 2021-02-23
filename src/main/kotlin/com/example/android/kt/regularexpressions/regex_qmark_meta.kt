package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val words = listOf("seven", "even", "prevent", "revenge", "maven",
        "eleven", "amen", "event")

    val pattern = ".?even".toRegex()

    words.forEach { word ->

        if (pattern.matches(word)) {

            println("$word matches")
        }
    }
}