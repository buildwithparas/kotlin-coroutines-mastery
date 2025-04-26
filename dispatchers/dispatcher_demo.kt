import kotlinx.coroutines.*

fun main() = runBlocking {
    launch(Dispatchers.IO) { println('Running on IO thread') }
    launch(Dispatchers.Main) { println('Running on Main thread') }
}