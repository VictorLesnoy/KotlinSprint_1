package org.example

fun main() {
    println("Введите 5 ингридиентов блюда, через запятую с пробелом.")
    val input = readLine()
    val  ingridients = input?.split(", ")
    val newIngridients = ingridients?.sortedBy { it }
    println("Новый порядок ингридиентов:\n$newIngridients")
}