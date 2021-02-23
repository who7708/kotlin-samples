package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun showGreeting(name: String): Unit {

    println("Hello $name")
}

fun main() {

    showGreeting("Arnold")
    showGreeting("Lucia")
}