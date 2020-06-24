import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val incomes = IntArray(n)
    val taxes = DoubleArray(n)

    for (i in 0 until n) {
        incomes[i] = scanner.nextInt()
    }

    for (i in 0 until n) {
        taxes[i] = incomes[i] * scanner.nextInt() / 100.0
    }

    var max = 0.0
    var companyIndex = 0

    for (i in 0 until n) {
        if (taxes[i] > max) {
            max = taxes[i]
            companyIndex = i + 1
        }
    }
    println(companyIndex)
}