package org.example

interface Movable {
    fun startMove() {
        println("Машина поехала.")
    }

    fun stopMove() {
        println("Машина остановилась.")
    }
}

interface Passengering {
    fun passenger()
}

interface Cargoing {
    fun cargo()
}

abstract class Automobiles : Movable {
    abstract val type: String
    abstract val capacity: Int
    abstract val tonnage: Int
}

class Truck(override val type: String, override val capacity: Int, override val tonnage: Int) : Automobiles(),
    Passengering, Cargoing {
    override fun passenger() {
        println("$type везет пассажиров: $capacity чел.")
    }

    override fun cargo() {
        println("$type везет груз: $tonnage т.")
    }
}

class Car(override val type: String, override val capacity: Int, override val tonnage: Int) : Automobiles(),
    Passengering {
    override fun passenger() {
        println("$type везет пассажиров: $capacity чел.")
    }
}

fun main() {
    val truck1 = Truck("Грузовик", 1, 2)
    val truck2 = Truck("Фура", 1, 25)
    val car1 = Car("Автобус", 25, 0)

    truck1.startMove()
    truck1.passenger()
    truck1.cargo()
    println(" ")
    truck2.startMove()
    truck2.passenger()
    truck2.cargo()
    truck2.stopMove()
    println(" ")
    car1.startMove()
    car1.passenger()
    car1.stopMove()
}