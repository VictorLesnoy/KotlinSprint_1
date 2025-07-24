package org.example

fun main() {
    val hours = 9
    val minutes = 39
    val onTheWay = 457
    val timeConstant = 60
    val departure = hours * timeConstant + minutes
    val arrival = departure + onTheWay
    val totalHours = arrival / timeConstant
    val totalMinutes = arrival % timeConstant

    println("Прибытие поезда в %02d:%02d".format(totalHours, totalMinutes))
}