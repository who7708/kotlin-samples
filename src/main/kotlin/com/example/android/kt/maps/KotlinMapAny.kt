package com.example.android.kt.maps

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val items = mapOf("coins" to 12, "books" to 45, "cups" to 33, "pens" to 2)

    val value = 12

    val hasValue = items.any { it.value == value }

    if (hasValue) {
        println("The map has value $value")
    } else {
        println("The map does not have value $value")
    }

    val isEven: (Int) -> Boolean = { it % 2 == 0 }

    val hasEvenValue = items.any { isEven(it.value) }

    if (hasEvenValue) {
        println("The map has even value(s)")
    } else {
        println("The map does not have even value(s)")
    }
}
