package org.example

import kotlin.math.pow

abstract class Parcel(
    val name: String
) {
    abstract fun area(): Double
}

class Rectangular(
    name: String,
    val width: Double,
    val height: Double,
    val length: Double,
) : Parcel(name) {
    override fun area() = 2 * ((height * length) + (height * width) + (width * length))
}

class Cube(
    name: String,
    val side: Double,
) : Parcel(name) {
    override fun area() = 6 * side.pow(2)
}

fun main() {
    val parcel1: Parcel = Rectangular("коробка 1",20.0, 30.0, 10.0)
    val parcel2: Parcel = Cube("коробка 2", 5.0)

    println("Площадь поверхности отправления '${parcel1.name}' равна ${parcel1.area()}")
    println("Площадь поверхности отправления '${parcel2.name}' равна ${parcel2.area()}")
}