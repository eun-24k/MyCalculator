package com.example.mycalculator
// Level 1
// 더하기, 빼기, 나누기, 곱하기 연산 수행하기

fun main(number1: Int, operator: String, number2: Int): Double {
    var answer = 0
    var number1 = 4
    var operator = "*"
    var number2 = 3

    when (operator) {
        in "+" -> answer = number1 + number2
        in "-" -> answer = number1 - number2
        in "/" -> answer = number1 / number2
        in "*" -> answer = number1 * number2
    }
    return answer.toDouble()
}



