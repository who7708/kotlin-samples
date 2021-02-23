package com.example.android.kt.getpostrequest

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import com.github.kittinunf.fuel.core.extensions.jsonBody
import com.github.kittinunf.fuel.httpPost
import com.google.gson.Gson

data class User(var name: String, var occupation: String)

fun main() {

    val user = User("John Doe", "gardener")

    val (_, _, result) = "https://httpbin.org/post".httpPost()
        .jsonBody(Gson().toJson(user).toString())
        .responseString()
    println(result)
}