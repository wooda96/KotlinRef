package com.wooda.kotlinref

// CountingSet is delegating to MutableCollection

class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>())
    : MutableCollection<T> by innerSet {

    var objectAdded = 0

    override fun add(element: T): Boolean {
        objectAdded++
        return innerSet.add(element)
    }
}

fun main(args: Array<String>) {
    val countSet = CountingSet<String>()
    countSet.add("wooda")

    println("Adding count of countSet: ${countSet.objectAdded}")
}