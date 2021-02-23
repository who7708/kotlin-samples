package com.example.android.kt.writefile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File
import java.nio.file.Files
import java.nio.file.StandardOpenOption

fun main() {

    val fileName = "src/main/resources/myfile4.txt"
    val myfile = File(fileName)

    val content = "Today snow is falling.\n"

    Files.write(myfile.toPath(), content.toByteArray(), StandardOpenOption.APPEND)
}