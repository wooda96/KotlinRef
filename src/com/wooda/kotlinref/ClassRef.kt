package com.wooda.kotlinref

import com.wooda.kotlinref.model.Company
import com.wooda.kotlinref.model.Gender
import com.wooda.kotlinref.model.Person
import java.time.LocalDate

fun main(args: Array<String>) {
//    printCallerMethodName()
    classOverrideRef()
    testCustomGetterSetter()
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

fun testCustomGetterSetter() {
    val user = SomeUser("wooda")
    user.address = "New Address"
    println("${user.address}")

    // cannot set private setter
//    user.familyCount = 10
}

open class View {
    open fun click() = println("View clicked.")
}

fun View.getMyName() = "I'm view"

class Button: View() {
    override fun click() = println("Button clicked.")
}

fun Button.getMyName() = "I'm button"

// constructors
open class someView {
    constructor(context: String) {
        // some code
    }

    constructor(context:String, attribute: String) {
        // some code
    }
}

class someButton: someView {
    constructor(context: String) : this(context, "") {

    }

    constructor(context: String, attribute: String): super(context, attribute) {

    }
}

// custom getter and setter
class SomeUser(val name: String) {
    var address:String? = null
    set (newVal: String?) {
        println("$name value is changed")
        field = newVal
    }
    get() {
        println("return value of $name - $field")
        return field
    }

    // change visibility
    var familyCount: Int = 0
}