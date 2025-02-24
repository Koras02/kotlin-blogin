fun add(a: Int, b: Int): Int {
    return a + b
}

// 표현식 함수
fun multiply(a: Int, b: Int) = a * b


// 함수 호출 
fun main() {
    val sum = add(5,3)
    println("Sum: $sum") // Sum: 8

    val product = multiply(4,2)
    println("Product: $product") // Product: 8
}