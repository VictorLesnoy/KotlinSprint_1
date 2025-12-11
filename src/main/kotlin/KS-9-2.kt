package org.example

fun main() {
    val ingridients = mutableListOf( "сахар", "соль",  "масло")

    println("В рецепте есть базовые ингридиенты:")
    ingridients.forEach {
        println(it)
    }

    println("Желаете добавить еще?")
    val answer = readln()
    if (answer.equals(YES, ignoreCase = true)) {
        println("Какой ингридиент вы хотите добавить?")
        ingridients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты:")
        ingridients.forEach {
            println(it)
        }
    }
}
const val YES = "да"