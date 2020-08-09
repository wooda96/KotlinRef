package com.wooda.kotlinref

class myOuterClass1 {

    val name = "Outerclass1"

    val inner = myInnerClass1()

    class myInnerClass1 {
        fun callTest() {
            // cannot access outer class
//            println(name)
            println("ok.")
        }
    }
}

class myOuterClass2 {
    val name = "OuterClass2"

    val inner = myInnerClass2()

    inner class myInnerClass2 {
        fun callTest() {
            println("I'm ${this@myOuterClass2.name}")
            println("ok")
        }
    }
}

fun main(args: Array<String>) {

    val outer1 = myOuterClass1()
    outer1.inner.callTest()

    val outer2 = myOuterClass2()
    outer2.inner.callTest()
}