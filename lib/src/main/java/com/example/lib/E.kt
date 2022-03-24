package com.example.lib

class E {

    constructor(a1111: String, b: Int) {
        println(a1111 + b)
    }

    fun text() {
    }
}

class F(a: String) {

    constructor(a: String, b: Int) : this(a) {

    }

    constructor(a:String,b: Int,c:Int):this(a,b){

    }
}

fun main() {
    E("11", 2).text()

    F("11",1)
}