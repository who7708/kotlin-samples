package com.example.android.kt.maps

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val items = mapOf("coins" to 12, "books" to 45, "cups" to 33, "pens" to 2)

    //    println(items.get("coins"))
    println(items["coins"])

    println(items.getValue("coins"))

    println(items.getOrDefault("pens", 0))
    println(items.getOrDefault("pencils", 0))

    val nOfPencils = items.getOrElse("pencils", {
        0
    })

    println(nOfPencils)
}