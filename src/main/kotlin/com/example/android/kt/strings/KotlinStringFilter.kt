package com.example.android.kt.strings

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    fun Char.isEnglishVowel(): Boolean = this.toLowerCase() == 'a'
            || this.toLowerCase() == 'e'
            || this.toLowerCase() == 'i'
            || this.toLowerCase() == 'o'
            || this.toLowerCase() == 'u'
            || this.toLowerCase() == 'y'

    fun main() {

        val s = "Today is a sunny day."

        val res = s.filter { e -> e.isEnglishVowel() }

        println("There are ${res.length} vowels")
    }
}