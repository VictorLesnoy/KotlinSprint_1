package org.example

class Player(
    val name: String,
    var key: Boolean,
)

fun main() {
    val player = Player("Жора", true)
    val keyVerification: (Player) -> Unit = {
        if (it.key) {
            println("Игрок ${it.name} открыл дверь.")
        } else {
            println("Дверь заперта.")
        }
    }
    println("Проверяем наличие ключа: ")
    keyVerification(player)
}