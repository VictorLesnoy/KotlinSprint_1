package org.example

fun main() {
    val user = Gamer("Пако", 52.8, 100.0)
        println("Полное здоровье: ${user.isHealthy()}")
}

fun Gamer.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}

class Gamer(
    val name: String,
    var currentHealth: Double,
    val maxHealth: Double,
)