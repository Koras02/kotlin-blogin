// 클래스 정의
class Person(val name: String, var age: Int) {
    fun introduce() {
        println("Hello, My Name is ${name}, age is $age years old")
    }
}

// 객체 생성
fun main() {
    val person = Person("James", 30)
    person.introduce() // "Hello, My Name is James, age is 30 years old
}