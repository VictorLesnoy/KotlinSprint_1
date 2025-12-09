package org.example

class Ship(name: String, averageSpeed: Double, homeport: String) {
    var name = name
        get() = field
        set(value: String) {
            if (value != "Fastest") {
                println("Имя корабля менять запрещено!")
            } else {
                field = value
            }
        }
    var averageSpeed = 0.0
    var homeport = "Pakistan"
}

fun main() {
    var ship = Ship("Fastest", 25.2, "London")
    println("Корабль ${ship.name}, средняя скорость ${ship.averageSpeed}, порт приписки ${ship.homeport}  ")
    ship.name = "hsdg"
    println("Попытка изменить имя: ${ship.name}")
}