package com.example.lib

class AACCCC constructor(a: String) {
    var a: String = "shsh"
    val b: String = "ccc"
    var c: String
    val d: String

    var boo :Boolean = true

    //初始化代码块，可以初始化主构造函数
    init {
        c = a
        d = a
        println(a)
        println(b)
    }

    fun text(a :String) {
        println(a)
    }

}

fun main(){
    var a : AACCCC?  = null
    var list :ArrayList<String>?  =null
    if (a?.boo ==false){
        println("进来了")
    }

    println(a?.boo==true)
    a?.takeIf {
        println("tackif"+a.boo)
        a.boo
    }.apply {
        println("apply")
    }

    list?.apply {
        10/list.size
        println("let")
    }
}



