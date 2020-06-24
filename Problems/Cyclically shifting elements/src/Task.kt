import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val length = scanner.nextInt()
    val array = arrayListOf<Int>()

    repeat(length) {
        array.add(scanner.nextInt())
    }
    //number of times to rotate
    Collections.rotate(array, 2)
    print(array.joinToString(" "))
}
/*
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val maxInd = scanner.nextInt()
    val aI = IntArray(maxInd, { scanner.nextInt() })
    for (c in 0..aI.lastIndex) {
        print("${aI[(c + aI.size - 1) % aI.size]} ")
    }
}

---
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val length = scanner.nextInt()
    val array = arrayListOf<Int>()

    repeat(length) {
        array.add(scanner.nextInt())
    }

    Collections.rotate(array, 1)
    print(array.joinToString(" "))
}


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val length = scanner.nextInt()
    val a = IntArray(length)
    val newArrays = IntArray(length)

    for (i in a.indices) {
        a[i] = scanner.nextInt()
    }

    newArrays[0] = a[length - 1]

    System.arraycopy(a, 0, newArrays, 1, a.size - 1)

    for (numbers in newArrays) {
        print("$numbers ")
    }
}
 */
