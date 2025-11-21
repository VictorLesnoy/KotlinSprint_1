package org.example

interface Flyable {
    fun fly()
}

interface Swimmable {
    fun swim()
}

interface Walkable {
    fun walk()
}

abstract class Creatures {
    abstract val name: String
}

class crucian(override val name: String) : Creatures(), Swimmable {
    override fun swim() {
        println("$name плавает под водой.")
    }
}

class seagull(override val name: String = "Чайка") : Creatures(), Flyable, Swimmable, Walkable {
    override fun fly() {
        println("$name летает в небе.")
    }

    override fun swim() {
        println("$name плавает по воде.")
    }

    override fun walk() {
        println("$name ходит по берегу.")
    }
}

class duck( override val name: String = "Утка") : Creatures(), Flyable, Swimmable, Walkable {
    override fun fly() {
        println("$name летает в небе.")
    }

    override fun swim() {
        println("$name плавает по воде.")
    }

    override fun walk() {
        println("$name ходит по берегу.")
    }
}

fun main() {
    val fish = crucian("Карась")
    val bird1 = seagull()
    val bird2 = duck()

    fish.swim()

    bird1.fly()
    bird1.swim()
    bird1.walk()

    bird2.fly()
    bird2.swim()
    bird2.walk()
}