package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    fun buildMessage(name: String?): String {

        return "Hello $name"
    }

    print("Enter your name: ")
    val name = readLine()

    val message = buildMessage(name)
    println(message)
}
