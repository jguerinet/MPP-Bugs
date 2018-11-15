package sample

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(string: String? = null): String {
    if (string.isNullOrBlank()) {
        return ""
    }
    return string
}