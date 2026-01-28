package org.example

fun main() {
    val elements = mutableListOf("One", "Two", "Three", "Four", "Five")
    elements.forEachIndexed { index, element ->
        if (index % 2 != 0) {
            println("Нажат элемент $element (номер ${index + 1})")
        }
    }
}