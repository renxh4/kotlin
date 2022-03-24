package com.example.lib.text3

interface A {
    //抽象属性 abstract可以省略
    abstract var a: Int
    //非抽象属性 ，没啥用
    var b : Int
        get() = 1
        set(value) = TODO()

    //抽象方法 abstract可以使用
    abstract fun text()

    //非抽象方法
    fun text1(){

    }
}