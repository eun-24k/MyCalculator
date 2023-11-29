package com.example.mycalculator
// Level 2
// Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고, 연산 진행 후 출력하기
fun main(){
    print("빈칸 없이 식을 작성하세요 ('+', '-', '*', '/') : ")
    var stringInput = readLine()!!.toCharArray()

    // 첫번째 계산
    var operator = stringInput[1]
    var number1 = stringInput[0].digitToInt().toDouble()
    var number2 = stringInput[2].digitToInt().toDouble()
    var finalResult = calculation(number1, number2, operator)

    // 계산 반복
    finalResult = additionalCalculation(stringInput, finalResult, 3)

    println("계산 결과는 $finalResult 입니다.")

    // 추가 계산
    while (true) {
        print("추가적인 계산을 하시겠습니까? (yes/no) : ")
        var readIteration = readLine()!!
        when (readIteration) {
            in "no" -> break
            in "yes" -> {
                print("추가 연산을 작성하세요 : Ans")
                stringInput = readLine()!!.toCharArray()
                finalResult = additionalCalculation(stringInput, finalResult, 0)
                println("계산 결과는 $finalResult 입니다.")
            }
        }
    }
}
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

fun additionalCalculation(stringInput: CharArray, finalResult: Double, startIndexValue: Int): Double{
    if (stringInput.size >= 3) {
        for (i in startIndexValue until stringInput.size step 2) {
            var operator = stringInput[i]
            var number2 = stringInput[i + 1].digitToInt().toDouble()
            var finalResult = calculation(finalResult, number2, operator)
        }
    }
    return finalResult
}
