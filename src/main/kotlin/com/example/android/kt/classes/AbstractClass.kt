package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
abstract class Shape() {

    abstract var w: Int
    abstract var h: Int

    abstract fun area(): Int

    fun info(): String {
        return "width: $w; height: $h"
    }
}

class Rectangle(override var w: Int, override var h: Int) : Shape() {

    override fun area(): Int {
        return w * h;
    }
}

fun main() {

    val r = Rectangle(5, 6)
    println(r.area())
    println(r.info());
}