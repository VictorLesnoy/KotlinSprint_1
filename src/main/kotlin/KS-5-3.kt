package org.example

fun main() {
    val randomRange = 0..42
    val numberOne = randomRange.random()
    val numberTwo = randomRange.random()
    println("Введите первое числоот 0 до 42")
    val answerOne = readln().toInt()
    println("ВВедите второе число от 0 до 42")
    val answerTwo = readln().toInt()

    if (answerOne == numberOne && answerTwo == numberTwo) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (answerOne == numberOne || answerTwo == numberTwo) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
}