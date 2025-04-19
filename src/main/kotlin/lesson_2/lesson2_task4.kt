package org.example.lesson_2


fun main() {
    val chrystalOre = 7
    val ironOre = 11
    val buffPercentsQuantity = 20
    val buff = buffPercentsQuantity/100.0
    val buffAdvantageCO = chrystalOre * buff
    val buffAdvantageIO = ironOre * buff
    println("Chrystal ore buff advantage:${buffAdvantageCO.toInt()}")
    println("Iron ore buff advantage:${buffAdvantageIO.toInt()}")
}