package org.example

class Quiz {

    var question = "Какого цвета трава?"
        get() = field

    var answer = "зеленая"
        get() = field
        set(value: String) {
            field = "желтая"
        }

}

fun main() {
    val quiz = Quiz()
    println("Внимание, вопрос: ${quiz.question}")
    println("Ответ: ${quiz.answer}")

    quiz.answer = "синяя"
    println("Новый ответ: ${quiz.answer}")
}