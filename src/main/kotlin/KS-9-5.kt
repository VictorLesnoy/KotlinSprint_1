package org.example

fun main() {
    val ingridients: MutableList<String> = mutableListOf()
    for (i in 0..4) {

         do {
             println("Ведите ингридиент ${i+1}")
            val input = readln()

            if (ingridients.contains(input)) {
                println("Такой ингридиент уже есть")
            } else {
                ingridients.add(input)
                break
            }

        }while (ingridients.contains(input))

    }
    val newIngridients = ingridients.sortedBy{it}
    val result = newIngridients.joinToString(separator = ", ", postfix = ".").replaceFirstChar { it.uppercase() }

    println("Список ингридиентов:\n$result")
}