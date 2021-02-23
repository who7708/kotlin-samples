package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val words = listOf("dog", "Dog", "DOG", "Doggy")

    val pattern = "dog".toRegex(RegexOption.IGNORE_CASE)

    words.forEach { word ->

        if (pattern.matches(word)) {

            println("$word matches")
        }
    }
}