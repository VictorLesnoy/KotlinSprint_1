package org.example

import kotlin.math.pow

abstract class Parcel(
    val name: String
) {
    abstract fun volume(): Double
}

class Rectangular(
    name: String,
    val width: Double,
    val height: Double,
    val length: Double,
) : Parcel(name) {
    override fun volume() = width * height * length
}

class Cube(
    name: String,
    val side: Double,
) : Parcel(name) {
    override fun volume() = side.pow(3)
}

fun main() {
    val parcel1: Parcel = Rectangular("коробка 1", 10.0, 20.0, 30.0)
    val parcel2: Parcel = Cube("коробка 2", 5.0)

    println("Объём отправления '${parcel1.name}' равен ${parcel1.volume()}")
    println("Объём отправления '${parcel2.name}' равен ${parcel2.volume()}")
}