package org.example

class SimpleBook(
    val writer: String,
    val named: String,
)

data class ScientificBook (
    val author: String,
    val title: String,
)

fun main() {
    val simple = SimpleBook("Пушкин", "Золотой петушок")

    val scient = ScientificBook("Зиберман", "Справочник по кибернетике")


    println(simple)//в простом классе выводится строковое представление объекта, имя класса и хэш
    println(scient)//в data class выводятся название дата класса и именно данные объекта
}