package com.example.android.kt.whens

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import java.util.Random

fun main() {

    val r:Int = Random().nextInt(10) - 5

    when {
        r < 0 -> println("negative value")
        r == 0 -> println("zero")
        r > 0 -> println("positive value")
    }
}