package com.example.android.kt.writefile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File

fun main() {

    val fileName = "src/main/resources/myfile3.txt"
    val myfile = File(fileName)

    val content = "Today snow is falling."

    myfile.writeText(content)

    println("Writed to file")
}