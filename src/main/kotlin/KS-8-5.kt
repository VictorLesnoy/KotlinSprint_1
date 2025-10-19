package org.example

import java.util.*

fun main() {
    var ingridients: Array<String> = arrayOf()
    println("Сколько ингридиентов планируете?")
    val ingridientsQuantity = readln().toInt()

    for (i in 0..(ingridientsQuantity - 1)) {
        println("Введите ингридиент ${i + 1}")
        ingridients += readln()
    }
    println("Ваши ингридиенты: ${Arrays.toString(ingridients)}")

}