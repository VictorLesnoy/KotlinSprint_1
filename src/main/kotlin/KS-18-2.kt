package org.example

import kotlin.random.Random

open class Dices (open val edges: Int = 0){
    open fun rollTheDices(): Int {
     val result = Random.nextInt(1, edges + 1)
        return result
    }
}

class Dice4 : Dices() {override val edges: Int = 4}
class Dice6 : Dices() {override val edges: Int = 6}
class Dice8 : Dices() {override val edges: Int = 8}

fun main() {
    val dice4 = Dice4()
    println("Кубик с 4 гранями. Выпало число ${dice4.rollTheDices()}")

    val dice6 = Dice6()
    println("Кубик с 6 гранями. Выпало число ${dice6.rollTheDices()}")

    val dice8 = Dice8()
    println("Кубик с 8 гранями. Выпало число ${dice8.rollTheDices()}")

}