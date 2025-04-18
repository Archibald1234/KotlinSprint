package org.example.lesson_2

const val CHRYSTAL_ORE = 7
const val IRON_ORE = 11
const val BUFF = 0.2
fun main() {
    val buffAdvantageCO = CHRYSTAL_ORE * BUFF
    val buffAdvantageIO = IRON_ORE * BUFF
    println("Chrystal ore buff advantage:${buffAdvantageCO.toInt()}")
    println("Iron ore buff advantage:${buffAdvantageIO.toInt()}")
}