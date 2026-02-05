package org.example

fun main() {
    println("Вы можете добавить следующие виды рыб:")
    for (fish in Fish.values()) {
       println(fish.ruName)
    }
}

enum class Fish(val ruName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESEFIGHTINGFISH("Петушок"),
}