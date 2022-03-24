package com.example.lib

class FF {
    var name: String = "name"
        //这个就是返回原值
        get() = field
        set(value) {
            if (value.equals("小明")){
                field="原来是小明啊"
            }
        }
}

fun  main(){
    var f = FF()

    println(f.name)
    f.name="小明"
    println(f.name)

}