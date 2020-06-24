data class City(val name: String) {
    var degrees: Int = Int.MAX_VALUE
        set(value) {
            field = if (value < -92 || value > 57) {
                when (name) {
                    "Moscow" -> 5
                    "Hanoi" -> 20
                    "Dubai" -> 30
                    else -> value
                }
            } else value
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    val coldest = listOf(firstCity, secondCity, thirdCity).sortedBy { it.degrees }
    println(if (coldest[0].degrees == coldest[1].degrees) "neither" else coldest[0].name)
}
/*
    when {
        thirdCity.degrees == secondCity.degrees || secondCity.degrees == firstCity.degrees ->
            println("")
        firstCity.degrees > secondCity.degrees && firstCity.degrees > thirdCity.degrees ->
            println(firstCity.name)
        secondCity.degrees > thirdCity.degrees && secondCity.degrees > firstCity.degrees ->
            println(secondCity.name)
        thirdCity.degrees > secondCity.degrees && thirdCity.degrees > firstCity.degrees ->
            println(thirdCity.name)
    }
 */