import java.util.*

fun main() {
    val a = when (val letter= readLine()!!.toLowerCase()[0]) {
        'a', 'e', 'i', 'o', 'u' -> {
            letter.toInt() - 'a'.toInt() + 1
        }
        else -> 0
    }
    println(a)
}
/*
    fun isVowel(ch: Char): Boolean {
        return "aeiuoAEIUO".contains(ch.toString())
    }

    fun findPosition(inputLetter: Char): Int {
        val inputLetterToLowerCase = Character.toLowerCase(inputLetter)
        val asciiValueInput = inputLetterToLowerCase.toInt()
        return asciiValueInput - 96
    }


    val scanner = Scanner(System.`in`)
    val letter = scanner.nextLine()[0]
    println(if (isVowel(letter)) findPosition(letter) else "0")

 */