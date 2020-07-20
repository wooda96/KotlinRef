package com.wooda.kotlinref

fun main(args: Array<String>) {
    println("Hello, Kotlin!")
    println("Args: ${args.size}")
    args.forEachIndexed { index, arg -> println("arg[$index] - $arg") }
}