package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = listOf(11, 5, 23, 8, 1, 9, 6, 2)

    println(nums.maxOrNull())

    val cars = listOf(
        Car("Mazda", 6300), Car("Toyota", 12400),
        Car("Skoda", 5670), Car("Mercedes", 18600)
    )

    val car = cars.maxByOrNull { car -> car.price }
    println("The max price is ${car?.price} of ${car?.name}")
}
