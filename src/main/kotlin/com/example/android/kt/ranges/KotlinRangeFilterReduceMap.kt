package com.example.android.kt.ranges

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val rnums = (1..15)

    println(rnums)

    val r = rnums.filter { e -> e % 2 == 0 }
    println(r)

    val r2 = rnums.reduce { total, next -> next * 2 - 1 }
    println(r2)

    var r3 = rnums.map { e -> e * 5 }
    println(r3)
}