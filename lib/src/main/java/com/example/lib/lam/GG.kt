package com.example.lib.lam

interface CallBack {
    fun success(msg: String)
    fun fail(msg: String)
}


class GG {
    var mycallBack: CallBack? = null
    fun setCallBack(callBack: CallBack) {
        mycallBack = callBack
    }

    fun init() {
        mycallBack?.success("success")
        mycallBack?.fail("fail")
    }
}

fun main() {
    val gg = GG()

    gg.setCallBack(object : CallBack {
        override fun success(msg: String) {
            println(msg)
        }

        override fun fail(msg: String) {
            println(msg)
        }
    })

    gg.init()

}