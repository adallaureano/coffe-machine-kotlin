package machine

import java.util.*;

fun main() {
    val sc = Scanner(System.`in`)
    var selectOption: String
    var coffeeOptions: String
    var amountWater = 400
    var amountMilk = 540
    var amountCoffee = 120
    var amountCups = 9
    var amountMoney = 550

    fun initialValues() {
        println()
        println("The coffee machine has:")
        println("$amountWater of water")
        println("$amountMilk of milk")
        println("$amountCoffee of coffee beans")
        println("$amountCups of disposable cups")
        println("$amountMoney of money")
        println()
    }

    fun productsAvailable() {
        println("I have enough resources, making you a coffee!")
    }

    fun coffeeAvailable() {
        println("Sorry, not enough coffee beans!")
        println()
    }

    fun waterAvailable() {
        println("Sorry, not enough water!")
    }

    fun milkAvailable() {
        println("I have enough resources, making you a coffee!")
        println()
    }

    fun cupsAvailable() {
        println("Sorry, not enough cups of coffee !")
        println()
    }

    fun getEspresso() {
        amountWater -= 250
        amountCoffee -= 16
        amountCups -= 1
        amountMoney += 4
    }

    fun buyEspresso() {
        when {
            amountWater < 250 -> {
                waterAvailable()
            }
            amountCoffee < 16 -> {
                coffeeAvailable()
            }
            amountCups < 1 -> {
                cupsAvailable()
            }
            else -> {
                productsAvailable()
                getEspresso()
                println()
            }
        }
    }

    fun getLatte() {
        amountWater -= 350
        amountMilk -= 75
        amountCoffee -= 20
        amountCups -= 1
        amountMoney += 7
    }

    fun buyLatte() {
        when {
            amountWater < 350 -> {
                waterAvailable()
            }
            amountMilk < 75 -> {
                milkAvailable()
            }
            amountCoffee < 16 -> {
                coffeeAvailable()
            }
            amountCups < 1 -> {
                cupsAvailable()
            }
            else -> {
                productsAvailable()
                getLatte()
                println()
            }
        }
    }

    fun getCappuccino() {
        amountWater -= 200
        amountCoffee -= 12
        amountMilk -= 100
        amountCups -= 1
        amountMoney += 6
    }

    fun buyCappuccino() {
        when {
            amountWater < 200 -> {
                waterAvailable()
            }
            amountCoffee < 12 -> {
                coffeeAvailable()
            }
            amountCups < 1 -> {
                cupsAvailable()
            }
            else -> {
                productsAvailable()
                getCappuccino()
                println()
            }
        }
    }

    fun fillMachine() {
        println()
        println("Write how many ml of water do you want to add:")
        val waterAdd: Int = sc.nextInt()
        println("Write how many ml of milk do you want to add:")
        val milkAdd: Int = sc.nextInt()
        println("Write how many grams of coffee beans do you want to add:")
        val coffeeAdd: Int = sc.nextInt()
        println("Write how many disposable cups of coffee do you want to add:")
        val cupsAdd: Int = sc.nextInt()
        amountWater += waterAdd
        amountMilk += milkAdd
        amountCoffee += coffeeAdd
        amountCups += cupsAdd
        println()
    }

    fun takeMoney() {
        System.out.println("I gave you $$amountMoney")
        amountMoney -= amountMoney
        println()
    }

    fun buyCoffee() {
        println()
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        coffeeOptions = sc.next()
        when (coffeeOptions) {
            "1" -> buyEspresso()
            "2" -> buyLatte()
            "3" -> buyCappuccino()
            "back" -> {
            }
            else -> throw IllegalStateException("Out of our options: $coffeeOptions")
        }
    }

    fun machineOption() {
        do {
            println("Write action (buy, fill, take, remaining, exit): ")
            selectOption = sc.next()
            when (selectOption) {
                "buy" -> buyCoffee()
                "fill" -> fillMachine()
                "take" -> takeMoney()
                "remaining" -> initialValues()
                "exit" -> {
                }
            }
        } while (selectOption != "exit")
    }

    machineOption()

}

