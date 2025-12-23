package org.example

class Items {

    fun addItem(
        orderNumber: Long,
        type: String,
    ) {
        println("Заказан товар: $type.")
    }

    fun addItem(
        orderNumber: Long,
        type: List<String>,
    ) {
        println("Заказаны товары: $type.")
    }

}

fun main() {
    val items = Items()

    items.addItem(
        1,
        "Хлеб",
    )

    items.addItem(
        2,
        listOf("болт", "шуруп", "гвоздь")
    )

}