package com.example.android.kt.readfile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File

fun main() {

    val fileName = "src/main/resources/thermopylae.txt"

    val content = File(fileName).readText()

    println(content)
}