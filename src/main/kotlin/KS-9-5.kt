package org.example

fun main() {
    var ingridients: MutableList<String> = mutableListOf()
    for (i in 0..4) {

         do {
             println("Ведите ингридиент ${i+1}")
            var input = readln()

            if (ingridients.contains(input)) {
                println("Такой ингридиент уже есть")
            } else {
                ingridients.add(input)
                break
            }

        }while (ingridients.contains(input))

    }
    var newIngridients = ingridients.sortedBy{it}
    val result = newIngridients.mapIndexed { index, word ->

        if (index == 0) {
            word.replaceFirstChar { it.titlecase() }
        } else {
            word
        }

    }
    println("Список ингридиентов:\n$result")
}