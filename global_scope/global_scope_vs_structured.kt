
import kotlinx.coroutines.*

fun main() = runBlocking {
    GlobalScope.launch {
        println("This runs even if outer scope finishes!")
    }

    launch {
        println("This is structured concurrency.")
    }
    delay(500)
    println("End of main scope")
}
