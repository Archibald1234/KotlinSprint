package org.example.lesson_2

fun main() {
    val employees = 50
    val employeeSalary = 30000
    val interns = 30
    val internSalary = 20000
    var totalEmployeesSalary: Int
    var totalSalary: Int
    var averageSalary: Int
    totalEmployeesSalary = employees * employeeSalary
    totalSalary = totalEmployeesSalary + interns * internSalary
    averageSalary = totalSalary / (employees + interns)
    println(totalEmployeesSalary)
    println(totalSalary)
    println(averageSalary)
}