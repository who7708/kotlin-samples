package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = setOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles", "cup", "bread")

    val w1 = words.elementAt(0)
    println(w1)

    val i1 = words.indexOf("cup")
    println("The first index of cup is $i1")

    val i2 = words.lastIndexOf("cup")
    println("The last index of cup is $i2")
}