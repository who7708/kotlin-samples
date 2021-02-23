package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = setOf("pen", "cup", "dog", "person",
        "cement", "coal", "donkey", "spectacles")

    val w1 = words.first()
    println(w1)

    val w2 = words.last()
    println(w2)

    val w3 = words.findLast { w -> w.startsWith('d') }
    println(w3)

    val w4 = words.first { w -> w.startsWith('d') }
    println(w4)
}