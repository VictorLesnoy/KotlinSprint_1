package org.example

fun main() {
    println("Введите длину пароля")
    val length = readln().toInt()
    val password = getPassword(length)

    println("Сгенерированный пароль: $password")
}

fun getPassword(length: Int): String {
    val digits = "0123456789"
    val symbols = "!\"#\$%&'()*+,-./ "
    var password = ""

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password += symbols.random()
        } else {
            password += digits.random()
        }
    }
    return password
}