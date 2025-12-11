package org.example

fun main() {
    val ingridients = mutableListOf("молоко", "мука", "сметана", "соль", "сахар")

    println("В рецепте есть следующие ингредиенты:")
    ingridients.forEach {
        println(it)
    }
}