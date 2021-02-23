package com.example.android.kt.whens

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val dayOfWeek = 5

    when (dayOfWeek){
        1,2,3,4,5 -> println("weekday")
        6,7 -> println("weekend")
        else -> println("wrong value")
    }
}