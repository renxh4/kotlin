package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lib.EE
import com.example.lib.text.CC
import com.example.lib.text.DD

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        EE()

        CC()

        DD()
    }
}