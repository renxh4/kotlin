package com.example.lib.kuozhan

open class C

class D : C()

fun C.text(){
    println("我是c")
}

fun D.text(){
    println("我是d")
}

fun haha(c:C){
    c.text()
}

fun main(){

    haha(C())
    haha(D())
}