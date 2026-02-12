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

    fun loadData(onStateChanged: (MainScreenState) -> Unit) {

        thread {

            mainScreenState = MainScreenState(data = null, isLoading = false)
            onStateChanged(mainScreenState)
            Thread.sleep(1000)

            mainScreenState = MainScreenState(data = null, isLoading = true)
            onStateChanged(mainScreenState)
            Thread.sleep(2000)

            mainScreenState = MainScreenState(data = "Данные загружены", isLoading = false)
            onStateChanged(mainScreenState)
        }
    }
}

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.loadData { state ->
        println("Текущий стейт: $state")
    }

    Thread.sleep(4000)
}