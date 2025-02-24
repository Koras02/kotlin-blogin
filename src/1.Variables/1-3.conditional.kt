fun main() {
    val score = 75

    // if 문 
    if (score >= 90) {
        print("A")
    } else if (score >= 80) {
        print("B")
    } else {
        print("C")
    }

    // when 문 
    when(score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        else -> println("C")
    }
}