package com.example.mycalculator

//- Lv4 : AddOperation(더하기), SubtractOperation(빼기), MultiplyOperation(곱하기),
// DivideOperation(나누기) 연산 클래스들을 AbstractOperation라는 클래스명으로 만들어 사용하여 추상화하고
// Calculator 클래스의 내부 코드를 변경합니다.
//- Lv3 와 비교해서 어떠한 점이 개선 되었는지 스스로 생각해 봅니다.
//- hint. 클래스간의 결합도, 의존성(의존성역전원칙)
fun main() {
    // 입력 값
    print("숫자를 입력하세요 : ")
    var number1 = readLine()!!.toDouble()
    print("연산자를 입력하세요 : ")
    var operator = readLine()!!
    print("숫자를 입력하세요 : ")
    var number2 = readLine()!!.toDouble()


    // 객체 인스턴스화해주기
    var addOperation = AddOperation(number1, number2)
    var subtractOperation = SubtractOperation(number1, number2)
    var multiplyOperation = MultiplyOperation(number1, number2)
    var divideOperation = DivideOperation(number1, number2)

    when (operator) {
        in "+" -> println(addOperation.operation(number1, number2))
        in "-" -> println(subtractOperation.operation(number1, number2))
        in "/" -> println(divideOperation.operation(number1, number2))
        in "*" -> println(multiplyOperation.operation(number1, number2))
    }
}

class AddOperation(number1: Double, number2: Double) : abstractOperation(number1, number2) {
    override fun operation(number1: Double, number2: Double): Double = number1 + number2
}

class SubtractOperation(number1: Double, number2: Double) : abstractOperation(number1, number2) {
    override fun operation(number1: Double, number2: Double): Double = number1 - number2
}

class MultiplyOperation(number1: Double, number2: Double) : abstractOperation(number1, number2) {
    override fun operation(number1: Double, number2: Double): Double = number1 * number2
}

class DivideOperation(number1: Double, number2: Double) : abstractOperation(number1, number2) {
    override fun operation(number1: Double, number2: Double): Double = number1 / number2
}

abstract class abstractOperation(val number1: Double, val number2: Double) {
    abstract fun operation(number1: Double, number2: Double): Double
}