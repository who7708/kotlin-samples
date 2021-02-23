package com.example.android.kt.maps

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val user = mutableMapOf("name" to "John Doe", "occupation" to "programmer")
    println(user)

    //    user.put("location", "USA")
    user["location"] = "USA"
    println(user)

    user.remove("occupation")
    println(user)

    user.clear()
    println(user)

    if (user.isEmpty()) {
        println("empty")
    } else {
        println("not empty")
    }
}