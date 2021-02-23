package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val phrase = "young eagle"

    for (e in phrase) {

        print("$e ")
    }

    println()

    phrase.forEach { e -> print("%#x ".format(e.toByte())) }

    println()

    phrase.forEachIndexed { idx, e -> println("phrase[$idx]=$e ") }
}