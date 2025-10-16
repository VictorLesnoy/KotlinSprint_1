package org.example

fun main() {
    val password = ('A'..'Z') + ('a'..'z') + ('0'..'9')

    do {
        print("Какая длинна пароля (не менее 6 символов)? ")
        var numbers = readln().toInt()

        if (numbers > 6) {
            for (i in 1..numbers) {
                print(password.random())
            }
            break
        }
    } while (numbers < 6)

    println("\nВаш пароль готов!")
}