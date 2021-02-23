package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun String.second(): Char = this[1]

fun main() {

    val word = "falcon"
    println(word.second())
}