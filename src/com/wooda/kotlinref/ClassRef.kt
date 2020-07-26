package com.wooda.kotlinref

import com.wooda.kotlinref.model.Company
import com.wooda.kotlinref.model.Gender
import com.wooda.kotlinref.model.Person
import java.time.LocalDate

fun main(args: Array<String>) {
//    printCallerMethodName()
    classOverrideRef()
}

fun classBasicRef() {
    printCallerMethodName()
    val wooda = Person("Wooda", Gender.MALE, LocalDate.of(1977, 7, 29))
    println("Hello, ${wooda.name}. You are ${String.format("%.2f", wooda.age)} years old")
    println(wooda)

    val myCompany = Company("Awesome Corp.")
    println(myCompany)
}

fun classOverrideRef() {
    printCallerMethodName()
    val v: View = Button()
    v.click()

    println("${v.getMyName()}")
}

open class View {
    open fun click() = println("View clicked.")
}

fun View.getMyName() = "I'm view"

class Button: View() {
    override fun click() = println("Button clicked.")
}

fun Button.getMyName() = "I'm button"