package com.example.lib.lam


//内联函数
class CC {
    fun ccfun(){

    }
}

//内联函数
inline fun text(aa: (Int, String) -> String) {

}


inline fun text1(bb:Int,noinline aa: (Int, String) -> String) {

}

fun text2(){
    innerFun {
        //return  //错误，不支持直接return
        //只支持通过标签，返回innerFun
        return@innerFun 1
    }

    //匿名函数可以直接return
    var f = fun(){
        return
    }

    //如果是内联函数则可以直接return
    innerFun1 {
        return
    }

    //加上crossinline则不可直接返回
    innerFun2 {
        return@innerFun2 1
    }
}

fun innerFun(a: () -> Int) {

}

inline fun innerFun1(a: () -> Int) {

}

inline fun innerFun2(crossinline a: () -> Int) {

}












