
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(5) { i ->
            if (!isActive) return@launch
            println("Coroutine is working: $i")
            delay(500)
        }
    }
    delay(1200)
    println("Canceling coroutine...")
    job.cancelAndJoin()
    println("Coroutine cancelled.")
}
