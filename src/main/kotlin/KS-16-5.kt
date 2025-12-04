package org.example

class Player(val name: String, initialHealth: Double, initialForce: Double) {
    private var health = initialHealth
    private var force = initialForce
    private var isAlive = true

    fun changeHealth(damage: Double) {
        if (!isAlive) {
            println("Игрок $name уже мёртв и не может получить урон.")
            return
        }

        health -= damage
        println("Игрок $name получил урон $damage, теперь его здоровье $health.")

        if (health <= 0) {
            zeroHealth()
        }
    }

    private fun zeroHealth() {
        isAlive = false
        force = 0.0
        health = 0.0
        println("Игрок $name погиб. У него здоровья $health, сила удара $force, лечение недоступно.")
    }

    fun heal(amount: Double) {
        println("Игрок $name получил лечения $amount единиц.")
        if (!isAlive) {
            println("Игрок $name мёртв, ему уже не поможет лечение.")
            return
        }

        health += amount
        println("Игрок $name восстановил здоровье на $amount, теперь его здоровье $health.")
    }

    fun play() {
        println("Игрок $name имеет здоровье $health и силу удара $force. ${if (!isAlive) {"Уже мёртв."} else {"Ещё жив."}}")
    }
}

fun main() {
    val player = Player("Иванушка", 100.0, 50.0)

    player.play()
    player.changeHealth(22.3)
    player.heal(20.0)
    player.play()
    player.changeHealth(98.4)
    player.heal(100.0)
    player.play()
}