package com.wooda.kotlinref.util

import com.wooda.kotlinref.model.Color
import com.wooda.kotlinref.model.getMnemonic
import com.wooda.kotlinref.model.mix

fun main(args: Array<String>) {
    val testColor = Color.RED
    println("${testColor} - ${testColor.rgb()}")
    println("Mnemonic of $testColor is ${testColor.getMnemonic()}")

    val mixColor = Color.YELLOW
    println("${testColor.mix(mixColor)} can be mixed from $testColor & $mixColor")
}