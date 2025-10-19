package org.example

import java.util.*

fun main() {

    println("Сколько ингридиентов планируете?")
    val ingridientsQuantity = readln().toInt()
    val ingridients = Array(ingridientsQuantity) { "" }
    for (i in 0 until ingridientsQuantity) {
        println("Введите ингридиент ${i + 1}")
        ingridients [i] = readln()
    }
    println("Ваши ингридиенты: ${ingridients.joinToString (", ")}")

}