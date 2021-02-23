package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = listOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles")

    val w1 = words.first()
    println(w1)

    val w2 = words.last()
    println(w2)

    val w3 = words.findLast { w -> w.startsWith('c') }
    println(w3)

    val w4 = words.first { w -> w.startsWith('c') }
    println(w4)
}