package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
open class BeingA(private val alive: Boolean = true) {

    fun isAlive(): Boolean {

        return alive
    }
}

class Dog(val name: String) : BeingA() {

    fun bark(): String {

        return "woof-woof"
    }
}

fun main() {

    val d = Dog("Rusty")

    println(d.bark())
    println(d.name)
    println(d.isAlive())
}