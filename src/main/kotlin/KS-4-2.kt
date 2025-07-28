package org.example

fun main() {
    val weight = 42
    val value = 120
    println("Груз весом $weight кг и объемом $value л соответствует категории 'Average':" +
            " ${(weight > WEIGHT_MIN) && (weight <= WEIGHT_MAX) && (value < VALUE_MAX)}")
}
const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VALUE_MAX = 100
