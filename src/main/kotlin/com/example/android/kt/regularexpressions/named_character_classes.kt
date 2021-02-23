package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val text = "We met in 2013. She must be now about 27 years old."

    val pattern = "\\d+".toRegex()
    val found = pattern.findAll(text)

    found.forEach { f ->

        val m = f.value
        println(m)
    }
}