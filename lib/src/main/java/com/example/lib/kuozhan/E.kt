package com.example.lib.kuozhan

class E

var E.name: Int
    get() = 1
    set(value) {
        println(value)
    }



fun main() {
    E().name=111
    println(E().name)
}