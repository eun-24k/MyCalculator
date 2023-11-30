//package com.example.mycalculator
//
////Lv3: AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기),
//// DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺기
//fun main() {
//    // 입력 값
//    print("숫자를 입력하세요 : ")
//    var number1 = readLine()!!.toDouble()
//    print("연산자를 입력하세요 : ")
//    var operator = readLine()!!
//    print("숫자를 입력하세요 : ")
//    var number2 = readLine()!!.toDouble()
//
//
//    // 객체 인스턴스화해주기
//    var addOperation = AddOperation(number1, number2)
//    var subtractOperation = SubtractOperation(number1, number2)
//    var multiplyOperation = MultiplyOperation(number1, number2)
//    var divideOperation = DivideOperation(number1, number2)
//
//    when (operator) {
//        in "+" -> println(addOperation.addition(number1, number2))
//        in "-" -> println(subtractOperation.subtraction(number1, number2))
//        in "/" -> println(divideOperation.division(number1, number2))
//        in "*" -> println(multiplyOperation.multiplication(number1, number2))
//    }
//}
//
//class AddOperation(number1: Double, number2: Double) {
//    fun addition(number1: Double, number2: Double): Double = number1 + number2
//}
//
//class SubtractOperation(number1: Double, number2: Double) {
//    fun subtraction(number1: Double, number2: Double): Double = number1 - number2
//}
//
//class MultiplyOperation(number1: Double, number2: Double) {
//    fun multiplication(number1: Double, number2: Double): Double = number1 * number2
//}
//
//class DivideOperation(number1: Double, number2: Double) {
//    fun division(number1: Double, number2: Double): Double = number1 / number2
//}
