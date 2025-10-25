package org.example

fun main() {
    var humanWin = 0
    var compWin = 0

    do {
        val humanMove = getDice()
        val compMove = getDice()
        getGame(humanMove, compMove)

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

        println("Хотите бросить кости ещё раз? Введите Да или Нет.")
        val answer = readln()
    } while (answer == "Да" || answer == "да")

    println("Человеческих побед: $humanWin\nПобед машины: $compWin")
}

fun getGame(humanMove: Int, compMove: Int) {

    println("Ваш ход $humanMove")
    println("Ход компьютера $compMove")

}

fun getDice(): Int {
    val move: Int = (1..6).random()
    return move
}