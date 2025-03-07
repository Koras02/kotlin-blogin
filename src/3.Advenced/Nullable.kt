fun main() {
 var name: String? = null
  println(name?.length) // null 안전 호출

    println(name!!.length); // name이 null일 경우 예외 발생
}