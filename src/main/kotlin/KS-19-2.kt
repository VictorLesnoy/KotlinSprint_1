package org.example

fun main() {
    val items = Items()

    items.addItem(
        "штаны",
        100,
        Goods.CLOTHES
    )
    println("")

    items.addItem(
        "карандаши",
        620,
        Goods.STATIONERY
    )
    println("")

    items.addItem(
        "ноутбук",
        999,
        Goods.OTHERS
    )
    println("")
}

enum class Goods(val category: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHERS("Разное"),
}

class Items {
    fun addItem(
        name: String,
        id: Int,
        category: Goods,
    ) {
        println("Заказан товар '$name', id $id, категория '${category.category}'")
    }
}