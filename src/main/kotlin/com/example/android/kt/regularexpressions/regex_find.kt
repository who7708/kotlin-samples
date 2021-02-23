package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val text = "I saw a fox in the wood. The fox had red fur."

    val pattern = "fox".toRegex()

    val match = pattern.find(text)

    val m = match?.value
    val idx = match?.range

    println("$m found at indexes: $idx")

    val match2 = pattern.find(text, 11)

    val m2 = match2?.value
    val idx2 = match2?.range

    println("$m2 found at indexes: $idx2")
}