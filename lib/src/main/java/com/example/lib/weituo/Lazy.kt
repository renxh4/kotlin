package com.example.lib.weituo

import kotlin.properties.Delegates

class Lazy {
    val name :String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        println("第一次调用初始化")
        "aa" }

    var a : String by Delegates.observable("默认值"){
            property, oldValue, newValue ->

        println( "$oldValue -> $newValue ")
    }
}

fun main(){
    var lazy =Lazy()
    println(lazy.name)
    println(lazy.name)
    println(lazy.name)

    lazy.a = "第一次修改"

    lazy.a = "第二次修改"
}