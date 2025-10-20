package org.example

fun main() {
    println("Для регистрации создайте логин")
    val login = readln()
    println("Придумайте пароль")
    val password = readln()

    do {
        println("Для входа в систему введите свой логин и пароль \nЛогин:")
        val log = readln()
        println("Пароль:")
        val pass = readln()
    }while (password != pass || login != log)
    println("Авторизация прошла успешно!")
}