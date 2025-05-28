fun main() {
    println("Enter a string: ")
    val input = readln()

    val favoriteNumbers = intArrayOf(1, 2, 3, 69)
    val eventNumbers = favoriteNumbers.map {
        it * it
    }

    val lettersOnly = input.myFilter {
       isLetter()
    }

    println(eventNumbers)
}

fun String.myFilter(predicate: Char.() -> Boolean): String {
    return buildString {
        for (char in this@myFilter) {
            if (predicate(char)) {
                append(char)
            }
        }
    }
}
