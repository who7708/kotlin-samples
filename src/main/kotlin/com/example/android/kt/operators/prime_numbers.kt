package com.example.android.kt.operators

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
fun main() {

    val nums = intArrayOf(
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
        14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28
    )

    print("Prime numbers: ")

    for (num in nums) {

        if (num == 0 || num == 1) {
            continue
        }

        if (num == 2 || num == 3) {

            print(num.toString() + " ")
            continue
        }

        var i = Math.sqrt(num.toDouble()).toInt()

        var isPrime = true

        while (i > 1) {

            if (num % i == 0) {

                isPrime = false
            }

            i--
        }

        if (isPrime) {

            print(num.toString() + " ")
        }
    }

    print('\n')
}