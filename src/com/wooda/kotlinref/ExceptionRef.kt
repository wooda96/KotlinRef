package com.wooda.kotlinref

import java.lang.Exception
import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    println(divide(100, 5))
//    println(divide(200, 0))

    println(safeDivide(200, 0))
}

fun divide(dividee: Int, divider: Int) =
        if (divider != 0)
            dividee / divider
        else
            throw IllegalArgumentException("Divider should not be zero.")

fun safeDivide(dividee: Int, divider: Int) =
        try {
            dividee / divider
        } catch (e: Exception) {
            null
        }