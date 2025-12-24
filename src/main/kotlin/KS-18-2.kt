package org.example

import kotlin.random.Random

open class Dices {
    open fun rollTheDices() = ""
}

class Dice4(
    private val edges: Long,
) : Dices() {
    override fun rollTheDices(): String {
        return "Кубик с количеством граней $edges. Выпало число ${Random.nextInt(1, 5)}"
    }
}

class Dice6(
    private val edges: Long,
) : Dices() {
    override fun rollTheDices(): String {
        return "Кубик с количеством граней $edges. Выпало число ${Random.nextInt(1, 7)}"
    }
}

class Dice8(
    private val edges: Long,
) : Dices() {
    override fun rollTheDices(): String {
        return "Кубик с количеством граней $edges. Выпало число ${Random.nextInt(1, 9)}"
    }
}

fun main() {
    val dice4 = Dice4(4)
    dice4.rollTheDices()
    println(dice4.rollTheDices())

    val dice6 = Dice6(6)
    dice6.rollTheDices()
    println(dice6.rollTheDices())

    val dice8 = Dice8(8)
    dice8.rollTheDices()
    println(dice8.rollTheDices())

}