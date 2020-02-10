package com.example.hellokotlin

open class Person constructor(var name:String, var age:Int) {
    init {
        println("Person object")
    }

    open fun show(){
        println("name: $name, age:$age")
    }


}