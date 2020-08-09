package com.wooda.kotlinref

data class MyDataClass(val name: String, val age: Int)

class NonDataClass(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is NonDataClass)
            return false
        return name == other.name && age == other.age
    }

    override fun toString() = "NonDataClass($name, $age)"
}

data class ComplexDataClass(val group: String, val person: NonDataClass)

fun main(args: Array<String>) {
    val person1 = MyDataClass("wooda", 43)
    val person2 = MyDataClass("wooda", 43)
    println("person1 == person2 is ${person1 == person2}")

    val dataHashSet = hashSetOf(person1)
    dataHashSet.add(person2)
    println("DataHashset is $dataHashSet")

    val nonDataPerson1 = NonDataClass("wooda", 43)
    val nonDataPerson2 = NonDataClass("wooda", 43)
    println("person1 == person2 is ${nonDataPerson1 == nonDataPerson2}")

    // hash set will be failed because of NonDataClass does not implement hashCode
    val nonDataHashSet = hashSetOf(nonDataPerson1)
    nonDataHashSet.add(nonDataPerson2)
    println("Nondata hashset is $nonDataHashSet")

    // copy data class
    val person3 = person1.copy(age = 23)
    println("Copied person1: $person3")

    // complex data class
    // NOTE: person in Complex data class is not data class
    val complex1 = ComplexDataClass("Group1", nonDataPerson1)
    val complex2 = ComplexDataClass("Group1", nonDataPerson2)
    println("complex1 == complex2 is ${complex1 == complex2}")
    // even though ComplexDataClass is data class, hash set will not work as expected
    // because hashCode of complex1 and complex2 are different
    val complexHashSet = hashSetOf(complex1)
    complexHashSet.add(complex2)
    println("Complex hashset: $complexHashSet")
}