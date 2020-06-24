import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val length = scanner.nextInt()
    val mass = IntArray(length) // write your code here
    var triple = 0
    for (index in 0 until length) {
        mass[index] = scanner.nextInt()
        if (index > 1) {
            if (mass[index] == mass[index - 1] + 1 && mass[index - 1] == mass[index - 2] + 1) triple += 1
        }
    }
    println(triple)
}