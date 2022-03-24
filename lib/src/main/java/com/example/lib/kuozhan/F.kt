package com.example.lib.kuozhan

class F {
    companion object {
        fun get(): F? {
            return null
        }
    }
}

fun F?.text(): String {
    if (this == null) {
        return "空的"
    }

    return "不为空"
}

fun main() {

    var f = F.get()

    println(f.text())

}

