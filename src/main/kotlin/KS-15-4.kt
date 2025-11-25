package org.example

interface Finding {
    fun find()
}

abstract class Musical {
    abstract val name: String
    abstract val quantity: Int
}

class Instrument(override val name: String, override val quantity: Int) : Musical(), Finding {
    override fun find() {
        println("Выполняется поиск")
    }
}

class Accessories(override val name: String, override val quantity: Int) : Musical() {

}

fun main() {
    val instrument1 = Instrument("гитара", 2)
    val accessories1 = Accessories("струны", 6)
    val accessories2 = Accessories("медиаторы", 3)

    instrument1.find()

}