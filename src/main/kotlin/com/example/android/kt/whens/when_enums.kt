package com.example.android.kt.whens

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
enum class Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

fun main() {

    val season = Season.SUMMER

    when (season) {

        Season.SPRING -> println("It is spring")
        Season.SUMMER -> println("It is summer")
        Season.AUTUMN -> println("It is autumn")
        Season.WINTER -> println("It is winter")
    }
}