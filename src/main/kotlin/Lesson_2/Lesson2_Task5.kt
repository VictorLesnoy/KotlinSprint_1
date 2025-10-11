package org.example.Lesson_2

import kotlin.math.pow

fun main() {
        val deposit = 70000
        val percent = 16.7
        val depositTerm = 20.0
        val baseRate = 1
        val hundred = 100.0

        println("Сумма через 20 лет :%.3f".format((deposit * (baseRate + (percent / hundred)).pow(depositTerm))))
}