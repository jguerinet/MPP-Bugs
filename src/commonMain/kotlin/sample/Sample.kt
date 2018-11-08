package sample

import kotlin.js.JsName

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

@JsName("Test")
fun hello(): String = "Hello from ${Platform.name}"