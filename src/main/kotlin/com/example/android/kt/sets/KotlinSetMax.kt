package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val nums = setOf(11, 5, 23, 8, 1, 9, 6, 2)

    println(nums.max())

    val cars = setOf(Car("Mazda", 6300), Car("Toyota", 12400),
        Car("Skoda", 5670), Car("Mercedes", 18600))

    val car = cars.maxBy { car -> car.price }
    println("The max price is ${car?.price} of ${car?.name}")
}