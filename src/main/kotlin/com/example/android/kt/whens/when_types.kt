package com.example.android.kt.whens

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
import javax.lang.model.type.ArrayType

fun main() {

    val variable: Any = 23

    when (variable) {

        is Int -> println("It is an integer")
        is String -> println("It is a string")
        is ArrayType -> println("It is an array")
    }
}