package org.example

fun main() {
    do {

        println("Задайте логин (не менее 4 символов)")
        val login = readln()

        println("Задайте пароль (не менее 4 символов)")
        val password = readln()

    } while (check(login, password) != true)
    println("Всё верно!")
}

fun check(login: String, password: String): Boolean {
    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные.\n ")
        return false
    }
    return true
}