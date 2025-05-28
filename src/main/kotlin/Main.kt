fun main() {
    println("Enter a string: ")
    val input = readln()

    val reversed = input.reversed()

    println(reversed)

    if (input == reversed) {
        println("That's a palindrome!")
    }
}

fun String.reversed(): String {
    val finalString = buildString {
        for (i in this@reversed.lastIndex downTo 0) {
            append(this@reversed[i])
        }
    }

    return finalString
}
