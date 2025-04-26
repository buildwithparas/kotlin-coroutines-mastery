
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts")

    val job1 = launch {
        delay(1000)
        println("Launch coroutine done!")
    }

    val deferred = async {
        delay(500)
        "Async coroutine result"
    }

    println(deferred.await())

    job1.join()
    println("Main program ends")
}
