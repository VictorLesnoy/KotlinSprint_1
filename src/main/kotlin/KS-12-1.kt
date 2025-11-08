package org.example

class Weather {
    var dayT: Int = 0
    var nightT: Int = 0
    var rainfall: Boolean = false

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
    val weather1 = Weather()
    val weather2 = Weather()

    weather1.dayT = 15
    weather1.nightT = -2
    weather1.rainfall = false

    weather2.dayT = 10
    weather2.nightT = -2
    weather2.rainfall = true

    weather1.printWeather()
    weather2.printWeather()
}