package org.example

class Folder(var name: String, var files: Int, secret: Boolean) {
    var secret = secret
        get() = field
        set(value) {
            field = value
            if (value) {
                name = "Скрытая папка"
                files = 0
            }
        }

    init {
        this.secret = secret
    }
}

fun main() {
    var folder = Folder("Первая", 10, true)
    println("Папка '${folder.name}', состоит из ${folder.files} вайлов, имеет гриф '${if (folder.secret == true) "секретно" else "не секретно"}' ")
}