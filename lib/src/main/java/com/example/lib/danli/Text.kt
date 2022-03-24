package com.example.lib.danli

object Text {
    var name: String = "xiaoming"

    @JvmStatic
    fun get() {
        println("hhaha")
    }
}

fun main(){
    Text.get()
}