package org.example

fun main() {
    val user = User("Пако", 52.4, 100.0)
    val healingPotion: (User) -> Unit = {it -> it.currentHealth = it.maxHealth}
    println("Здоровье ${user.name} до лечения: ${user.currentHealth}")
    healingPotion(user)
    println("Здоровье ${user.name} после лечения: ${user.currentHealth}")
}

class User(
    val name: String,
    var currentHealth: Double,
    val maxHealth: Double,
)