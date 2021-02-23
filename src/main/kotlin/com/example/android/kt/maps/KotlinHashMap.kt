package com.example.android.kt.maps

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val items = HashMap<String, Int>()

    items["A"] = 90
    items["B"] = 80
    items["C"] = 70

    for ((k, v) in items) {
        println("$k = $v")
    }
}