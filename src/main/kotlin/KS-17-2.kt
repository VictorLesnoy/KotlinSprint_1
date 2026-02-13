package org.example

class Ship(name: String, var averageSpeed: Double, var homeport: String) {
    var name = name
        get() = field
        set(value) {
            if (value == "Fastest") {
                field = value
            } else {
                println("Имя корабля менять запрещено!")
            }
        }
}

fun main() {
    var ship = Ship("Fastest", 25.2, "London")
    println("Корабль ${ship.name}, средняя скорость ${ship.averageSpeed}, порт приписки ${ship.homeport}  ")
    ship.name = "Fast"
    println("Попытка изменить имя на: ${ship.name}")
}