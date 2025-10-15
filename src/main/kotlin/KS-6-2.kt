package org.example

fun main() {
    println("Сколько секунд нужно засечь?")
    val seconds = readln().toInt()
    var counter = 0
    do {
        println("Прошло ${counter++} секунд")
        Thread.sleep(1000)
    } while (counter <= seconds)
}