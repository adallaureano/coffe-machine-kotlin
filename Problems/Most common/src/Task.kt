import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val words = mutableMapOf<String, Int>()
    while (true) {
        val word = scanner.next()
        if (word == "stop") break
        words[word] = words.getOrDefault(word, 0) + 1
    }
    print(words.maxBy { it.value }?.key)
}
