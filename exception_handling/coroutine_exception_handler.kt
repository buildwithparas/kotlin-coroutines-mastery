
import kotlinx.coroutines.*

fun main() = runBlocking {
    val handler = CoroutineExceptionHandler { _, exception ->
        println("Caught exception: $exception")
    }

    val job = launch(handler) {
        throw RuntimeException("Something went wrong!")
    }
    job.join()
}
