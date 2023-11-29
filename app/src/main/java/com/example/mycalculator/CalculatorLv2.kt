package com.example.mycalculator
fun main(){
    print("Type the equation without space: ")
    val stringInput = readLine()!!
    val inputArray = stringInput.toCharArray()

    // first calculation
    var operator = inputArray[1]
    var number1 = inputArray[0].digitToInt().toDouble()
    var number2 = inputArray[2].digitToInt().toDouble()
    var finalResult = calculation(number1, number2, operator)

    // calculation iteration
    if (inputArray.size > 3) {
        for (i in 3 until inputArray.size step 2) {
            operator = inputArray[i]
            number1 = finalResult
            number2 = inputArray[i + 1].digitToInt().toDouble()

            finalResult = calculation(number1, number2, operator)
        }
    }
    println("Result of the Calculation is $finalResult")

}

