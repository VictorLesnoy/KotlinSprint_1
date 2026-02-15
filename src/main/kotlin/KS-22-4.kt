package org.example
// Я списал это у AndroidSprint AI Mentor
// Я искал в инете объяснения каждой строке,
// но до конца не понимаю - почему именно это и именно так.
// Чувствую себя, как первоклашка, которому дали решить интеграл.
import kotlin.concurrent.thread

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()
        private set

    fun loadData() {
        thread {
            mainScreenState = MainScreenState(data = null, isLoading = false)
            println("Стейт обновлён: $mainScreenState")
            Thread.sleep(1000)

            mainScreenState = mainScreenState.copy(isLoading = true)
            println("Стейт обновлён: $mainScreenState")
            Thread.sleep(2000)

            mainScreenState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
            println("Стейт обновлён: $mainScreenState")
        }
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData ()

    Thread.sleep(4000)
}