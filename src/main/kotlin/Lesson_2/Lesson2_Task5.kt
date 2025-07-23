package org.example.Lesson_2

fun main() {
        val deposit = 70000
        val percent = 16.7
        val depositTerm = 20.0

        println("Сумма через 20 лет :%.3f".format((deposit * (Math.pow((1 + (percent / 100.0)),depositTerm)))))
}