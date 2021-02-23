package com.example.android.kt.sets

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = setOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles")

    words.forEach { e -> print("$e ") }
    println()

    for (word in words) {

        print("$word ")
    }

    println()

    for (i in 0 until words.size) {

        print("${words.elementAt(i)} ")
    }

    println()

    words.forEachIndexed({i, e -> println("$i - $e")})

    val it: Iterator<String> = words.asIterable().iterator()

    while (it.hasNext()) {

        val e = it.next()
        print("$e ")
    }

    println()
}