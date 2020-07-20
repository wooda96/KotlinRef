package com.wooda.kotlinref

import com.wooda.kotlinref.model.Gender
import com.wooda.kotlinref.model.Person
import java.time.LocalDate

fun main(args: Array<String>) {
    val wooda = Person("Wooda", Gender.MALE, LocalDate.of(1977, 7, 29))
    println("Hello, ${wooda.name}. You are ${String.format("%.2f", wooda.age)} years old")
}