package com.example.mycalculator

abstract class Employee(val name: String,val experience: Int) {   // Non-Abstract
    // Property
    // Abstract Property (Must be overridden by Subclasses)
    abstract var salary: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun dateOfBirth(date:String)

    // Non-Abstract Method
    fun employeeDetails() {
        println("Name of the employee: $name")
        println("Experience in years: $experience")
        println("Annual Salary: $salary")
    }
}
// derived class
class Engineer(name: String,experience: Int) : Employee(name,experience) {
    override var salary = 500000.00
    override fun dateOfBirth(date:String){
        println("Date of Birth is: $date")
    }
}
fun main(args: Array<String>) {
    val eng = Engineer("Praveen",2)
    eng.employeeDetails()
    eng.dateOfBirth("02 December 1994")
}