package org.example

fun main() {
    println("Сколько секунд нужно засечь?")
    val seconds = readln().toLong()

        Thread.sleep(1000 * seconds)
        println("Прошло $seconds секунд")

}