package com.example.android.kt.datatypes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.math.BigInteger

fun main() {

    println(Long.MAX_VALUE)

    val b = BigInteger("92233720368547758071")
    val c = BigInteger("52498235605326345645")

    val a = b.multiply(c)

    println(a)
}