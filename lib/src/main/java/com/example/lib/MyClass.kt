package com.example.lib

class MyClass {
    var name: String = "小明"

    val name1: String = "小红"

    var name2 = "haha"


    fun aa() {
        var aaa: Int
        aaa = 22
        val aa: String
        aa = "aa"
    }


}


fun main() {
//    aa(1, 2, 3, 4, 5)

//    bb()

//  cc()
//    array()

    var text = """
        多行字符串
        多行字符串
        多行字符串
        """

    println(text)

    var text1 = """
       | 多行字符串
       | 多行字符串
       | 多行字符串
        """.trimMargin()

    println(text1)

    val price = """
${'$'}9.99
"""
    println(price)
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun printMsg(msg: Int): Unit {
    print(msg)
}

fun printMsg1(msg: Int) {
    print(msg)
}

fun aa(vararg a: Int) {
    for (v in a) {
        print(v)
    }
}

fun bb() {
    val sunLambda: (a: Int, b: Int) -> Int = { x, y -> x + y }
    print(sunLambda(1, 2))
}

var a = 1

var ss = "value = $a"

var sss = "value = ${sum(3, 4)}"

var a2: String? = "123"

var a1: String = "123"

fun aa(aa: Any) {
    val b: String? = "Kotlin"
    if (b != null && b.length > 0) {
        print("String of length ${b.length}")
    } else {
        print("Empty string")
    }


    var length: Int? = a2?.length

    var length1: Int = a2!!.length

    var length2: Int = a2?.length ?: -1

    if (aa is String) {
        //此时已经自动转换类型为String
        println(aa.length)
    }

    if (aa !is String) {
        return
    }
    //这里会自动转换String
    println(aa.length)


}

fun cc() {
    var i = 1
    if (i in 1..4) {
        //相当于 1<=i<=4
        println(i)
    }

    for (j in 1..4) {
        //输出1，2，3，4
        println(j)
    }

    for (k in 4 downTo 1) {
        //输出4，3，2，1
        println(k)
    }


    for (l in 1..5 step 2) {
        //输出1，3，5
        println(l)
    }

    for (g in 1 until 4) {
        //输出1，2，3不包含4
        println(g)
    }

}

var d: Byte = 1

var f: Int = d.toInt()

var l = 1L + 4 //Long + Int  =》Long

fun array() {
    //定义数组[1,2,3]
    var array = arrayOf(1, 2.3)


    //定义数组 [0,2,4]
    var array1 = Array(3, { i -> i * 2 })

    //创建一个容量为6的Int 空数组
    var arrayOfNulls = arrayOfNulls<Int>(6)

    array.forEach { it ->
        println(it)
    }

    array1.forEach {
        println(it)
    }

    arrayOfNulls.forEach {
        println(it)
    }

}






