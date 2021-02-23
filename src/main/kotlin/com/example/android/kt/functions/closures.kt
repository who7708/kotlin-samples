package com.example.android.kt.functions

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun makeAverager(): (n: Int) -> Double {

    val nums = arrayListOf<Int>()

    return fun(num: Int): Double {

        nums.add(num)
        val total = nums.sum()

        return total.toDouble() / nums.size
    }
}


fun main() {

    val avg = makeAverager()

    println(avg(1))
    println(avg(2))
    println(avg(3))
    println(avg(4))
    println(avg(5))
}