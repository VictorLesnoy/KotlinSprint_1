package org.example

fun main() {
    val word = "абракадабра"
    println("В слове '$word' ${word.vowelCount()} гласных букв.")
}

fun String.vowelCount(): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ"
    return this.count {it in vowels}
}