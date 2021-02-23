package com.example.android.kt.operators

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
open class Base
class Derived : Base()

fun main() {

    val b = Base()
    val d = Derived()

    println(d is Base)
    println(b is Derived)
    println(d is Any)
}