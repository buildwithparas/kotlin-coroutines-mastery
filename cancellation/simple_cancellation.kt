import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch { delay(2000)
    println('Job is cancelled') }
    delay(1000)
    job.cancel()
}