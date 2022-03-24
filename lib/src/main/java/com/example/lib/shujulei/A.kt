package com.example.lib.shujulei

data class A(var name: String, var age: Int)


fun main() {
    var a: A = A("小明", 2)

    println("name = ${a.name}")

    println("age = ${a.age}")

    var (name, age) = a

    println("name = $name")
    println("age = $age")


}

