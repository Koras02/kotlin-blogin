interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Car is Running!")
    }
}

fun main() {
    val car = Car()
    car.drive() // "Car is Running"
}