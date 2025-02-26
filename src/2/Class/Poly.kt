fun makeSound(animal: Animal) {
    animal.sound()
}

fun main() {
    val dog = Dog("백구")
    makeSound(dog)  // "백구: 멍멍!"
}