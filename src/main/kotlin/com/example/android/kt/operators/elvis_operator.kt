package com.example.android.kt.operators

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = listOf("forest", null, "Bible", "sky")

    for (word in words) {

        val n = word?.length ?: 0

        println("${word} has ${n} letters")
    }
}