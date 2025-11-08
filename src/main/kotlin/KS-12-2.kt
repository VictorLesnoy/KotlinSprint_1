package org.example

class WeatherReport (
    var dayT: Int,
    var nightT: Int,
    var rainfall: Boolean,
){
    fun printWeather() {
        println(
            "Температура дневная $dayT, температура ночная $nightT, ${
                if (rainfall) {
                    "осадки"
                } else {
                    "без осадков"
                }
            }"
        )
    }
}

fun main() {
    val weather1 = WeatherReport(15, -2, true)
    weather1.printWeather()
}