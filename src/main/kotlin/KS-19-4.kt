package org.example

enum class Bullets(val force: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var loadBullet: Bullets? = null

    fun load(bullet: Bullets) {
        loadBullet = bullet
    }

    fun shot() {
        val bullet = loadBullet
        if (bullet == null) {
            println("Нет снаряда!")
            return
        }
        println("Произведен выстрел. Нанесенный урон ${bullet.force}")
        loadBullet = null
    }
}

fun main() {
    val tank = Tank()
    tank.load(Bullets.RED)
    tank.shot()
}