package org.example.lesson_2

fun main() {
    var departureHour: Int = 9
    var departureMinute: Int = 39
    var travelTime: Int = 457
    var travelHours = travelTime / 60
    var travelMinutes = travelTime % 60
    var arrivalMinute = departureMinute + travelMinutes % 60
    var parsedArrivalHourInt = arrivalMinute / 60
    var parsedArrivalMinuteInt = arrivalMinute % 60
    var arrivalHour = departureHour + travelHours + parsedArrivalHourInt
    println("Arrival at: $arrivalHour:$parsedArrivalMinuteInt")
}