package org.example

class Folder(name: String, files: Int, var secret: Boolean) {

    var name = name
        set(value) {
            field = if (secret) "скрытая папка" else value
        }


    var files = files
        set(value) {
            field = if (secret) 0 else value
        }

    init {
        this.name = name
        this.files = files
    }

}


fun main() {
    var folder = Folder("Первая", 10, true)
    println("Папка '${folder.name}', состоит из ${folder.files} вайлов, имеет гриф '${if (folder.secret) "секретно" else "не секретно"}' ")
}