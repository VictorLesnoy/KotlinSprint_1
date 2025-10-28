package org.example

fun main() {

    val user1 = User2(
        id = 1,
        login = "Koptey",
        password = "dodo121",
        email = "koptey@mail.ru",
        bio = "",
    )
    println("Введите значение био: ")
    user1.bio = readln()

    println("ID: ${user1.id}\nЛогин: ${user1.login}\nПароль: ${user1.password}\nEmail: ${user1.email}\nBio: ${user1.bio}\n")

    println("Введите пароль: ")
    val getPassword = readln()

    if (getPassword == user1.password) {
        println("Введите новый пароль: ")
        user1.password = readln()
    } else println("Неверный пароль")

    println("ID: ${user1.id}\nЛогин: ${user1.login}\nПароль: ${user1.password}\nEmail: ${user1.email}\nBio: ${user1.bio}\n")
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
)