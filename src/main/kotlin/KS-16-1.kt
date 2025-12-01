package org.example

import kotlin.random.Random

class Cube {

    fun roll() {
        val randomNumber = Random().nextInt(1,7)
        println("На кубике выпало $randomNumber")
    }

}

fun main() {
    val dice = Cube()
    dice.roll()
}