package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val text = "I saw a fox in the wood. The fox had red fur."

    val pattern = "\\W+".toRegex()
    val words = pattern.split(text).filter { it.isNotBlank() }

    println(words)
}