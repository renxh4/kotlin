package com.example.lib.danli

interface B {
    fun click();
}

fun setClick(click: B) {

}

fun main() {
    setClick(object : B {
        override fun click() {

        }
    })
}



