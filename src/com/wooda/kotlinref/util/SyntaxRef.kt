package com.wooda.kotlinref.util

import java.lang.IllegalArgumentException

interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr) : Int {
    if (e is Num)
        return e.value
    if (e is Sum)
        return eval(e.left) + eval(e.right)
    throw IllegalArgumentException("Unsupported Expr: $e")
}

fun evalWithWhen(e: Expr) =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("Unsupported Expr: $e")
        }

fun fizzBuzz(num: Int) =
        when {
            num % 15 == 0 -> "FizzBuzz"
            num % 5 == 0 -> "Buzz"
            num % 3 == 0 -> "Fizz"
            else -> num
        }

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
    println(evalWithWhen(Sum(Num(1), Num(2))))

    val range1 = 100 downTo 1 step 2
    val range2 = 1..100
    val range3 = 0 until 10
    for (num in range3) {
        print("${fizzBuzz(num)} ")
        if (num % 10 == 0)
            println()
    }
}