package com.example.mycalculator


fun main(): Double {
    print("Type the equation without space: ")
    val stringInput = readLine()!!
    var inputArray = stringInput.toCharArray()

    // first calculation
    var operator = inputArray[0]
    var number1 = inputArray[1].digitToInt().toDouble()
    var number2 = inputArray[2].digitToInt().toDouble()
    var answer = calculation(number1, number2, operator)

    if (inputArray.size > 3) {
        for (i in 3 until inputArray.size step 2) {
            var operator = inputArray[i]
            var number1 = answer
            var number2 = inputArray[i + 1].digitToInt().toDouble()

            answer = calculation(number1, number2, operator)

        }
    }

    return answer
}


fun calculation(number1: Double, number2: Double, operator: Char): Double {
    var answer = 0.0

    when (operator) {
        in "+" -> answer = number1 + number2
        in "-" -> answer = number1 - number2
        in "/" -> answer = number1 / number2
        in "*" -> answer = number1 * number2
    }
    return answer.toDouble()
}
