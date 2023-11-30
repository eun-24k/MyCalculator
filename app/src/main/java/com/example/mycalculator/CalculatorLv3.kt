package com.example.mycalculator
// Level 3
// AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를을 만든 후 클래스간의 관계를 고려하여 Calculator 클래스와 관계를 맺기
//
//관계를 맺은 후 필요하다면 Calculator 클래스의 내부코드를 변경하기
//나머지 연산자(%) 기능은 제외합니다.
//Lv2 와 비교하여 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
//hint. 클래스의 책임(단일책임원칙)
open class Calculator {
    fun main(){
        print("숫자를 입력하세요 : ")
        var number1 = readLine()!!.toDouble()
        print("연산자를 입력하세요 : ")
        var operator = readLine()!!
        print("숫자를 입력하세요 : ")
        var number2 = readLine()!!.toDouble()


        // 첫번째 계산
        var finalResult = calculation(number1, number2, operator)

        // 추가 계산
        while (true) {
            print("추가적인 계산을 하시겠습니까? (yes/no) : ")
            var readIteration = readLine()!!
            when (readIteration) {
                in "no" -> break
                in "yes" -> {
                    print("연산자를 입력하세요 : ")
                    operator = readLine()!!
                    print("숫자를 입력하세요 : ")
                    number2 = readLine()!!.toDouble()
                    finalResult = calculation(finalResult, number2, operator)
                    println("계산 결과는 $finalResult 입니다.")
                }
            }
        }
    }
    fun calculation(number1: Double, number2: Double, operator: String): Double {
        var result = 0.0
        when (operator) {
            in "+" -> result = AddOperation(number1, number2)
            in "-" -> result = SubtractOperation(number1, number2)
            in "/" -> result = DivideOperation(number1, number2)
            in "*" -> result = MultiplyOperation(number1, number2)
        }
        return result
    }
}

class AddOperation(number1: Double, number2: Double): Double = number1 + number2
class SubtractOperation(number1: Double, number2: Double): Double = number1 - number2
class MultiplyOperation(number1: Double, number2: Double): Double = number1 * number2
class DivideOperation(number1: Double, number2: Double): Double = number1 / number2
