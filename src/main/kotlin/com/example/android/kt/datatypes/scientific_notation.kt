package com.example.android.kt.datatypes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.math.BigDecimal
import java.text.DecimalFormat

fun main() {

    val n = 1.235E10

    val dec = DecimalFormat("#.00")
    println(dec.format(n))

    val bd = BigDecimal("1.212e-19")

    println(bd.toEngineeringString())
    println(bd.toPlainString())
}