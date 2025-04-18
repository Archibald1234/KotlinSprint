package org.example.lesson_3

fun main() {
    val userName = "Username"
    val dayGreeting = "Good day "
    val eveningGreeting = "Good evening "
    var greeting = dayGreeting + userName
    println(greeting)
    greeting = eveningGreeting + userName
    println(greeting)
}