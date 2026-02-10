package org.example

class Robot {
    private var modifier: (String) -> String = {it}
    private val phrases = listOf("Как твои дела?", "Сидим весело курим", "Правильное здоровое питание", "Маленький летящий самолет", "Подумаем об этом потом")

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say() {
        val message = phrases.random()
        val modified = modifier(message)
        println(modified)
    }
}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { message ->
        message
            .split(" ")
            .reversed()
            .joinToString(" ")
    }
    robot.say()
}