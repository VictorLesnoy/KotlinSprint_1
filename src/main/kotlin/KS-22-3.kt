package org.example

data class Food(
    val bread: String,
    val meat: String,
    val fruit: String,
)

fun main() {
    val food = Food(
        "батон",
        "говядина",
        "яблоко",
    )
    val (bread, meat, fruit) = food
    println("Еда: $meat, $bread, $fruit")
}