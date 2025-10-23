package org.example

fun main() {
    val ingridients: Array<String> = arrayOf("молоко", "мука", "сметана", "соль", "сахар")
    println(ingridients.joinToString(", "))

    do {

        println("Какой ингридиент заменим?")
        val ingridient = readln()

        if (ingridient in ingridients) {
            val order = ingridients.indexOf(ingridient)
            println("Какой ингридиент добавим?")
            val newIngridient = readln()
            ingridients[order] = newIngridient
            break
        } else {
            println("Такого ингридиента в рецепте нет.")
        }
    } while (ingridient !in ingridients)
    println("Готово! Вы сохранили следующий список:\n${ingridients.joinToString(", ")}")
}