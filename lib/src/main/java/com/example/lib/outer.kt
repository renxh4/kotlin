package com.example.lib

class outer { //外部类
    private var a111: Int = 1


    class Nested { //嵌套类
        fun text() = 2
    }

    inner class inner { //内部类
        fun text() = a111 //访问外部类成员变量

        fun text1() {
            var out = this@outer//拿到外部类对象
            println(out.a111)//访问外部类成员
        }
    }

    fun text3 (face: Face){
        var a = face.tetx()
        println(a)
    }
}

interface Face {
    fun tetx() :String
}


fun main() {
    var a = outer.Nested().text() //嵌套类调用方式

    println(a)

    var b = outer().inner().text() //内部类调用方式
    var c = outer().inner().text1()

    outer().text3(object : Face{
        override fun tetx(): String {
            return "匿名内部类"
        }
    })
}