package com.example.android.kt.getpostrequest

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import com.github.kittinunf.fuel.httpPost

fun main() {

    val (_, _, result) = "https://httpbin.org/post"
        .httpPost(listOf("name" to "John Doe", "occupation" to "gardener"))
        .responseString()
    println(result)
}