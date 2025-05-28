fun main() {
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val favoriteNumbers = intArrayOf(1, 2, 3, 69) + 4
    favoriteNumbers[2] = 69

    if (inputAsInteger != null && inputAsInteger in 0..favoriteNumbers.lastIndex) {
        println("Your number is ${favoriteNumbers[inputAsInteger]}")
    } else {
        println("That index doesn't exist")
    }
}
