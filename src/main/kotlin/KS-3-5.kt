package org.example

fun main() {
    val move = "D2-D4;0"
    val (moveFrom, moveTo, moveNumber) = move.split("-", ";")
    println("Ход номер $moveNumber с клетки $moveFrom на клетку $moveTo")
}