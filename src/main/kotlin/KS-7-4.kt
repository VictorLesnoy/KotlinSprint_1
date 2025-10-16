package org.example

fun main() {
    println("Сколько секунд засечь?")
    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        Thread.sleep(1000)
        println("Осталось секунд $i")
    }

    println("Время вышло!")
}