
import kotlinx.coroutines.*

fun main() = runBlocking {
    supervisorScope {
        val job1 = launch {
            println("Child 1 fails")
            throw RuntimeException("Failure in Child 1")
        }
        val job2 = launch {
            delay(100)
            println("Child 2 continues")
        }
        joinAll(job1, job2)
    }
}
