package org.example.lesson_3

const val ORIGINAL_NAME = "Татьяна"
const val ORIGINAL_SURNAME = "Андреева"
const val ORIGINAL_PATRONYMIC = "Сергеевна"
const val CHANGED_SURNAME = "Сидорова"
const val AGE = 22
fun main() {
    println("$ORIGINAL_SURNAME $ORIGINAL_NAME $ORIGINAL_PATRONYMIC Age:$AGE")
    println("$CHANGED_SURNAME $ORIGINAL_NAME $ORIGINAL_PATRONYMIC Age:${AGE - 2}")
}