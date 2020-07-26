package com.wooda.kotlinref

import java.util.*

fun main(args: Array<String>) {
//    collectionCreationRef()
    accessCollectionRef()
}

fun isLetter(ch: Char) = ch in 'A'..'Z' || ch in 'a'..'z'
fun isNotDigit(ch: Char) = ch !in '0'..'9'

fun collectionCreationRef() {
    printCallerMethodName()

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

    val sampleMap = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    for ((num, expression) in sampleMap)
        println("$num is $expression")
}

fun accessCollectionRef() {
    printCallerMethodName()

    val strs = listOf("first", "second", "last")
    println(strs.last())
    println(strs.max())

}