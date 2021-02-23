package com.example.android.kt.operators

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    //    val words = listOf("forest", null, "Bible", "sky")
    val words = listOf("forest", "Bible", "sky")

    var nOfChars: Int = 0

    for (word in words) {

        val n = word!!.length
        nOfChars += n
    }

    println("There are ${nOfChars} characters in the list")
}