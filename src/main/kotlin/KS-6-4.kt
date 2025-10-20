package org.example

fun main() {
    var attempts = 5
    val number = 6
    println("Угадайте число от 1 до 9 за 5 попыток.")
    do {
        println("Осталось попыток: ${attempts--}")
        println("Ваш вариант ответа:")
        var answer:Int = readln().toInt()
        if (answer == number) {
            println("Это была великолепная игра!")
            return
        }
        println("Неверно")

    } while (attempts > 0)
println("Было загадоно число $number")
}