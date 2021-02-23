package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
class Simple {

    private val name = "Simple"
    fun info() = "This is $name class"
}

fun main() {

    val s = Simple()
    println(s)
    println(s.info())
}