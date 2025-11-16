package org.example

open class Ship(
    val type: String,
    val speed: Int,
    val tonnage: Int,
    val capacity: Int,
)
class LinerShip(
    type: String,
    speed: Int,
    tonnage: Int,
    capacity: Int,
): Ship(type, speed, tonnage, capacity) {
    fun shkafut() {
        println("Лайнер выдвигает горизонтальный трап со шкафута.")
    }
}

class CargoShip(
    type: String,
    speed: Int,
    tonnage: Int,
    capacity: Int,
): Ship(type, speed, tonnage, capacity) {
    fun crane() {
        println("Грузовой корабль активирует погрузочный кран.")
    }
}
class IceBreaker(
    type: String,
    speed: Int,
    tonnage: Int,
    capacity: Int,
    val superpower: String = "Колет лёд",
): Ship(type, speed, tonnage, capacity) {
    fun gates() {
        println("Ледокол открывает ворота со стороны кормы.")
    }
}
fun main() {
    val ship1 = LinerShip("Лайнер",100, 900, 5000)
    val ship2 = CargoShip("Грузовой",50, 10000, 100)
    val ship3 = IceBreaker("Ледокол",50, 5000, 250)

    println("Судно 1: ${ship1.type}, скорость: ${ship1.speed}, грузоподъёмность: ${ship1.tonnage}, вместимость: ${ship1.capacity}")
    ship1.shkafut()
    println("Судно 2: ${ship2.type}, скорость: ${ship2.speed}, грузоподъёмность: ${ship2.tonnage}, вместимость: ${ship2.capacity}")
    ship2.crane()
    println("Судно 3: ${ship3.type}, скорость: ${ship3.speed}, грузоподъёмность: ${ship3.tonnage}, вместимость: ${ship3.capacity}, способность: ${ship3.superpower}")
    ship3.gates()
}