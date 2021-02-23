package com.example.android.kt.readfile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File
import java.io.InputStream
import java.nio.charset.Charset

fun main() {

    val fileName = "src/main/resources/thermopylae.txt"
    val myFile = File(fileName)

    var ins: InputStream = myFile.inputStream()

    var content = ins.readBytes().toString(Charset.defaultCharset())
    println(content)
}