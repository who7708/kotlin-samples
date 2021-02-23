package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(11, 5, 3, 8, 1, 9, 6, 2)

    val sortAsc = nums.sorted()
    println(sortAsc)

    val sortDesc = nums.sortedDescending()
    println(sortDesc)

    val revNums = nums.reversed()
    println(revNums)

    val cars = listOf(
        Car("Mazda", 6300), Car("Toyota", 12400),
        Car("Skoda", 5670), Car("Mercedes", 18600)
    )

    val res = cars.sortedBy { car -> car.name }
    res.forEach { e -> println(e) }

    println("*************")

    val res2 = cars.sortedByDescending { car -> car.name }
    res2.forEach { e -> println(e) }
}