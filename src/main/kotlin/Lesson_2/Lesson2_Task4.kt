package org.example.Lesson_2

fun main() {
    val crystalOre: Int = 7
    val ironOre = 11
    val buff = 0.2

    println("Бафф кристалической руды " + (crystalOre * buff).toInt())
    println("Бафф железной руды " + (ironOre * buff).toInt())
}