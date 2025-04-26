
import kotlinx.coroutines.*

fun main() = runBlocking {
    val supervisor = SupervisorJob()
    val scope = CoroutineScope(Dispatchers.Default + supervisor)

    val job1 = scope.launch {
        println("Job1 started")
        throw RuntimeException("Job1 fails")
    }
    val job2 = scope.launch {
        delay(100)
        println("Job2 is still alive")
    }

    joinAll(job1, job2)
}
