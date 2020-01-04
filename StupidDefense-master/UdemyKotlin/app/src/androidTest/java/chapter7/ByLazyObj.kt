package chapter7.BylazyObj

class Person(val name:String, val age:Int)

fun main(){
    var isPersonInstantiated:Boolean =false
    val person :Person by lazy {
        isPersonInstantiated=true
        Person("KIM",23)
    }
    val personDelegate = lazy {
        Person("Hong",40)
    }
    println("personInit : $isPersonInstantiated")
    println("personDelegate : ${personDelegate.isInitialized()}")
    println()
    println("prson.name =${person.name}")
    println("personDelegate Init : ${personDelegate.value.name}")
    println()
    println("personInit : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")

}