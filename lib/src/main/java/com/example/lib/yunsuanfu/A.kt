package com.example.lib.yunsuanfu
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

lateinit var c :String
class A {
    var a : String by Delegate()
}

class Delegate{
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}


class Teacher {
    var name: String by Delegates.notNull()
}
fun main(args: Array<String>) {
    val teacher = Teacher().apply { name = "Mikyou" }
    println(teacher.name)

    var a = A()

    println(a.a)

    a.a="haha"

    println(a.a)


}


