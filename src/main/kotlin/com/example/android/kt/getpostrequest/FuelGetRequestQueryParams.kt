package com.example.android.kt.getpostrequest

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import com.github.kittinunf.fuel.httpGet

fun main() {

    val (_, _, result) = "http://httpbin.org/get"
        .httpGet(listOf("name" to "John Doe", "occupation" to "gardener"))
        .responseString()
    println(result)
}