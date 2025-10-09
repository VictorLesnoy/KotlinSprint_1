package org.example

fun main() {

    val currentYear = 2025
    val userYear = readln().toInt()

    if (currentYear - userYear >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Back to main screen")
    }
}

const val AGE_OF_MAJORITY = 18