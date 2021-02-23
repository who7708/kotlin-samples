package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val a = true
    val b = false

    var res: Boolean

    res = a and b // a.and(b)
    println("a and b = $res")

    res = a or b // a.or(b)
    println("a or b = $res")
}