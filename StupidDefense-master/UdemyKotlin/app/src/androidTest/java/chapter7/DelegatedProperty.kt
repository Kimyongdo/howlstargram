package chapter7.DelegatedProperty

import kotlin.properties.Delegates

class User{
    var name:String by Delegates.observable("NONAME"){
        property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main(){
    val user = User()
    user.name="Kildong"
    user.name="Dooly"
}