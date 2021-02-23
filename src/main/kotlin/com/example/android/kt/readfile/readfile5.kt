package com.example.android.kt.readfile

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
import java.io.File

fun main() {

    val fileName = "src/main/resources/thermopylae.txt"
    val file = File(fileName)

    var bytes: ByteArray = file.readBytes()

    bytes.forEachIndexed { i, byte ->
        (
                if (i == 0) {
                    print("${byte} ")
                } else if (i % 10 == 0) {
                    print("${byte} \n")
                } else {
                    print("${byte} ")
                })
    }
}