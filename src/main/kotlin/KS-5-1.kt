package org.example

fun main() {
    println("Докажите, что вы не бот - решите пример: 7+2=?")
    val answer = readln().toInt()
    if (answer == ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")}
}
const val ANSWER = 9