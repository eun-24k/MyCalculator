package com.example.mycalculator

fun calculation(number1: Double, number2: Double, operator: Char): Double {
    var result = 0.0

    when (operator) {
        in "+" -> result = number1 + number2
        in "-" -> result = number1 - number2
        in "/" -> result = number1 / number2
        in "*" -> result = number1 * number2
    }
    return result
}