package com.richo.test.kotlin_java_mix.kotlin

import com.richo.test.kotlin_java_mix.java.Service

data class User(val username:String) {
    fun doSomethingCircular() = Service().toString()
}
