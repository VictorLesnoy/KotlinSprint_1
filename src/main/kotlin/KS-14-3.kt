package org.example

import kotlin.math.PI

abstract class Figure(
    val color: String
) {
    abstract fun square(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double
) : Figure(color) {
    override fun square(): Double = PI * radius * radius
    override fun perimeter(): Double = 2 * PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun square(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}

fun main() {
    val figures = listOf<Figure>(
        Circle("чёрный", 3.0),
        Circle("белый", 50.8),
        Rectangle("чёрный", 10.0, 6.7),
        Rectangle("белый", 2.5, 80.0),
        Circle("чёрный", 15.0),
        Rectangle("белый", 10.0, 300.2)
    )

    val blackPerimeterSum = figures
        .filter { it.color == "чёрный" }
        .sumOf { it.perimeter() }

    val whiteSquareSum = figures
        .filter { it.color == "белый" }
        .sumOf { it.square() }

    println("Сумма периметров всех чёрных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteSquareSum")
}