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

    println(sumAreas(rect1, circle))
}

fun sumAreas(vararg shapes: Shape): Double {
    return shapes.sumOf { currentShape ->
        currentShape.area.toDouble()
    }
}

interface Shape {
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
