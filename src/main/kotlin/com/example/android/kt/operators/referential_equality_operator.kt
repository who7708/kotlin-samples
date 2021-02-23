package com.example.android.kt.operators

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
data class Item(var name: String, var color: String)

fun main() {

    val i1 = Item("coin", "brown")
    val i2 = i1

    println("Output: ${i1 == i2}")
    println("Output: ${i1 === i2}")

    val i3 = Item("coin", "brown")
    val i4 = Item("coin", "brown")

    println("Output: ${i3 == i4}")
    println("Output: ${i3 === i4}")
}