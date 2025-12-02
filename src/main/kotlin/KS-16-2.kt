package org.example

class Circle(val radius: Double = 10.0) {

    fun length(): Double {
        return 2 * Pi * radius
    }

    fun area(): Double {
        return Pi * radius * radius
    }
}

fun main() {
    val circle = Circle()
    println("Длина окружности: ${circle.length()}")
    println("Площадь круга: ${circle.area()}")
}

private const val Pi = 3.14