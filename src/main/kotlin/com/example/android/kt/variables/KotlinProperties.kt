package com.example.android.kt.variables

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/23
 */
class Person {

    var name: String = ""
    var age: Int = 0

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}

fun main() {

    val p1 = Person()
    p1.name = "Peter"
    p1.age = 23

    println(p1)
}