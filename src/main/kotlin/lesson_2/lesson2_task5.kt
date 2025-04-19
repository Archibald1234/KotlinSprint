package org.example.lesson_2

import kotlin.math.pow


fun main() {
    val depositPeriod = 20
    val firstPayment = 70000
    val interestRate = 16.7
    var depositPeriodEnd = firstPayment * (1 + interestRate / 100).pow(depositPeriod)
    println("Deposit at the end of period: %.3f".format(depositPeriodEnd))
}