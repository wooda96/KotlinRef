package com.wooda.kotlinref

import com.wooda.kotlinref.model.Gender
import com.wooda.kotlinref.model.Person

import java.time.LocalDate

/***
 * 확장 메소드 이름 변경
 */
import com.wooda.kotlinref.model.toAgeByKoreanStyle as ToKoreanAge

fun String.lastChar() = this[length - 1]

/***
 * property extension
 */
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) = setCharAt(length - 1, value)

/***
 * variable arguments
 */
fun printVarargs(vararg values: Int) {
    // values is array type
    println("${values.javaClass}")

    for (arg in values)
        print("$arg ")
    println()
}

/***
 * local function
 */
fun checkValidation(person: Person) {
    fun checkValid(value: String, name: String) {
        if (value.isBlank())
            throw Exception("Invalid value for $name")
    }
    checkValid(person.name, "Name")
}

/***
 * Infix call
 */
infix fun Int.plus(another: Int) = this + another

fun main(args: Array<String>) {
    println("last char of Seoul is ${"seoul".lastChar()}")

    val wooda = Person("Wooda", Gender.MALE, LocalDate.of(1977, 7, 29))
    println("Age of wooda as korean style is ${wooda.ToKoreanAge()}")

    val sb =  StringBuilder("abcd");
    sb.lastChar = 'c'
    println(sb)

    printVarargs(1, 2, 3)

    println("Infix plus: ${1.plus(2)}")
}