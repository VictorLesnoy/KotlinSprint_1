package org.example

fun main() {
    var attempts = 3

    println("Докажите, что вы не бот. Решите пример.")
    do {
        var numberOne = (0..9).random()
        var numberTwo = (0..9).random()
        println("Осталось попыток: ${attempts--}")
        println("$numberOne + $numberTwo \nВаш вариант ответа:")
        var answer:Int = readln().toInt()
        if (answer == (numberOne + numberTwo )) {
            println("Добро пожаловать!")
            return
        }
        println("Неверно")

    } while (attempts > 0)
    println("Доступ запрещен")
}