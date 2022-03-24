package com.example.lib.lam

class FF {
    var  aa :Int = 2

    fun ffa(){

    }

    fun ffb(){

    }

    fun ffc(){

    }
}

fun main() {
    val ff :FF =FF()

    ff?.let {
        //这个变量的作用域就是在let的范围内
        var i :String = "22"
        "sdas"
    }

    ff?.let {
        //这里的it值得就是ff
        //利用?.操作符，如果ff为空就不会进入let内，也就是说let内的it永远不会为空
        "${it.aa}"
    }

    with(ff,{
        ffa()
        ffb()
        ffc()
    })

    ff.run {

    }

    run {

    }

    ff.also {

    }

    ff.apply {  }





}