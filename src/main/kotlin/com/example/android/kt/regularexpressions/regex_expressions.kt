package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val expressions = listOf("16 + 11", "12 * 5", "27 / 3", "2 - 8")
    val pattern = "(\\d+)\\s+([-+*/])\\s+(\\d+)".toRegex()

    for (expression in expressions) {

        val matches = pattern.findAll(expression)

        matches.forEach { matchResult ->

            val value1 = matchResult.groupValues[1].toInt()
            val value2 = matchResult.groupValues[3].toInt()

            val msg = when (matchResult.groupValues[2]) {

                "+" -> "$expression = ${value1 + value2}"
                "-" -> "$expression = ${value1 - value2}"
                "*" -> "$expression = ${value1 * value2}"
                "/" -> "$expression = ${value1 / value2}"
                else -> "Unknown operator"
            }

            println(msg)
        }
    }
}