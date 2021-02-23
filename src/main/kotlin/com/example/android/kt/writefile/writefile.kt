package com.example.android.kt.writefile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File

fun main() {

    val fileName = "src/main/resources/myfile1.txt"
    val myfile = File(fileName)

    myfile.printWriter().use { out ->

        out.println("First line")
        out.println("Second line")
    }

    println("Writed to file")
}