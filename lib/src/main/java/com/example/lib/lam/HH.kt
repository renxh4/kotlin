package com.example.lib.lam

class HH {
    var successCallback:((String)->Unit)?=null
    var failCallback:((String)->Unit)?=null

    fun setCallback(success:(String)->Unit,fail:(String)->Unit){
        successCallback=success
        failCallback=fail
    }

    fun init(){
        successCallback?.let {
            it("success11")
        }

        failCallback?.invoke("fail11")
    }
}

fun main() {
    ArrayList<String>()
    val hh = HH()

    hh.setCallback({
       println(it)
    }, {
        println(it)
    })

    hh.init()
}