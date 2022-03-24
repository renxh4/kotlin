package com.example.lib.lam

class EE {
    //定义普通的变量
    var a: Int = 1
}

var fun1: (Int, Int) -> String = fun(a: Int, b: Int): String {
    return "测试$a+$b"
}

var fun2: (Int, Int) -> String = { a: Int, b: Int ->
    "测试$a+$b"
}

var fun3 = { a: Int, b: Int ->
    "测试$a+$b"
}

var fun4: (Int, Int) -> String = { a, b ->
    "测试$a+$b"
}

fun test(ation: (a: Int, b: Int) -> String): String {
    return ation(1, 2)
}


fun test1(a: Int): () -> String {
    return {
        "返回了$a"
    }
}


fun test2(a: Int, ation: (a: Int, b: Int) -> String): String {
    return ation(1, 2)
}

//匿名函数
var fun5 = { a: Int, b: Int -> "" }

//具名函数，正常的函数
fun fun6(a: Int, b: Int): String {
    return "11$a+$b"
}

fun text33(): () -> Int {
    var a: Int = 1
    return { a++ }
}

fun main() {
//    println(fun1(100, 200))
//
//    println(fun2(300, 400))
//
//    println(fun3(400, 500))
//
//    println(fun4(33, 33))
//
//    println(test({ a, b -> "ss$a+$b" }))
//
//    println(test { a, b -> "haha$a+$b" })
//
//    val bb = test1(1)
//    println(bb())
//
//
//    test2(1) { a: Int, b: Int -> "" }
//
//    test2(1, { a: Int, b: Int -> "" })

//    //获取fun6函数的引用
//    test2(22, ::fun6)
//    //直接传入匿名函数变量
//    test2(22, fun5)
//
//    //直接实现匿名函数
//    test2(1) { a: Int, b: Int -> "" }

    val result = text33()

    println(result())
    println(result())


}