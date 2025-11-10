package org.example

import kotlin.random.Random

class WeatherStatement (
    var dayT: Int,
    var nightT: Int,
    var rainfall: Boolean,
)

fun main() {

    val weatherMap = mutableMapOf<Int, WeatherStatement>()
    for (i in 1..30) {
        val randomDayT = Random.nextInt(-35, 35)
        val randomNightT = Random.nextInt(-35, 35)
        val randomRainfall = Random.nextBoolean()
        val weather = WeatherStatement(randomDayT, randomNightT, randomRainfall)
        weatherMap[i] = weather
    }

    val dayTemperatures = weatherMap.values.map { it.dayT }
    val nightTemperatures = weatherMap.values.map { it.nightT }

    val avgDayTemp = dayTemperatures.average()
    val avgNightTemp = nightTemperatures.average()
    val rainyDays = weatherMap.values.count { it.rainfall }

    println("Средняя дневная температура: ${"%.2f".format(avgDayTemp)}°C")
    println("Средняя ночная температура: ${"%.2f".format(avgNightTemp)}°C")
    println("Количество дождливых дней $rainyDays")
}

fun Iterable<Int>.average(): Double {
    return this.sum().toDouble() / this.count()
}