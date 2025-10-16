package org.example

fun main() {
    do {
        val numbers = 1000..9999
        val randomNumber = numbers.random()
        println("Ваш код авторизации: $randomNumber")
        println("Введите код авторизации.")
        var answer:Int = readln().toInt()
    } while (randomNumber != answer)

    println("Всё верно. Приветствую вас!")
}