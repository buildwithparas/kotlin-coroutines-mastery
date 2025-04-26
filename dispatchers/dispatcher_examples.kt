
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch(Dispatchers.Default) {
        println("Running in Default: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.IO) {
        println("Running in IO: ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) {
        println("Running in Unconfined: ${Thread.currentThread().name}")
    }
}
