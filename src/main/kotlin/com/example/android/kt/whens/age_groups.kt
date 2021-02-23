package com.example.android.kt.whens

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val age = 40

    when (age) {
        in 0..14 -> println("children")
        in 15..24 -> println("youth")
        in 25..64 -> println("adults")
        in 65..120 -> println("seniors")
        in 120..130 -> println("unlikely age")
        else -> println("wrong age value")
    }
}