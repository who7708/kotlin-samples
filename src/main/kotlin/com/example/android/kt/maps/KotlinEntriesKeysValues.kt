package com.example.android.kt.maps

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val items = mapOf("coins" to 12, "books" to 45, "cups" to 33)

    println("Entries: " + items.entries)
    println("Keys:" + items.keys)
    println("Values:" + items.values)
}