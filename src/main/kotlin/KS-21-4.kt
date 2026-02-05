package org.example

import java.io.File

fun main() {
    val text = "Основной текст"
    println(text)
    val slovo = File("АБРАкадабра")
    println(slovo.keyword(text))
}

fun File.keyword(text: String): String {
        val add = this.name.lowercase()
        val result = text + " " + add
        this.writeText(result)
        return result
}