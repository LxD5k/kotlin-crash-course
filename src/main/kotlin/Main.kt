fun main() {
    val stringList = listOf(
        "Hello world!",
        "Bye bye!",
        "How's it going?"
    )
    val integers = listOf(1, 2, 3, 4, 69)

    val filteredString = stringList.myFilter { currentString ->
        currentString.length > 10
    }
    val filteredNumbers = integers.map { it.toDouble() }

    println(filteredString)
    println(filteredNumbers)

    val result = makeNetworkCall()
}

fun makeNetworkCall(): Result<Int, String> {
    return Result.Failure("Something went wrong")
}

fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val result = mutableListOf<T>()
    for (element in this) {
        if (predicate(element)) {
            result.add(element)
        }
    }
    return result.toList()
}

sealed interface Result<out D, out E> {
    data class Sucess<D>(val data: D) : Result<D, Nothing>
    data class Failure<E>(val error: E) : Result<Nothing, E>
}
