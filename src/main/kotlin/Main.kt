fun main() {
    val x = 12
    val y = 11
    val areBothEven = x % 2 == 0 || (y % 2 == 0 && x + y == 25)
    println("Is x an enven number? $areBothEven")
}
