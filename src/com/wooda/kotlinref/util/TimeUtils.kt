package com.wooda.kotlinref.util

import java.time.LocalDate
import java.time.Period

fun getCurrentDate() = LocalDate.now()

fun getAge(birthday: LocalDate) : Double {
    val today = getCurrentDate()
    val period = Period.between(birthday, today)
    return period.years + (period.months / 12.0)
}