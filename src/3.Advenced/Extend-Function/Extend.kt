fun main() {
    fun String.addExclamation() = this + "!"
    var greeting = "Hello".addExclamation() // result: Hello!
    println(greeting)
}