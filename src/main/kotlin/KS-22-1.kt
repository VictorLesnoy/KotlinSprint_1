package org.example

class RegularBook(
    val writer: String,
    val named: String,
)

data class DataBook (
    val author: String,
    val title: String,
)

fun main() {
    val regular1 = RegularBook("Пушкин", "Золотой петушок")
    val regular2 = RegularBook("Пушкин", "Золотой петушок")
    val data1 = DataBook("Зиберман", "Справочник по кибернетике")
    val data2 = DataBook("Зиберман", "Справочник по кибернетике")

    println(regular1 == regular2)//сравниваются ссылки на объекты памяти
    println(data1 == data2)//в data class сравниваются именно данные
}
