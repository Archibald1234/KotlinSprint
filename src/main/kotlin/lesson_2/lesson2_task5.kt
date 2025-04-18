package org.example.lesson_2

import kotlin.math.pow

const val DEPOSIT_PERIOD = 20
const val FIRST_PAYMENT = 70000
const val INTEREST_RATE = 16.7
fun main() {
    var depositPeriodEnd = FIRST_PAYMENT * (1 + INTEREST_RATE / 100).pow(DEPOSIT_PERIOD)
    println("Deposit at the end of period: %.3f".format(depositPeriodEnd))
}