package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
class OuterA {

    val name1 = "Outer"
    fun show() = "the name: $name1"

    inner class InnerA {

        val name2 = "Inner"
        fun show() = "data: $name2 and $name1"
    }
}

fun main() {

    println(OuterA().show())
    println(OuterA().InnerA().show())
}