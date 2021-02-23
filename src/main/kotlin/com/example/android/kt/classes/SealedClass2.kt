package com.example.android.kt.classes

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
sealed class ShapeB {
    class CircleB(var radius: Float) : ShapeB()
    class SquareB(var width: Int) : ShapeB()
    class RectangleB(var width: Int, var height: Int) : ShapeB()
}

fun getArea(e: ShapeB) =
    when (e) {
        is ShapeB.CircleB -> println("Circle area is ${Math.PI * e.radius * e.radius}")
        is ShapeB.SquareB -> println("Square area is ${e.width * e.width}")
        is ShapeB.RectangleB -> println("Rectangle area is ${e.width * e.height}")
    }

fun main() {

    val circle = ShapeB.CircleB(7f)
    val square = ShapeB.SquareB(5)
    val rectangle = ShapeB.RectangleB(8, 6)

    getArea(circle)
    getArea(square)
    getArea(rectangle)
}