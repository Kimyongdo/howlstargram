package com.example.hellokotlin

class Teacher: Person {

    var subject:String

    constructor(name:String,age:Int,subject:String):super(name,age){
        this.subject =subject
        println("create Teacher")
    }

    override fun show() {
        println("name :$name age:$age subject:$subject")
    }
}