package com.example.android.kt.regularexpressions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/24
 */
fun main() {

    val sites = listOf(
        "webcode.me", "zetcode.com", "freebsd.org",
        "netbsd.org"
    )

    val pattern = "(\\w+)\\.(\\w+)".toRegex()

    for (site in sites) {

        val matches = pattern.findAll(site)

        matches.forEach { matchResult ->

            println(matchResult.value)
            println(matchResult.groupValues[1])
            println(matchResult.groupValues[2])
            println("*****************")
        }
    }
}