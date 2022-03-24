package com.example.lib.lam

class A {
    val b = { a: String, b: String -> a + b }
    //lambda 作为参数
    fun text(param: (String, String) -> String) {
        param("11", "22")
    }

    //lambda 作为返回值
    fun text1(): (String, Int) -> String {
        return { a: String, b: Int -> a }
    }

    fun getAge():Int{
        return 1
    }

    fun text(){

    }
}

fun main() {


    for (a in 0 until 6 ){
        println(a)
    }
//    println(6%4);

    MyObject().myFun { doAnotherThing() }

}

class Builder (val multiplier: Int) {

    fun invokeStuff(action: (Builder.() -> Unit)) {
        this.action()
    }

    fun multiply(value: Int) : Int {
        return value * multiplier
    }
}

class MyObject {
    fun myFun(doSomething: MyObject.()->Unit) {
        doSomething()
        println("myFun")

    }

    fun doAnotherThing() {
        println("执行了doAnotherThing")
    }
}



