package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val expenses = listOf(20, 40, 80, 15, 25)

    val cash = 550

    val res = expenses.fold(cash) {total, next -> total - next}
    println(res)
}