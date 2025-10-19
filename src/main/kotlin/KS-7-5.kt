package org.example

fun main() {
    val symbols = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    var password = ""
    do {
        print("Какая длинна пароля (не менее $LENGTH символов)? ")
        var numbers = readln().toInt()


        if (numbers >= LENGTH) {
            for (i in 1..numbers) {
                password = password + (symbols.random())
            }
            break
        }
    } while (numbers < LENGTH)

    println("Ваш пароль: $password" )
}
const val LENGTH = 6
