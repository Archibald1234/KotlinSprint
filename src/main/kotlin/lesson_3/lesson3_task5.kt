package org.example.lesson_3

fun main() {
    val moveInfo = "D2-D4:0"
    var moveInfoSplit = moveInfo.split("-", ":")
    var moveFrom = moveInfoSplit[0]
    var moveTo = moveInfoSplit[1]
    var moveNumber = moveInfoSplit[2]
    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}