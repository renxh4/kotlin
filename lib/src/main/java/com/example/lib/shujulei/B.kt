package com.example.lib.shujulei

sealed class B

data class C(var B: B) : B()

object D : B()



