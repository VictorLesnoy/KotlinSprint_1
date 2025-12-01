package org.example

class Circle {
    private val Pi = 3.14

    val radius = 10
    fun length() {
    println("Длина окружности равна ${2*Pi*radius}")
    }

    fun area() {
        println("Площадь окружности равна ${Pi*radius*radius}")
    }
}

fun main() {
    val circle = Circle()
    circle.length()
    circle.area()
}


