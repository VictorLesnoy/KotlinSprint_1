package org.example

fun main() {
    val username = "Пётр"
    println({it: String -> "С наступающим Новым Годом, $it!"}(username))
}