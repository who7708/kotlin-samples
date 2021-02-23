package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val s = " Eagle\t"

    println("s has ${s.length} characters")

    val s1 = s.trimEnd()
    println("s1 has ${s1.length} characters")

    val s2 = s.trimStart()
    println("s2 has ${s2.length} characters")

    val s3 = s.trim()
    println("s2 has ${s3.length} characters")
}