package com.example.lib.lam

// lambda

fun main() {
    println(name(111, "测试"))
    println(name1(222, "测试"))
    println(name2(333, "测试"))

    haha(name)

    haha(ccccc)

    //如果函数只有一个lambda 则可以把小括号去掉
    haha{ a: Int, b: String ->
        println("这个是匿名函数，没有名字")
        a.toString() + b
    }

    //如果函数有俩个参数，可以吧lambda放到括号外边
    haha2(1){ a: Int, b: String ->
        println("这个是匿名函数，没有名字")
        a.toString() + b
    }

    //或者直接传入lambda变量
    haha2(1,name)

    val aa = haha1()
    println(aa(6666, "测试"))
}

//只有一个参数参数为lambda
fun haha(name: (Int, String) -> String) {
    println(name(444, "测试"))
}

//有多个参数，包括lambda
fun haha2(tetx:Int,name: (Int, String) -> String){

}

//返回值为lambda
fun haha1(): (Int, String) -> String {
    return name
}

//  (Int,String) -> String  括号里面是参数，箭头后面是返回值，这个就是lambda表达式
//最原始的lambda
var name: (Int, String) -> String = fun(a: Int, b: String): String {
    println("这个是匿名函数，没有名字")
    return a.toString() + b
}

//lambda赋值给变量
var ccccc = name


//第一次优化去掉 fun 和return，参数写在大括号中，返回值可以根据最后一行推断
var name1: (Int, String) -> String = { a: Int, b: String ->
    println("这个是匿名函数，没有名字")
    a.toString() + b
}

//第二部分优化 ，去掉前面数据，前面数据可以根据后面推断出来，最简化的写法
var name2 = { a: Int, b: String ->
    println("这个是匿名函数，没有名字")
    a.toString() + b
}

var aa: () -> Unit = fun() {

}

var aa1: () -> Unit = {

}

var aa2 = {
}










