package org.example

class Quiz {

    var question = "Какого цвета трава?"
        get() = field

    var answer = "зеленая"
        get() = field
        set(value) {
            field = value
        }

}

fun main() {
    val quiz = Quiz()
    println("Внимание, вопрос: ${quiz.question}")
    println("Ответ: ${quiz.answer}")

    quiz.answer = "желтая"
    println("Новый ответ: ${quiz.answer}")
}