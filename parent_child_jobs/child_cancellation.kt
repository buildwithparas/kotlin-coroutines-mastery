
import kotlinx.coroutines.*

fun main() = runBlocking {
    val parentJob = launch {
        val child = launch {
            try {
                delay(Long.MAX_VALUE)
            } finally {
                println("Child coroutine cancelled")
            }
        }
        delay(1000)
        println("Cancelling parent job")
        parentJob.cancel()
    }

    parentJob.join()
    println("Parent job finished")
}
