package com.example.android.kt.operators

import java.util.*

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = arrayOf("kind", "massive", "atom", "car", "blue")

    Arrays.sort(words) { s1: String, s2: String -> s1.compareTo(s2) }

    println(Arrays.toString(words))
}