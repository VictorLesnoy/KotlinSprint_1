package org.example

fun main() {
    println("Сколько секунд нужно засечь?")
    var seconds = readln().toInt()
    var sec = seconds
    do {
        println("Осталось секунд ${sec--}")
        Thread.sleep(1000)
    } while (0 < sec)
    println("Время вышло!")
}