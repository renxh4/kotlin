package com.example.lib.weituo

interface Base{
    fun text()
}

//被委托的类
class BaseImpl(val x :String ) : Base{
    override fun text() {
        println(x)
    }
}

class Devices (b :Base) :Base by b


fun main(){
    var b = BaseImpl("我是真实的类")
    Devices(b).text()
}






