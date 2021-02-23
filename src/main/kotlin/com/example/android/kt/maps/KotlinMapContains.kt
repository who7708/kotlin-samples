package com.example.android.kt.maps

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val items = mapOf("coins" to 12, "books" to 45, "cups" to 33, "pens" to 2)

    if (items.containsKey("cups")) {

        println("contains cups")
    } else {

        println("does not contain cups")
    }

    val value = 25

    if (items.containsValue(value)) {

        println("contains value $value")
    } else {

        println("does not contain value $value")
    }
}