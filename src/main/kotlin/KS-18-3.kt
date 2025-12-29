open class Animals(private val name: String, private val food: String) {
    open fun eat(): String {
        return "$name -> $food."
    }
}

class Fox : Animals("Лиса", "ягоды")
class Dog : Animals("Собака", "кости")
class Cat : Animals("Кошка", "рыбу")

fun main() {
    val animals = listOf(Fox(), Dog(), Cat())
    for (beast in animals) {
        println(beast.eat())
    }
}

