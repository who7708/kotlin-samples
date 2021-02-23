package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
//class User constructor (_name: String, _email: String) {
class User(name: String, email: String) {

    private val name = name
    private val email = email

    override fun toString(): String {

        return "User $name has email $email"
    }
}

fun main() {

    val u = User("Peter Novak", "pnovak47@gmail.com")
    println(u)
}