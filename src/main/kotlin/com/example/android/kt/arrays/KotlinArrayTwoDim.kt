package com.example.android.kt.arrays

import java.util.*

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val array = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6, 7)
    )

    println(Arrays.deepToString(array))
}
