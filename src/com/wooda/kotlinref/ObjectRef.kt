package com.wooda.kotlinref

data class ObjectTestClass(val name: String) {
    object NameComparator : Comparator<ObjectTestClass> {
        override fun compare(o1: ObjectTestClass, o2: ObjectTestClass) = o1.name.compareTo(o2.name)
    }
}

fun main(args: Array<String>) {
    val objectClasses = listOf(ObjectTestClass("z1"), ObjectTestClass("a1"))
    println(objectClasses.sortedWith(ObjectTestClass.NameComparator))
}