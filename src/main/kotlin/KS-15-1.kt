package org.example

interface Movable {

    fun move()

}

abstract class Creatures : Movable {
    abstract val name: String
}

class crucian(override val name: String) : Creatures() {
    override fun move() {
        println("$name плавает под водой.")
    }
}

class seagull( override val name: String = "Чайка") : Creatures() {
    override fun move() {
        println("$name летает в небе и плавает по воде.")
    }
}

class duck( override val name: String = "Утка") : Creatures() {
    override fun move() {
        println("$name летает в небе и плавает по воде.")
    }
}

fun main() {
    val fish = crucian("Карась")
    val bird1 = seagull()
    val bird2 = duck()

    fish.move()
    bird1.move()
    bird2.move()
}