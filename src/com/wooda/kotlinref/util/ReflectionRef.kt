package com.wooda.kotlinref.util

fun printCallerMethodName() {
    println("====== ${getCallerMethodName(1)} =======")
}

/***
 * parentDepth 를 메소드 기본 값으로 사용하면 stack trace 의 depth 가 한단계 더 생긴다.
 * 즉, parentDepth = 0 이렇게 줄 경우 기본 값 호출이면 아래의 2를 3으로 바꿔야 함
 * 그래서 기본값을 받지 않는 버전으로 만듬
 */
fun getCallerMethodName(parentDepth: Int): String {
    val st = Thread.currentThread().stackTrace
    return st[2 + parentDepth].methodName
}

fun main(args: Array<String>) {

    printMethodRef()

    println("Method name of this: ${getCallerMethodName(0)}")

    printCallerMethodName()
}

fun printMethodRef() {
    val method = object{}.javaClass.enclosingMethod
    val methodName = method.name

    println("Method of this: $methodName")
}