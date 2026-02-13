package org.example

class User(login: String, password: String) {
    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменён на '$value'")
        }

    private var newPassword: String = password

    var password: String
        get() = "*".repeat(newPassword.length)
        set(value) {
            println("Вы не можете изменить пароль.")
        }
}

fun main() {
    val user = User("Фёдор", "пАроль")

    println("Пароль пользователя '${user.login}': ${user.password}")

    user.login = "неФёдор"
    user.password = "пОроль"
}