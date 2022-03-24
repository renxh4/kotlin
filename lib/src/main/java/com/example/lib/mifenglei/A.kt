package com.example.lib.mifenglei

sealed class A

class B : A()

class C : A()


fun text1(a:A) = when(a){
    is B -> println("is b")
    is C -> println("is c")
}








