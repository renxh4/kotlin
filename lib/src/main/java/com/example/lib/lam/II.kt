package com.example.lib.lam

class II {

    fun test() {
        val test = listOf(1, 3, 5, 7, 9)
        // filter函数遍历集合并选出应用给定lambda后会返回true的那些元素
        println("大于5的数 ${test.filter { it > 5 }}")
        //map函数,我理解对应的应该是变换，遍历集合中的每个数据，然后通过lambda进行数据变换，加入新的集合然后返回
        test.map { it * it }

        println("把集合中所有数据平方${test.map { it * it }}")

        println("把集合中所有数据变为字符串${test.map { "haha$it" }}")

        // all判断是否全部符合lambda表达式的条件
        println("是否全部符合>10 ${test.all { it > 10 }}")

        // any判断是否存在有符合lambda表达式的条件的数据
        println("是否存在>8 ${test.any { it > 8 }}")

        // count获取符合lambda表达式条件的数据个数
        println("大于5的个数 ${test.count { it > 5 }}")

        // find获取符合lambda表达式条件的第一个数据
        println("第一个大于5 ${test.find { it > 5 }}")
        println("最后一个大于5 ${test.findLast { it > 5 }}")


        val test1 = listOf("a", "ab", "b", "bc")
        // groupBy 先遍历每个元素，然后把元素返给lambda，根据lambda的规则生成key，然后元素作为value组成新的map返回
        println("按首字母分组 ${test1.groupBy { it[0] }}")

        // partition按照条件进行分组，该条件只支持Boolean类型条件，first为满足条件的，second为不满足的
        println("满足条件的")
        test1.partition { it.length > 1 }.first.forEach { print("$it、") }
        println()
        println("不满足条件的")
        test1.partition { it.length > 1 }.second.forEach { print("$it、") }
        println()

        // flatMap首先遍历每个元素 按照lambda表达式对元素进行变换，再将变换后的列表合并成一个新列表
        println(test1.flatMap { it.toList() })


        val test2 = listOf(3, 2, 4, 6, 7, 1)
        //排序 低-->高
        println(test2.sortedBy { it })
        //排序 高-->低
        println(test2.sortedByDescending { it })


        val test3 = listOf(3, 2, 4, 6, 7, 1)
        // 获取前3个元素的新切片
        println(test3.take(3))
        // 获取指定index组成的新切片
        println(test3.slice(IntRange(2, 4)))

        val test4 = listOf("a", "ab", "b", "bc")

        // reduce函数将一个集合的所有元素通过传入的操作函数实现数据集合的累积操作效果。
        println(test4.reduce { acc, name -> "$acc$name" })


        val testList = listOf(Test("xys", 18), Test("qwe", 12), Test("rty", 10), Test("zxc", 2))

        // 函数的链式调用
        println("集合调用 展示age大于10的name ${
            testList.filter { it.age > 10 }
                .map { it.name }
        }"
        )


        //函数的序列操作
        println("集合调用 展示age大于10的name1 ${
            testList.asSequence()
                .filter { it.age > 10 }
                .map { it.name }.toList()
        }"
        )


        val test5 = listOf("ab", "abc", "bd", "bcs")

        println(
            "fold 的使用==${
                test5.fold("初始值") { acc, s ->
                    acc + s
                }
            }"
        )
    }

    class Test(var name: String, var age: Int)


}


fun lateAdd(a: Int, b: Int): () -> Int {
    fun add(): Int {
        return a + b
    }
    return ::add
}

fun main() {
    II().test()

    val add = lateAdd(1, 2)

    println(add.invoke())
}


