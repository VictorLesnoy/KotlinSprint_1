package org.example

fun main() {
    println("Введите число")
    var answer:Int = readln().toInt()
    println("Четные числа от 0 до $answer:")

    for (i in 0..answer step 2) {
        print("$i ")
    }

}