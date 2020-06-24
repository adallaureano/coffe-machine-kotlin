import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextDouble()
    val b = scanner.nextDouble()
    val c = scanner.nextDouble()
    val halfDist = sqrt(b * b / (4.0 * a * a) - c / a)
    val root1 = -b / (2.0 * a) - halfDist
    val root2 = -b / (2.0 * a) + halfDist
    println("$root1 $root2")
}