
import kotlinx.coroutines.*

suspend fun fakeApiCall1(): String {
    delay(1000)
    return "Result from API 1"
}

suspend fun fakeApiCall2(): String {
    delay(1500)
    return "Result from API 2"
}

fun main() = runBlocking {
    val result1 = async { fakeApiCall1() }
    val result2 = async { fakeApiCall2() }

    println("Results: ${result1.await()}, ${result2.await()}")
}
