package com.example.lib.kuozhan

import com.example.lib.hanshu.name

class A(var name111: String) {

}

fun A.printMsg() {
    println("打印 $name111")
}


fun main() {
    A("小明").printMsg()

}