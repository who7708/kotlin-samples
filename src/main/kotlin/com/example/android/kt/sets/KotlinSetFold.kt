package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val expenses = setOf(20, 40, 80, 15, 25)

    val cash = 550

    val res = expenses.fold(cash) { total, next -> total - next }
    println(res)
}