package org.example

class Screen {
    fun draw(name: String, x: Int, y: Int) {
        println("Фигура '$name' с координатами x $x и y $y")
    }

    fun draw(name: String, x: Float, y: Float) {
        println("Фигура '$name' с координатами x $x и y $y")
    }

    fun draw(name: String, x: Int, y: Float) {
        println("Фигура '$name' с координатами x $x и y $y")
    }

    fun draw(name: String, x: Float, y: Int) {
        println("Фигура '$name' с координатами x $x и y $y")
    }
}

fun main() {
    val screen = Screen()
    screen.draw("круг", 5, 10)
    screen.draw("квадрат", 10, 20.05F)
    screen.draw("точка", -5.007F, -10.025F)
    screen.draw("круг", 50.005F, 10)
}