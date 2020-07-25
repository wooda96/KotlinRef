package com.wooda.kotlinref

import com.wooda.kotlinref.model.Gender
import com.wooda.kotlinref.model.Person

/***
 * 확장 메소드 이름 변경
 */
import com.wooda.kotlinref.model.toAgeByKoreanStyle as Korean
import java.time.LocalDate

fun String.lastChar() = this[length - 1]

fun main(args: Array<String>) {
    println("last char of Seoul is ${"seoul".lastChar()}")

    val wooda = Person("Wooda", Gender.MALE, LocalDate.of(1977, 7, 29))
    println("Age of wooda as korean style is ${wooda.Korean()}")
}