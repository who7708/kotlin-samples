package com.example.android.kt.datatypes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import kotlin.random.Random

fun main() {

    var name = ""
    val male: Boolean = Random.nextBoolean()

    if (male) {
        name = "Robert"
    }

    if (!male) {
        name = "Victoria"
    }

    println("We will use name $name")

    println(9 > 8)
}