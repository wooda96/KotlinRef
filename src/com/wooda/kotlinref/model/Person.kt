package com.wooda.kotlinref.model

import com.wooda.kotlinref.util.getAge
import java.time.LocalDate

class Person(
        name: String,
        val gender: Gender,
        val birthday: LocalDate) {
    val name: String = name
        get() = if (gender == Gender.MALE) "Mr.$field" else field
    val age: Double
        get() = getAge(birthday)

    override fun toString() = "I'm $name and $age years old"
}