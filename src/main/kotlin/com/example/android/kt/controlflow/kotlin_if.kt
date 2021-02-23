package com.example.android.kt.controlflow

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    print("Enter your age: ")

    val s_age: String? = readLine()

    if (s_age!!.isEmpty()) return

    val age:Int = s_age.toInt()

    if (age > 18) {

        println("You can obtain a driving licence")
    } else {

        println("You cannot obtain a driving licence")
    }
}