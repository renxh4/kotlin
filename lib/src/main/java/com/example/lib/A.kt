package com.example.lib

import com.example.lib.text.CC


class A constructor(a: String) {
    var a: String = "shsh"
    val b: String = "ccc"
    var c: String
    val d: String

    init {
        c = a
        d = a
        println(a)
    }

    fun text(a: String) {
        println(a)
    }
}


class B(b: String) {
    var lastName: String = "hahha"
        get() {
            if (field.equals("hahha")) {
                field = "333"
            }
            return field
        }
        set(value) {
            if (value.equals("111")) {
                field = "222"
            } else {
                field = value
            }
        }

    var hah: String = "222"

    init {
        println(b)

    }


}


class C(c: String) {

    var c1 = c
        private set
    lateinit var abc: String


    fun text() {
        CC()
    }


}

class D(var d: String) {
    fun text() {
        println(d)
    }
}


fun main() {
    var a = A("测试")
    a.text("调用方法")

    var b = B("hahah")

    println(b.lastName)

    b.lastName = "111"

    println(b.lastName)

    C("我是c").text()

    D("我是d").text()

    var c = C("haha")
}