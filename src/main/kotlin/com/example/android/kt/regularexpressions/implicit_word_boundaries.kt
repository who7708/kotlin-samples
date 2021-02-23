package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {
    val content = """
Foxes are omnivorous mammals belonging to several genera
of the family Canidae. Foxes have a flattened skull, upright triangular ears,
a pointed, slightly upturned snout, and a long bushy tail. Foxes live on every
continent except Antarctica. By far the most common and widespread species of
fox is the red fox."""

    val pattern = "\\w+".toRegex()

    val words = pattern.findAll(content)
    val count = words.count()

    println("There are $count words")

    words.forEach { matchResult ->
        println(matchResult.value)
    }
}