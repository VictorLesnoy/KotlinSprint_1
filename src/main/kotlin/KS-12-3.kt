package org.example

class WeatherStatement (
    _dayT: Int,
    _nightT: Int,
    _rainfall: Boolean,
){
    var dayT = _dayT
    var nightT = _nightT
    var rainfall = _rainfall

    fun printWeather() {
        println(
            "Температура дневная ${dayT - KELVIN}, температура ночная ${nightT - KELVIN}, ${
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
    val weatherToday = WeatherStatement(285, 270, false)
    weatherToday.printWeather()
}
const val KELVIN = 273