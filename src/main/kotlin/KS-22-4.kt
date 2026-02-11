package org.example
// Столько букв в задании - я не осилил.
// Написал то, что смог понять.
// Хотя не понял зачем это и к чему.
// Надеюсь на пояснительную бригаду.
// Не хочется списывать - хочется самому дойти до решения.
// Хоть что-то угадал? )))
class MainScreenViewModel() {
    fun loadData() {
        println("Отсутствие данных")
        println("Загрузка данных")
        println("Наличие загруженных данных")
    }

    override fun toString(): String {
        return "отсутствие данных\nзагрузка данных\nналичие загруженных данных"
    }
}

data class MainScreenState(
    val data: String,
    val isLoading: Boolean = false
)

fun main() {
    val mainScreen = MainScreenState("работает")
    val mainScreen1 = mainScreen.copy(isLoading = true)
    println(mainScreen1)
    val mainView = MainScreenViewModel()
    println(mainView)
    println(mainView.loadData())
}