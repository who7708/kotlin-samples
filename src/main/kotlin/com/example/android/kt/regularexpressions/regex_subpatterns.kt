package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val words = listOf("book", "bookshelf", "bookworm",
        "bookcase", "bookish", "bookkeeper", "booklet", "bookmark")

    val pattern = "book(worm|mark|keeper)?".toRegex()

    words.forEach { word ->

        if (pattern.matches(word)) {

            println("$word matches")
        } else {

            println("$word does not match")
        }
    }
}