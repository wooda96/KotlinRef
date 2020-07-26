package com.wooda.kotlinref.sample

fun main(args: Array<String>) {
    val sampleList = listOf(1, 3, 5, 10)
    println("default output of list: $sampleList")

    val result = sampleList.joinToString(
            separator = ":",
            prefix = "<",
            postFix = ">")

    println("output of joinToString: $result")
}

fun <T> Collection<T>.joinToString(
        separator: String = ":",
        prefix: String = "<",
        postFix: String = ">"
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postFix)
    return result.toString()
}

