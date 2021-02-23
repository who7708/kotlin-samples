package com.example.android.kt.ranges

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val chars = ('a'..'f')
    val it = chars.iterator()

    while (it.hasNext()) {

        val e = it.next()
        println(e)
    }
}