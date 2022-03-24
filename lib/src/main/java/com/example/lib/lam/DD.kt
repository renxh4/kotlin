package com.example.lib.lam

import com.example.lib.danli.B
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

//泛型类
class DD<K,V> (key : K, value : V){
    var key : K  = key
    var value : V= value
}

//泛型方法，java 中T extends Object = kotlin中 T : Any  继承Any 可以控制T为非空
fun <T : Any>text(cccc : T) : String{

    return cccc.javaClass.simpleName
}

//泛型指定多个约束，T 必须要继承CharSequence和Appendable
fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {

}

fun <T : Any> process(value: T) {
//    if (value is List<String>) {
//        // error
//    }

    if (value is List<*>) {
        // ok
    }

    var list = listOf<Int>(1, 2, 3)
    if (list is List<Int>) {
        // ok
    }
}

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?:
    throw IllegalStateException("List is expected")
    println(intList.sum())
}

//没有报错，内联函数可以实例化参数类型
inline  fun<reified T> tetx1(value : Any) = value is T

//报错，因为类型擦除 ，不能确定T的类型
//fun<T> tetx2(value : Any) = value is T

// inline fun <T, R> T.let(block: (T) -> R): R {
//    //可以看到调用了函数参数的函数，传递参数为调用 let 函数的对象实例，返回值为函数参数调用返回值
//     println(this)
//    return block(this)
//}

public inline fun <T, R> with1(receiver: T, block: T.() -> R): R {

    return receiver.block()
}

public inline fun <T, R> T.run(block: T.() -> R): R {
    return block()
}


public inline fun <T> T.apply1(block: T.(Int) -> Unit) {
    block(2)
}

public inline fun <T> T.also1(block: T.(T) -> Unit): T {
    block(this)
    return this
}

fun main(){
   var cc =  CC().let {
        "hahah"
    }

//    println(cc)
//
//    var c11= CC()
//
//    with1(c11){
//        ccfun()
//    }
//
//    CC().run {
//        ccfun()
//    }
//
//    CC().also1 {
//        it.ccfun()
//    }
//
//    var aa = CC().apply1 { a:Int->
//        ccfun()
//        println("收到了"+a)
//    }



}






