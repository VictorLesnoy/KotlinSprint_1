package org.example

fun main() {
    val cefiro = listOf(4, 9, 11, 5, 6, 24, 1)
    println(cefiro.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}