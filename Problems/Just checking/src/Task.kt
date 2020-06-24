import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val arr = IntArray(size) { scanner.nextInt() }
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    for (i in 0 until arr.lastIndex) {
        if (arr[i] == a && arr[i + 1] == b || arr[i] == b && arr[i + 1] == a) {
            println("YES")
            return
        }
    }
    println("NO")
}
/*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val numbers = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val nums = IntArray(2) { scanner.nextInt() }
    var result = "NO"

    for(i in 0..numbers.size - 2)
        if((numbers[i] == nums[0] && numbers[i+1] == nums[1]) || (numbers[i] == nums[1] && numbers[i+1] == nums[0])) {
            result = "YES"
            break
        }

    println(result)
 */
