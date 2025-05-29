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

    printShapes(rect1, circle)
}

fun printShapes(vararg shapes: Shape) {
    for (shape in shapes) {
        val output = when (shape) {
            is Circle -> "Yo that's a circle"
            is Rectangle -> "That's a rect"
            else -> null
        }
        println(output)
    }
}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

sealed interface Shape {
    val area: Float
    val circumference: Float
}

data class Rectangle(
    val width: Float,
    val height: Float,
) : Shape {
    val diagonal = sqrt(width.pow(2) + height.pow(2))

    override val area = width * height

    override val circumference: Float = width.pow(2) + height.pow(2)
}

data class Circle(
    val radius: Float
) : Shape {
    override val area = radius.pow(2) * PI.toFloat()

    val diameter = radius.pow(2)

    override val circumference: Float = radius.pow(2) * PI.toFloat()
}
