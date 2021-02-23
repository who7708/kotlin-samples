package com.example.android.kt.datatypes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.math.BigDecimal

fun main() {

    val c = BigDecimal("1.46")
    var sum = BigDecimal("0")

    for (i in 0..99999) {

        sum = sum.add(c)
    }

    println(sum)
}
