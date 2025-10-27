package org.example.lesson_11

fun main() {

    val user1 = User(
        id = 1,
        login = "Koptey",
        password = "dodo121",
        email = "koptey@mail.ru"
    )

    val user2 = User(
        id = 2,
        login = "LoLoDash",
        password = "WARbad00",
        email = "Sergeev@mail.ru"
    )

    println("ID: ${user1.id}\nЛогин: ${user1.login}\nПароль: ${user1.password}\nEmail: ${user1.email}\n")
    println("ID: ${user2.id}\nЛогин: ${user2.login}\nПароль: ${user2.password}\nEmail: ${user2.email}\n")
}
