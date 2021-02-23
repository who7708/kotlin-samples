package com.example.android.kt.maps

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val items = mapOf("coins" to 12, "books" to 45, "cups" to 33, "pens" to 2)

    println("Map has ${items.size} items")
    println("Map has ${items.count()} items")

    val n = items.count { it.value > 10 }
    println("# of values greater that 10: $n")
}