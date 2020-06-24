import java.util.Scanner

internal enum class Country(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar"),
    NULL("");
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val (country1, country2) = Array(2) { input.next() }

    try {
        println(Country.valueOf(country1).currency == Country.valueOf(country2).currency)
    } catch (e: IllegalArgumentException) {
        println(false)
    }
}
/*
fun isCurrency(country_01: String, country_02: String) {
    var cControl: String? = null
    var cControl1: String? = null
    for (enum in CountryCurrency.values()) {
        if (country_01.toLowerCase() == enum.name.toLowerCase()) {
            cControl = enum.cCurrency
        }
        if (country_02.toLowerCase() == enum.name.toLowerCase()) {
            cControl1 = enum.cCurrency
        }
    }
    if (cControl == cControl1) {
        println(true)
    } else {
    println(false)
    }
    
    
    ----
    
}
 */