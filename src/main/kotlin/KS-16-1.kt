package org.example

class Cube {

    fun roll(): Int {
        val diceRange = 1..6
        return diceRange.random()

    }
}

fun main() {
    val dice = Cube()
    println("На кубике выпало ${dice.roll()}")
}