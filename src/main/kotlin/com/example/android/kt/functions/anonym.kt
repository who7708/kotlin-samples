package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val vals = intArrayOf(-2, -1, 0, 1, 2, 3, 4)

    val filtered = vals.filter(fun(el) = el > 0)
    println(filtered)
}