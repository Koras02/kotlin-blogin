abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

fun main() {
    val rectangle = Rectangle(5.0, 3.0)
    println("사각형의 면적: ${rectangle.area()}") // "사각형의 면적: 15.0"
}