/***
 * java 에서 호출할 클래스의 이름을 정의할 수 있음
 */
@file:JvmName("StringUtils")

package com.wooda.kotlinref

fun main(args: Array<String>) {
    val set = hashSetOf(1, 7, 5)
    println(set)
    println(set.javaClass)
}


/***
 * 자바에서 호출하는 함수의 경우 디폴트 파라메터를 쓸 수 없다.
 * JvmOverloads 를 이용하면 자바 호출을 위해서 각각의 오버로딩된 메소드를 만들어 준다.
 */
@JvmOverloads
fun methodForJava(x: Int = 1, y: Int = 2) = x + y