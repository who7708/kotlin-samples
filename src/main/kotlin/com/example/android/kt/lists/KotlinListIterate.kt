package com.example.android.kt.lists

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val words = listOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles")

    words.forEach { e -> print("$e ") }
    println()

    for (word in words) {

        print("$word ")
    }

    println()

    for (i in 0 until words.size) {

        print("${words[i]} ")
    }

    println()

    words.forEachIndexed({i, e -> println("words[$i] = $e")})

    val it: ListIterator<String> = words.listIterator()

    while (it.hasNext()) {

        val e = it.next()
        print("$e ")
    }

    println()
}