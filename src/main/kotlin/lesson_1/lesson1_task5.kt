package org.example.lesson_1

const val SECONDS_IN_SPACE = 6480
const val SECONDS_IN_MINUTE = 60
const val MINUTES_IN_HOUR = 60
fun main() {
    val minutesInSpace = SECONDS_IN_SPACE / SECONDS_IN_MINUTE
    val hoursInSpace = minutesInSpace / MINUTES_IN_HOUR
    val minutesInSpaceReminder = SECONDS_IN_SPACE % SECONDS_IN_MINUTE
    val hoursInSpaceReminder = minutesInSpace % MINUTES_IN_HOUR
    println("%02d:%02d:%02d".format(hoursInSpace, hoursInSpaceReminder, minutesInSpaceReminder))
}