
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(5) { i ->
            yield()
            println("Processing $i")
            delay(500)
        }
    }
    delay(1000)
    println("Requesting cancel...")
    job.cancelAndJoin()
    println("Cancelled safely after yield check.")
}
