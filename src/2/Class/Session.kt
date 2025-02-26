open class Animal (val name: String) {
    open fun sound() {
        println("동물이 소리를 냄")
    }
}

class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name: 멍멍!")
    }
}

fun main() {
    val dog = Dog ("백구")
    dog.sound(); // "백구: 멍멍!"
}