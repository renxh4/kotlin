package com.example.lib.text2

class B :A ,C{
    override var name: String  ="22"
    override fun text() {
    }

    override fun text1() {
        super<A>.text1()
        super<C>.text1()
    }


}