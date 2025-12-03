package org.example

private val password = "duster111"

class User {
    val enteringPassword = "Duster111"

    fun checkPassword(): Boolean {
        return password == enteringPassword
    }

}

fun main() {
    val user = User()

    if (user.checkPassword()) {
        println("Пароль введен верно")
    } else {
        println("Пароль введен неверно.")
    }
}