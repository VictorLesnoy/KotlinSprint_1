package org.example

enum class Starship {
    TAKEOFF,
    LANDING,
    FIGHT;

    fun something() {
        TODO("нужна информация о дополнительной логике")
    }

    fun error() {
        throw NotImplementedError("не доделал")
    }
}

fun main() {
    Starship.FIGHT.something()
    Starship.TAKEOFF.error()
    println("Проба")
}