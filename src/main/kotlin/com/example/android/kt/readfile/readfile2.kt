package com.example.android.kt.readfile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File

fun main() {

    val fileName = "src/main/resources/thermopylae.txt"

    val myList = mutableListOf<String>()

    File(fileName).useLines { lines -> myList.addAll(lines) }

    myList.forEachIndexed { i, line -> println("${i}: " + line) }
}