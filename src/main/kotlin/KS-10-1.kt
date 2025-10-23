package org.example

fun main() {
    var humanWin = 0
    var compWin = 0

    do {
        val humanMove = getDice()
        val compMove = getDice()
        println("Ваш ход $humanMove")
        println("Ход компьютера $compMove")
        if (humanMove > compMove) {
            println("Победило человечество!")
            humanWin += 1
        }
        if (humanMove < compMove) {
            println("Победила машина!")
            compWin += 1
        }
        if (humanMove == compMove) {
            println("Победила дружба!")
        }
        println("Еще разок? (да/нет)")
        val answer = readln()
    } while (answer == "Да" || answer == "да")

    println("Человеческих побед: $humanWin\nПобед машины: $compWin")
}

fun getDice(): Int {
    val move: Int = (1..6).random()
    return move
}