package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
sealed class ShapeA
class CircleA(var radius: Float) : ShapeA()
class SquareA(var width: Int) : ShapeA()
class RectangleA(var width: Int, var height: Int) : ShapeA()

fun getArea(e: ShapeA) =
        when (e) {
            is CircleA -> println("Circle area is ${Math.PI * e.radius * e.radius}")
            is SquareA -> println("Square area is ${e.width * e.width}")
            is RectangleA -> println("Rectangle area is ${e.width * e.height}")
        }

fun main() {

    val circle = CircleA(7f)
    val square = SquareA(5)
    val rectangle = RectangleA(8, 6)

    getArea(circle)
    getArea(square)
    getArea(rectangle)
}