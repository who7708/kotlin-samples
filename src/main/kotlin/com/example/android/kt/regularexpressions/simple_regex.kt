package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val words = listOf(
        "book", "bookworm", "Bible",
        "bookish", "cookbook", "bookstore", "pocketbook"
    )

    val pattern = "book".toRegex()

    println("*********************")
    println("containsMatchIn function")

    words.forEach { word ->
        if (pattern.containsMatchIn(word)) {
            println("$word matches")
        }
    }

    println("*********************")
    println("matches function")

    words.forEach { word ->
        if (pattern.matches(word)) {
            println("$word matches")
        }
    }
}