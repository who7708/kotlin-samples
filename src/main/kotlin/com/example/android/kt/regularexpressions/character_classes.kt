package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val words = listOf("a gray bird", "grey hair", "great look")

    val pattern = "gr[ea]y".toRegex()

    words.forEach { word ->

        if (pattern.containsMatchIn(word)) {

            println(word)
        }
    }
}