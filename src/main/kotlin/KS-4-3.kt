package org.example

fun main() {
    val weatherSun = true
    val tentOpen = true
    val airHumidity = 20
    val season = "зима"
    val conditions: Boolean = (weatherSun == WEATHER_SUN) && (tentOpen == TENT_OPEN) && (airHumidity == AIR_HUMIDITY) && !(season == SEASON_WRONG)
    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}
const val WEATHER_SUN = true
const val TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON_WRONG = "зима"