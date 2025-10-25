package org.example

fun main() {
    val login = getLogin()
    val password = getPassword()
    if ((login == LOGIN) && (password == PASSWORD)) {
        getToken()
        println("Ваша корзина: яйца, хлеб, молоко")
    } else {
        println("Логин или пароль не найдены.")
        null
    }

}

const val LOGIN = "StarLord"
const val PASSWORD = "pOOrD0G"

fun getLogin(): String? {
    println("Введите логин:")
    return readlnOrNull()
}

fun getPassword(): String? {
    println("Введите пароль:")
    return readlnOrNull()
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