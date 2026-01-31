package org.example

class Robot {
    private var modifier: (String) -> String = {it}
    val phrases = listOf("Как твои дела ?", "Сидим весело курим", "Правильное здоровое питание", "Маленький летящий самолет", "Подумаем об этом потом")

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say(message: String) {
        println(modifier(message))
    }
}

fun main() {
    val robot = Robot()
    val phrase = robot.phrases.random()

    robot.setModifier { message ->
        message
            .split(" ")
            .reversed()
            .joinToString(" ")
    }
    println(phrase)
    robot.say(phrase)
}