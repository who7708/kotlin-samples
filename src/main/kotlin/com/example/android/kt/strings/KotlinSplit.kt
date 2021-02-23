package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val word = "eagle,falcon,hawk,owl"

    val birds = word.split(",")

    birds.forEach(::println)
}