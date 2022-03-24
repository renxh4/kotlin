package com.example.lib.danli

import com.example.lib.hanshu.name

class Myclass1 {
    companion object {
        @JvmStatic
        fun text(){
            println("text")
        }
    }
}


fun main(){
    Myclass1.Companion.text()
    //上下俩个表达式等价
    Myclass1.text()
}