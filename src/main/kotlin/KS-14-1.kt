package org.example

open class Liner(
        val type: String,
        val speed: Int,
        val tonnage: Int,
        val capacity: Int,
        )
class Cargo(
        type: String,
        speed: Int,
        tonnage: Int,
        capacity: Int,
): Liner(type, speed, tonnage, capacity)
class Icebreaker(
        type: String,
        speed: Int,
        tonnage: Int,
        capacity: Int,
        val superpower: String = "Колет лёд",
): Liner(type, speed, tonnage, capacity)
fun main() {
        val ship1 = Liner("Лайнер",100, 900, 5000)
        val ship2 = Cargo("Грузовой",50, 10000, 100)
        val ship3 = Icebreaker("Ледокол",50, 5000, 250)

        println("Судно 1: ${ship1.type}, скорость: ${ship1.speed}, грузоподъёмность: ${ship1.tonnage}, вместимость: ${ship1.capacity}")
        println("Судно 2: ${ship2.type}, скорость: ${ship2.speed}, грузоподъёмность: ${ship2.tonnage}, вместимость: ${ship2.capacity}")
        println("Судно 3: ${ship3.type}, скорость: ${ship3.speed}, грузоподъёмность: ${ship3.tonnage}, вместимость: ${ship3.capacity}, способность: ${ship3.superpower}")
}