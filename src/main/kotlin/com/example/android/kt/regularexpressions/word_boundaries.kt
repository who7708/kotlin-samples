package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val text = "This island is beautiful"
    val pattern = "\\bis\\b".toRegex()

    val matches = pattern.findAll(text)

    matches.forEach { m ->
        val v = m.value
        val idx = m.range
        println("$v found at indexes: $idx")
    }
}