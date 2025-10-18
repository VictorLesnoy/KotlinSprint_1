package org.example

fun main() {
    val ingridients: Array<String> = arrayOf("молоко", "мука", "сметана", "соль", "сахар")

    println("Какой ингридиент ищем?")
    val ingridient = readln()

    if (ingridient in ingridients) {
        println("Ингридиент $ingridient в рецепте есть")
    } else {
        println("Такого ингридиента в рецепте нет.")
    }
}