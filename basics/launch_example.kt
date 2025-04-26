
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Before Launch")
    launch { // A simple launch coroutine
        delay(1000)
        println("Inside Launch Coroutine")
    }
    println("After Launch")
}
