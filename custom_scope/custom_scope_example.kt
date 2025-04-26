
import kotlinx.coroutines.*

class MyScope: CoroutineScope by CoroutineScope(Dispatchers.Default) {
    fun launchJob() {
        launch {
            delay(500)
            println("Job done in custom scope")
        }
    }

    fun destroy() {
        cancel()
    }
}

fun main() = runBlocking {
    val scope = MyScope()
    scope.launchJob()
    delay(1000)
    scope.destroy()
}
