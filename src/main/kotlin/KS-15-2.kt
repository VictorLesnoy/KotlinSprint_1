package org.example

abstract class WeatherStationStats {

}

class Temperature(
    val location: String,
    val temperature: Double,
) : WeatherStationStats()

class PrecipitationAmount(
    val location: String,
    val precipitation: String,
    val precipitationAmount: Int,
) : WeatherStationStats()

class WeatherServer {
    fun sendStats(stats: WeatherStationStats) {
        when (stats) {
            is Temperature -> {
                println("Температура в городе ${stats.location}: ${stats.temperature}.")
            }
            is PrecipitationAmount -> {
                println("В городе ${stats.location} выпало ${stats.precipitationAmount} мм осадка ${stats.precipitation}.")
            }
        }
    }
}

fun main() {
    val server = WeatherServer()

    val temperatureData = Temperature("Екатеринбург", -5.6)
    val precipitationData = PrecipitationAmount("Екатеринбург", "снег", 20)

    server.sendStats(temperatureData)
    server.sendStats(precipitationData)
}