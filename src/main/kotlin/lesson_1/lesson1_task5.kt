package org.example.lesson_1

fun main() {
    val secondsCosmic = 6480
    val minutesCosmic = secondsCosmic / 60
    val hoursCosmic = minutesCosmic / 60
    val minutesCosmicReminder = secondsCosmic % 60
    val hoursCosmicReminder = minutesCosmic % 60
    println("%02d:%02d:%02d".format(hoursCosmic, hoursCosmicReminder, minutesCosmicReminder))
}