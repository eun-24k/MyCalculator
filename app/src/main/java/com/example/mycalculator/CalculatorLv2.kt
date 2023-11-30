//package com.example.mycalculator
//// Level 2
//// Lv1에서 만든 Calculator 클래스에 출력 이후 추가 연산을 가능하도록 코드를 추가하고, 연산 진행 후 출력하기
//fun main(){
//    print("숫자를 입력하세요 : ")
//    var number1 = readLine()!!.toDouble()
//    print("연산자를 입력하세요 : ")
//    var operator = readLine()!!
//    print("숫자를 입력하세요 : ")
//    var number2 = readLine()!!.toDouble()
//
//
//    // 첫번째 계산
//    var finalResult = calculation(number1, number2, operator)
//
//    // 추가 계산
//    while (true) {
//        print("추가적인 계산을 하시겠습니까? (yes/no) : ")
//        var readIteration = readLine()!!
//        when (readIteration) {
//            in "no" -> break
//            in "yes" -> {
//                print("연산자를 입력하세요 : ")
//                operator = readLine()!!
//                print("숫자를 입력하세요 : ")
//                number2 = readLine()!!.toDouble()
//                finalResult = calculation(finalResult, number2, operator)
//                println("계산 결과는 $finalResult 입니다.")
//            }
//        }
//    }
//}
//fun calculation(number1: Double, number2: Double, operator: String): Double {
//    var result = 0.0
//    when (operator) {
//        in "+" -> result = number1 + number2
//        in "-" -> result = number1 - number2
//        in "/" -> result = number1 / number2
//        in "*" -> result = number1 * number2
//    }
//    return result
//}
//
