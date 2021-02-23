package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val content = """
Currency symbols: ฿ Thailand bath, ₹ Indian rupee, ₾ Georgian lari, $ Dollar,
€ Euro, ¥ Yen, £ Pound Sterling"""

    val pattern = "\\p{Sc}".toRegex(RegexOption.IGNORE_CASE)

    val matches = pattern.findAll(content)

    matches.forEach { matchResult ->

        val currency = matchResult.value
        val idx = matchResult.range

        println("$currency at $idx")
    }
}