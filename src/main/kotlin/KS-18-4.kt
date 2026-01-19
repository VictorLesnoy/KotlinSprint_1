package org.example

import kotlin.math.pow

abstract class Parcel(
    val name: String
) {
    abstract fun area(): Double
}

class Rectangular(
    name: String,
    val height: Double,
    val length: Double,
) : Parcel(name) {
    override fun area() = height * length
}

class Cube(
    name: String,
    val side: Double,
) : Parcel(name) {
    override fun area() = side.pow(2)
}

fun main() {
    val parcel1: Parcel = Rectangular("коробка 1",20.0, 30.0)
    val parcel2: Parcel = Cube("коробка 2", 5.0)

    println("Площадь отправления '${parcel1.name}' равна ${parcel1.area()}")
    println("Площадь отправления '${parcel2.name}' равна ${parcel2.area()}")
}