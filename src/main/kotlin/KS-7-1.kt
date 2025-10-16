package org.example

fun main() {
    val password = ('a'..'z')+ ('0'..'9')
    print("Ваш пароль: ")
    for (i in 1..6) {
        print(password.random())
    }
}