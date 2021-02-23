package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = listOf(
        "pen", "cup", "dog", "person",
        "cement", "coal", "spectacles", "cup", "bread"
    )

    val w1 = words.get(0)
    println(w1)

    val w2 = words[0]
    println(w2)

    val i1 = words.indexOf("cup")
    println("The first index of cup is $i1")

    val i2 = words.lastIndexOf("cup")
    println("The last index of cup is $i2")

    val i3 = words.lastIndex
    println("The last index of the list is $i3")
}