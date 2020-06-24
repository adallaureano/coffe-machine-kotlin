import java.util.*
import kotlin.math.cos
import kotlin.math.sin

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextDouble()
    println(sin(a) - cos(a))
}
/*
fun main() {
    val movieOne = Movie("Anna Gotter")
    movieOne.length = -24
    val movieTwo = Movie("Sky Wars")
    movieTwo.length = 15
    print(movieTwo.length - movieOne.length)
}

class Movie(val name: String) {
    var length: Int = 0
        set(value) {
            field = if (value < 0) value else -value
        }
}
 */