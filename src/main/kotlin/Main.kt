import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val rect1 = Rectangle(
        width = 5f,
        height = 7f,
    )
    val circle = Circle(
        radius = 5f,
    )

    println(circle.area)
    println("The area is ${rect1.area}. The diagonal is ${rect1.diagonal}")
}

data class Rectangle(
    val width: Float,
    val height: Float,
) {
    val diagonal = sqrt(width.pow(2) + height.pow(2))

    val area = width * height
}

data class Circle(
    val radius: Float
) {
    val area = radius.pow(2) * PI

    val diameter = radius.pow(2)
}
