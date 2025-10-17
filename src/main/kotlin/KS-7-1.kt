package org.example

fun main() {
    val letters = ('a'..'z')
    val numbers = ('0'..'9')

    val password = StringBuilder()

    print("Ваш пароль: ")
    for (i in 0 until 6) {
        if (i % 2 == 0) {
            password.append(letters.random())
        } else {
            password.append(numbers.random())
        }
    }

    print(password)
}