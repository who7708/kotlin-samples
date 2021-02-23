package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
data class UserA(val name: String, val email: String)

fun main() {

    val u = UserA("Peter Novak", "pnovak47@gmail.com")
    println(u)

    println(u.name)
    println(u.email)

    val (name, email) = u;
    println("$name $email")

    val u2 = UserA("Peter Novak", "pnovak47@gmail.com")

    println(u == u2)
    println(u === u2)
}
