import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a: Int = sc.nextInt()
    val b: Int = sc.nextInt()
    val c: Int = sc.nextInt()
    val p = (a + b + c).toDouble() / 2
    println(sqrt(p * (p - a) * (p - b) * (p - c)))
}