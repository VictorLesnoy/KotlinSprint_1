package org.example

fun main() {
    val todayBooked = 13
    val tomorrowBooked = 9
    println("Доступность столиков на сегодня: ${todayBooked < NUMBER_OF_TABLES}" + "\n" +
            "Доступность столиков на завтра: ${tomorrowBooked < NUMBER_OF_TABLES}")
}
const val NUMBER_OF_TABLES = 13