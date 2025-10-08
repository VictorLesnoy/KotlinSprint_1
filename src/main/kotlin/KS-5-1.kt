package org.example

fun main() {
    val randomRange = 0..9
    val randomNumberOne = randomRange.random()
    val randomNumberTwo = randomRange.random()
    println("Докажите, что вы не бот - решите пример: " + randomNumberOne + "+" + randomNumberTwo + "=?")
    val answer = readln().toInt()
    val ANSWER = randomNumberOne + randomNumberTwo
        if (answer == ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")}
}