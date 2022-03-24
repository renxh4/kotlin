package com.example.lib.danli

import com.example.lib.hanshu.name

class Myclass {

    var name: String = "aaa"

    companion object Factory {
        fun create(): Myclass = Myclass()
    }

    fun text() {
        println("调用方法")
    }

}

fun main() {
    var myclass = Myclass.create()

    var myclass1 = Myclass.Factory.create()

    println(myclass.name)

    myclass1.text()
}