package org.example

fun main() {
    val randomRange = (0..42)
    val randomNumber = List(3) { randomRange.random() }
    println("Введите через пробел три числа от 0 до 42")
    val answer = readln().split(' ').map { it.toInt() }
    val concidences = (answer.intersect(randomNumber)).size

    when (concidences) {
        0 -> println("Неудача! Вы не угадали ни одного числа.")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли крупный приз!")
        3 -> println("Поздравляем! Вы выиграли джекпот!")
    }

    println("Выигрышные числа:${randomNumber[0]}, ${randomNumber[1]}, ${randomNumber[2]}")
}