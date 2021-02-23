package com.example.android.kt.whens

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.time.DayOfWeek
import java.time.LocalDate

fun main() {

    val dayOfWeek: DayOfWeek = LocalDate.now().dayOfWeek

    val msg:String = when (dayOfWeek) {
        DayOfWeek.MONDAY -> "It is monday"
        DayOfWeek.TUESDAY -> "It is tuesday"
        DayOfWeek.WEDNESDAY -> "It is tuesday"
        DayOfWeek.THURSDAY -> "It is tuesday"
        DayOfWeek.FRIDAY -> "It is tuesday"
        DayOfWeek.SATURDAY -> "It is tuesday"
        DayOfWeek.SUNDAY -> "It is tuesday"
        else -> "Invalid day of week"
    }

    println(msg)
}