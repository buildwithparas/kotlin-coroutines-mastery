
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Started in thread: ${Thread.currentThread().name}")

    withContext(Dispatchers.IO) {
        println("Switched to IO dispatcher thread: ${Thread.currentThread().name}")
        delay(1000)
    }

    println("Back to thread: ${Thread.currentThread().name}")
}
