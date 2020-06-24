data class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {
    val width = rectangle.width
    val height = rectangle.height
    println(width * height)
}
