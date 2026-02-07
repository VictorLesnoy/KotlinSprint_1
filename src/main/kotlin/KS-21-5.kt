package org.example

fun main() {
    val skills = mutableMapOf(
        "Скорость" to 250,
        "Прыгучесть" to 1000,
        "Сообразительность" to 50,
        "Ясновидение" to 1000,
        "Лень" to 150,
    )

    println("Навык, в котором у игрока наибольшее количество очков опыта: ${skills.maxCategory()}")
}

fun Map<String, Int>.maxCategory(): String {
    return this.maxBy { it.value }.key
}