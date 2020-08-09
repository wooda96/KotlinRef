package com.wooda.kotlinref

interface Clickable {
    val id: String
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable {
    fun setFocus(isFocueD: Boolean)
    fun showOff() = println("I'm focusable")
}

abstract class PrettyView : Clickable, Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
        println("I'm view")
    }

    open fun printSize() {
        println("Width: 100, height: 100")
    }
}

class PrettyButton : PrettyView() {
    override fun click() {
        println("Clicked")
    }

    override fun setFocus(isFocused: Boolean) {
        println("Focused")
    }

    override fun printSize() {
        println("Width: 200, height: 200")
    }

    override val id: String = "PrettyButton"
}

fun main(args: Array<String>) {
    val myButton = PrettyButton()
    myButton.click()
    myButton.setFocus(true)
    myButton.showOff()

    myButton.printSize()

    testClickable(myButton)
    testPrettyView(myButton)
}

fun testClickable(c: Clickable) {
    println("Id of clickable: ${c.id}")
}

fun testPrettyView(v: PrettyView) {
    v.printSize()
}