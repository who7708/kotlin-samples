package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main(args: Array<String>) {

    val words = setOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles")

    val words2 = words.filter { e -> e.length == 3 }
    words2.forEach { e -> print("$e ") }

    println()

    val words3 = words.filterNot { e -> e.length == 3 }

    words3.forEach { e -> print("$e ") }

    println()

    val cars = setOf(Car("Mazda", 6300), Car("Toyota", 12400),
        Car("Skoda", 5670), Car("Mercedes", 18600))

    val res = cars.filter { car -> car.price > 10000 }
    res.forEach { e -> println(e) }
}