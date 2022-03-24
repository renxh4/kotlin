package com.example.lib


fun main() {
//    text4()
//    text5()
//    text6()
//    text7()
    text8()
}


fun text1() {
    for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue
            }
            println("$i -> $j")
        }
    }
}

fun text2() {
    look@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                continue@look
            }
            println("$i -> $j")
        }
    }
}

fun text3() {
    for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                break
            }
            println("$i -> $j")
        }
    }
}

fun text4() {
    hello@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                break@hello
            }
            println("$i -> $j")
        }
    }
}

fun text5() {
    var arr = arrayOf(1, 2, 3, 0, 4, 5, 6)

    arr.forEach {
        if (it == 0) return
        println(it)
    }
}

fun text6() {
    var arr = arrayOf(1, 2, 3, 0, 4, 5, 6)

    arr.forEach hhh@{
        if (it == 0) return@hhh
        println(it)
    }
}

//隐士式法
fun text7() {
    var arr = arrayOf(1, 2, 3, 0, 4, 5, 6)

    arr.forEach {
        if (it == 0) return@forEach
        println(it)
    }
}

// Lambda 法 -> 相当于递归
fun text8(){
    var arr = arrayOf(1, 2, 3, 0, 4, 5, 6)

    arr.forEach(fun(value: Int) {
        if (value == 0) return
        println(value)
    })
}








