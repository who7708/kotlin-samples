package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
class City(private var name: String, private var population: Int) {

    override fun toString(): String {
        return "$name has population $population"
    }
}

fun main() {

    val cities = listOf(
        City("Bratislava", 432000),
        City("Budapest", 1759000),
        City("Prague", 1280000)
    )

    cities.forEach { e -> println(e) }
}
