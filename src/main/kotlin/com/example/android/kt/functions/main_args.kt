package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main(args: Array<String>) {
    val sumVal = args.map { it.toInt() }.sum()
    println("The sum of values is $sumVal")
}
