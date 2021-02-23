package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = listOf("tank", "boy", "tourist", "ten",
        "pen", "car", "marble", "sonnet", "pleasant",
        "ink", "atom")

    val res = words.filter { e -> startWithT(e) }
    println(res)

    val res2 = words.filter { e -> endWithK(e) }
    println(res2)
}

fun startWithT(word: String): Boolean {

    return word.startsWith("t")
}

fun endWithK(word: String): Boolean {

    return word.endsWith("k")
}