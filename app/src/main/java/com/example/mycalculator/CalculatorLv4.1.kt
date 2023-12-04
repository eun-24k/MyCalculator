//package com.example.mycalculator
//
//// Lv4.1 abstractoperation 객체 생성하기
////
//fun main() {
//    // 입력 값
//    print("숫자를 입력하세요 : ")
//    var num1 = readLine()!!.toDouble()
//    print("연산자를 입력하세요 : ")
//    var operator = readLine()!!
//    print("숫자를 입력하세요 : ")
//    var num2 = readLine()!!.toDouble()
//
//    // 타입 지정
//    var operate: AbstractOperation
//    // 클래스 인슽턴스화
//    var calculate = Calculator()
//
//
//    when(operator) {
//        "+" -> { operate = AddOperation() }
//        "-" -> { operate = SubtractOperation() }
//        "*" -> { operate = MultiplyOperation() }
//        "/" -> { operate = DivideOperation() }
//    }
//    val calculator: Double = calculate.calculator(num1, num2, operate)
//    println("정답은 $calculator 입니다.")
//}
//
//class Calculator {
//    fun calculator(num1:Double, num2:Double, operate: AbstractOperation):Double {
//        return operate.operation(num1, num2)
//    }
//}
//
//class AddOperation : AbstractOperation() {
//    override fun operation(num1: Double, num2: Double): Double = num1 + num2
//}
//class SubtractOperation : AbstractOperation() {
//    override fun operation(number1: Double, number2: Double): Double = number1 - number2
//}
//class MultiplyOperation : AbstractOperation() {
//    override fun operation(number1: Double, number2: Double): Double = number1 * number2
//}
//class DivideOperation : AbstractOperation() {
//    override fun operation(number1: Double, number2: Double): Double = number1 / number2
//}
//abstract class AbstractOperation {
//    abstract fun operation(num1: Double, num2: Double): Double
//}