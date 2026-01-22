package org.example

enum class Gender {
    MALE,
    FEMALE,
}

data class Human( val name: String, val gender: Gender)


fun main() {
    val kartoteka = mutableListOf<Human>()
    println("Введите имя человека и его пол (1 - мужской, 2 - женский).")

    for (i in 1..5) {
        println("Введите имя:")
        val name = readln()
        println("Введите пол:")
        val inputGender = readln()
        val gender = when (inputGender.toIntOrNull()) {
            1 -> Gender.MALE
            2 -> Gender.FEMALE
            else -> {
                println("Некорректный ввод пола, установлен по умолчанию мужской")
                Gender.MALE
            }
        }
        kartoteka.add(Human(name, gender))
    }
    kartoteka.forEach { println("${it.name}, ${it.gender}") }
}