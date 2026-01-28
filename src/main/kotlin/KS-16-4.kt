package org.example

class Order(private val number: Int) {
    private var status = "готовится"

    fun getStatus() = status

    fun changeStatus(newStatus: String) {
        status = newStatus
        println("Текущий статус заказа №$number: $status")
    }

    fun requestChangeStatus(newStatus: String) {
        println("Менеджер отправил заявку на изменение статуса.")
        changeStatus(newStatus)
    }
}

fun main() {
    val order = Order(1)
    println("Текущий статус заказа: ${order.getStatus()}")
    order.requestChangeStatus("готов к выдаче")
}