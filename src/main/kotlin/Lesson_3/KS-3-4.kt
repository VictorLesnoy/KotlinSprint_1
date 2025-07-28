package org.example.Lesson_3

fun main() {
    var moveNumber = 1
    var moveFromLetter = "E"
    var moveToLetter = "E"
    var moveFromIndex = 2
    var moveToIndex = 4
    println("Ход $moveNumber с клетки $moveFromLetter$moveFromIndex на клетку $moveToLetter$moveToIndex")

    moveNumber = 10
    moveFromLetter = "D"
    moveFromIndex = 2
    moveToLetter = "D"
    println("Ход $moveNumber с клетки $moveFromLetter$moveFromIndex на клетку $moveToLetter${moveFromIndex+1}")
}