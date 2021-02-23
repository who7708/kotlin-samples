package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val sentences = listOf(
        "I am looking for Jane.",
        "Jane was walking along the river.",
        "Kate and Jane are close friends."
    )

    val pattern = "^Jane".toRegex()

    sentences.forEach { sentence ->

        if (pattern.containsMatchIn(sentence)) {

            println(sentence)
        }
    }
}