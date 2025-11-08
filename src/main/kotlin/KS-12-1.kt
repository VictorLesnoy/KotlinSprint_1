package org.example

class weather(dayT: Int, nightT: Int, rainfall: Boolean) {

    init {
        println(
            "Температура дневная $dayT, температура ночная $nightT, ${
                if (rainfall == true) {
                    "осадки"
                } else {
                    "без осадков"
                }
            }"
        )
    }
}

fun main() {
    val weather1 = weather(15, -2, false)
    val weather2 = weather(+10, -2, true)
}