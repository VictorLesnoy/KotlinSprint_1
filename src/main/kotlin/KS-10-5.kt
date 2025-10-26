package org.example

fun main() {

    getAuthorization()

}

const val LOGIN = "StarLord"
const val PASSWORD = "pOOrD0G"

fun getAuthorization() {
    println("Введите логин:")
    val login = readlnOrNull()
    println("Введите пароль:")
    val password = readlnOrNull()

    if ((login == LOGIN) && (password == PASSWORD)) {
        getToken()
        println("Ваша корзина: яйца, хлеб, молоко")
    } else {
        println("Логин или пароль не найдены.")
        null
    }
}

fun getToken(): String {
    val symbols = ('A'..'Z') + ('a'..'z')
    var token = ""

    for (i in 0 until 32) {
        token += symbols.random()
    }
    println("Ваш токен: $token")
    return token
}