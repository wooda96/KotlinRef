package com.wooda.kotlinref.model

import com.wooda.kotlinref.model.Color.*

enum class Color(
        val r: Int,
        val g: Int,
        val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun Color.getMnemonic() =
        when (this) {
            RED -> "Richard"
            ORANGE -> "Of"
            YELLOW -> "York"
            GREEN -> "Gave"
            BLUE -> "Battle"
            INDIGO -> "In"
            else -> "Vain"
        }

fun Color.mix(anotherColor: Color) =
        when (setOf(this, anotherColor)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            else -> throw Exception("Unsupported mix mode")
        }