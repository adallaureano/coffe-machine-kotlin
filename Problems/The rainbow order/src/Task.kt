import java.util.Scanner
internal enum class Rainbow(val numb: Int, val n: String) {
    RED(1, "red"),
    ORANGE(2, "orange"),
    YELLOW(3, "yellow"),
    GREEN(4, "green"),
    BLUE(5, "blue"),
    INDIGO(6, "indigo"),
    VIOLET(7, "violet");
}

fun isRainbow(color: String) {
    for (enum in Rainbow.values()) {
        if (color.toLowerCase() == enum.n) {
            println(enum.numb)
        } else {
            false
        }
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val color = input.nextLine()
    isRainbow(color)
}

/*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val color = Rainbow.valueOf(input.nextLine().toUpperCase())
    println(color.ordinal + 1)
}

enum class Rainbow {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}
 */