package org.example

fun main() {
    val hours = 9
    val minutes = 39
    val onTheWay = 457
    val timeConstant = 60
    val totalHours = (onTheWay + (hours * timeConstant)) / timeConstant
    val totalMinutes = (onTheWay + minutes) % timeConstant

    println("Прибытие поезда в %02d".format(totalHours) + ":%02d".format(totalMinutes))
}