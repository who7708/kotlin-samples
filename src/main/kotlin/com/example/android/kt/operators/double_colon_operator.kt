package com.example.android.kt.operators

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val c = String::class

    c.supertypes.forEach { e -> println(e) }

    val words = listOf("car", "forest", "Bible")
    println(words.map(String::length))
}