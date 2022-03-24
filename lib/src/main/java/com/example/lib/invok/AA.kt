package com.example.lib.invok

class AA {
    fun haha() {
        println("hahaha")
    }
}

object TextAA {
    fun aa() {
        println("textqqqq")
    }

    operator fun invoke(a: String, b: Int): AA {
        println("invok")
        return AA()
    }
}

fun main() {
    TextAA.aa()


    val aa: AA = TextAA("sss", 12)

    aa.haha()
}