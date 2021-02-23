package com.example.android.kt.writefile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File

fun main() {

    val fileName = "src/main/resources/myfile2.txt"
    val myfile = File(fileName)

    myfile.bufferedWriter().use { out ->

        out.write("First line\n")
        out.write("Second line\n")
    }

    println("Writed to file")
}