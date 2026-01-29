package org.example

class Robot {
    private var modifier: (String) -> String = {it}

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say(message: String) {
        println(modifier(message))
    }
}

fun main() {
    val phrases = listOf("Как твои дела ?", "Сидим весело курим", "Правильное здоровое питание", "Маленький летящий самолет", "Подумаем об этом потом")
    val phrase = phrases.random()
    val robot = Robot()

    robot.setModifier { message ->
        message
            .split(" ")
            .reversed()
            .joinToString(" ")
    }
    println(phrase)
    robot.say(phrase)
}