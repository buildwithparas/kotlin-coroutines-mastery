
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(5) { i ->
            delay(1000)
            println("Job is running: $i")
        }
    }
    delay(2000) // Simulate some work
    println("Cancelling the job")
    job.cancel() // Cancel the job
    job.join() // Wait for the cancellation to complete
    println("Job cancelled")
}
