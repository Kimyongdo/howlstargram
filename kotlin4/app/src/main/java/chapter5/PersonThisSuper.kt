package chapter5.ThisSuper

open class Person{
    constructor(firstName:String){
        println("[Person] firstName:+onlyString $firstName")
    }
    constructor(firstName: String, age:Int){
        println("[Person] firstName+age : $firstName, $age")
    }

}

class Developer:Person{
    constructor(firstName: String):this(firstName,10){
        println("[Developer]onlyString $firstName")
    }
    constructor(firstName: String, age: Int):super(firstName,age){
        println("[Developer]+age $firstName, $age")
    }
}

fun main(){
    val sean = Developer("Sean")
}
