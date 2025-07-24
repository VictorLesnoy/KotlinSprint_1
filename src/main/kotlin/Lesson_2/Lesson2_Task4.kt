package org.example.Lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val percent = 100.0

    println("Бафф кристалической руды " + (crystalOre * buff / percent).toInt())
    println("Бафф железной руды " + (ironOre * buff / percent).toInt())
}