fun main() {
    print("Please enter a number: ")
    val input = readln()
    val inputAsInteger = try{
        input.toInt()
    } catch (e: NumberFormatException){
        0
    }

    val output = when (inputAsInteger) {
        3 -> "The number is three!"
        5 -> "The number is five!"
        in 10..20 -> "the number is between 10 and 20"
        else -> "I have no idea what to print!"
    }
    println(output)
}
