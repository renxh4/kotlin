package com.example.lib


fun main() {
//    textwhen(11)

//    var text = text(1)

//    println(text)

    arra()
}

fun text() {
    var a: Int = 1
    var b: Int = 2

    var max: Int

    //普通使用
    if (a > b) max = a

    //带有else使用
    if (a > b) {
        max = a
    } else {
        max = b
    }

    //if表达式返回值返回值
    var min = if (a > b) b else a

    if (a in 0..3) {
        println(a)
    }

}


fun textwhen(a: Int) {
    when (a) {
        1 -> println("输入1")
        2 -> println("输入2")
        else -> println("不是12")
    }

    when(a){
       1,2-> println("输入12")
       else-> println("不是12")
    }

    var items = setOf<Int>(1, 2, 11)
    when(a){
        in 0..10 -> println("在区间0-10内")
        in items-> println("在集合内")
        else-> println("不在区间内")
    }
}

fun text(a : Any)= when(a){
    is String -> true
    else -> false
}

fun arra(){
    var array = arrayOf(1, 2,3)

    for (a in array){
        println(a)
    }


    for (a in array.indices){
        println(array[a])
    }

    for ((index,value) in array.withIndex()){
        println("the element at $index is $value")
    }


    for (a in 1..4){
        println(a)
    }

    for (a in 6 downTo 0 step 2){
        println(a)
    }

}

