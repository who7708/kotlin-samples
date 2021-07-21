package com.example.android.kt

import org.junit.Test

/**
 * @author Chris
 * @date 2021/07/07
 * @since 1.0.0
 */
class TestBinary {
    fun Int.to32bitString(): String =
        Integer.toBinaryString(this).padStart(Int.SIZE_BITS / 2, '0')

    @Test
    fun test1() {
        val nums = listOf(1, 2, 16, 32, 256, 512, 4096, 8192)
        nums.forEach { a ->
            nums.forEach { b ->
                print("${(a or b).to32bitString()} ")
            }
            println()
        }
    }
}