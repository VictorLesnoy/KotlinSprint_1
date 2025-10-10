package org.example

fun main() {
    val randomRange = 0..42
    val randomNumberOne = randomRange.random()
    val randomNumberTwo = randomRange.random()
    val randomNumberThree = randomRange.random()
    //println("$randomNumberOne, $randomNumberTwo, $randomNumberThree")
    println("Введите первое числоот 0 до 42")
    val answerOne = readln().toInt()
    println("ВВедите второе число от 0 до 42")
    val answerTwo = readln().toInt()
    println("ВВедите третье число от 0 до 42")
    val answerThree = readln().toInt()
    if (answerOne == randomNumberOne && answerTwo == randomNumberTwo && answerThree ==randomNumberThree) {
        println("Поздравляем! Вы выиграли джекпот!")
    } else if ((answerOne == randomNumberOne && answerTwo == randomNumberTwo && answerThree !=randomNumberThree) || (answerOne == randomNumberOne && answerTwo != randomNumberTwo && answerThree ==randomNumberThree) || (answerOne != randomNumberOne && answerTwo == randomNumberTwo && answerThree ==randomNumberThree)) {
        println("Поздравляем! Вы выиграли крупный приз!")
    } else if (answerOne == randomNumberOne || answerTwo == randomNumberTwo || answerThree == randomNumberThree) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача! Вы не угадали ни одного числа.")

    }
    println("Выигрышные числа:$randomNumberOne, $randomNumberTwo, $randomNumberThree")
}