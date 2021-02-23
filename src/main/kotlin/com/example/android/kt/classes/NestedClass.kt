package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
class Outer {

    val name = "Outer"
    fun show() = "the name: $name"

    class Nested {
        val name = "Nested"
        fun show() = "the name: $name"
    }
}

fun main() {

    println(Outer().show())
    println(Outer.Nested().show())
}