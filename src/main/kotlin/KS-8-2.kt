package org.example

fun main() {
    val ingridients: Array<String> = arrayOf("молоко", "мука", "сметана", "соль", "сахар")

    println("Какой ингридиент ищем?")
    val ingridient = readln()

    for (i in ingridients) {
        if (i == ingridient) {
            println("Ингридиент $i в рецепте есть")
            return
        }
    }

    println("Такого ингридиента в рецепте нет.")
}