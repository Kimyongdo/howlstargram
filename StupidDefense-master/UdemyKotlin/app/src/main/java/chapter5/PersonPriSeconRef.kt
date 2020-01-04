package chapter5.personprice

open class Person(firstName:String, out:Unit= println("[Primary Constructor] Parameter")){
    val fName = println("[Primary Constructor] Person fName : $firstName")
    init {
        println("[init] Personinit block")
    }

    constructor(firstName: String, age:Int, out:Unit= println("[Secondary Constructor] Parameter")):this(firstName){
        println("[Secondary Constructor] Person Body : $firstName, $age")
    }
}


fun main(){
    val p1 = Person("Kildong",30)
    println()
    val p2 = Person("Dooly")
}