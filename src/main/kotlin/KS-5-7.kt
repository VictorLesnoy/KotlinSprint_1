package org.example

fun main() {
    println("Введите расстояние поездки (в километрах)")
    val distance = readln().toDouble()
    println("Введите расход топлива на 100 км (в литрах)")
    val consumption = readln().toDouble()
    println("Введите текущую цену за литр топлива")
    val price = readln().toDouble()

    val fuelAmount = (distance * consumption) / STO
    val totalPrice = fuelAmount * price

    println(
        """Общее количество необходимого топлива $fuelAmount литра.
        |Итоговая стоимость поездки ${"%.2f".format(totalPrice)}""".trimMargin()
    )

}

const val STO = 100
