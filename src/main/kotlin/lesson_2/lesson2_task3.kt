package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
fun main() {
    var departureHour: Int = 9
    var departureMinute: Int = 39
    var travelTime: Int = 457
    var travelHours = travelTime / MINUTES_IN_HOUR
    var travelMinutes = travelTime % MINUTES_IN_HOUR
    var arrivalMinute = departureMinute + travelMinutes % MINUTES_IN_HOUR
    var parsedArrivalHourInt = arrivalMinute / MINUTES_IN_HOUR
    var parsedArrivalMinuteInt = arrivalMinute % MINUTES_IN_HOUR
    var arrivalHour = departureHour + travelHours + parsedArrivalHourInt
    println("Arrival at: $arrivalHour:$parsedArrivalMinuteInt")
}