package org.example

fun main() {
    val hours = 9
    val minutes = 39
    val onTheWay = 457
    val departure = hours * TIME + minutes
    val arrival = departure + onTheWay
    val totalHours = arrival / TIME
    val totalMinutes = arrival % TIME

    println("Прибытие поезда в %02d:%02d".format(totalHours, totalMinutes))
}
const val TIME = 60