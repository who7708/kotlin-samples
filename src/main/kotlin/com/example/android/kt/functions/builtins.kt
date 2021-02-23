package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import kotlin.random.Random

fun main() {

    println("There is a majestic hawk in the sky")

    val r = Random.nextInt(0, 100)
    println(r)

    val word = "ocean"
    val letters = word.toCharArray()

    letters.forEach(::println)
}