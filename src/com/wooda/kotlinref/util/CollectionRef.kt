package com.wooda.kotlinref.util

import java.util.*

fun main(args: Array<String>) {
    val ascHexMap = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val hex = Integer.toHexString(c.toInt())
        ascHexMap[c] = hex
    }

    for ((letter, hex) in ascHexMap)
        println("$letter in hex is 0x$hex")

    val someList = arrayListOf("10", "11", "12")
    for ((index, element) in someList.withIndex())
        println("${index}th - $element")
}

fun isLetter(ch: Char) = ch in 'A'..'Z' || ch in 'a'..'z'
fun isNotDigit(ch: Char) = ch !in '0'..'9'