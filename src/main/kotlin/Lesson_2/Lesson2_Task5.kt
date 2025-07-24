package org.example.Lesson_2


fun main() {
        val deposit = 70000
        val percent = 16.7
        val depositTerm = 20.0
        val const1 = 1
        val const2 = 100.0

        println("Сумма через 20 лет :%.3f".format((deposit * (const1 + (percent / const2)).pow(depositTerm))))
}