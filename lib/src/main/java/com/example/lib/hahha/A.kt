package com.example.lib.hahha

abstract class A {
    //抽象成员变量不能初始化
    abstract var A :Int
    //抽象方法不能有方法体
    abstract fun text()
    //普通属性也可以被重写，按时需要有open修饰
    open var B :Int  =1
    //普通方法也可以被重写，需要open修饰
    open fun text1(){

    }

    constructor(){
        //构造方法，抽象类不能实例化，构造方法是给子类用的
    }
}


class D :B(){
    override fun text() {
    }

}