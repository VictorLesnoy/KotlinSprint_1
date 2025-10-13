package org.example

fun main() {
    val randomRange = 0..42
    val numberOne = randomRange.random()
    val numberTwo = randomRange.random()
    println("Введите первое числоот 0 до 42")
    val answerOne = readln().toInt()
    println("ВВедите второе число от 0 до 42")
    val answerTwo = readln().toInt()

    if (answerOne == numberOne && answerTwo == numberTwo || answerOne == numberTwo && answerTwo == numberOne) {
        println("Поздравляем! Вы выиграли главный приз! Загаданные числа $numberOne и $numberTwo")
    } else if (answerOne == numberOne || answerTwo == numberTwo || answerOne == numberTwo || answerTwo == numberOne) {
        println("Вы выиграли утешительный приз! Загаданные числа $numberOne и $numberTwo")
    } else {
        println("Неудача! Загаданные числа $numberOne и $numberTwo")
    }
}