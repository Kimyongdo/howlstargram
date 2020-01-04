package chapter11.withtest

fun main(){
    data class User(val name:String, var skiils:String, var email:String?=null)
    val user = User("Kildong","default")
    val result = with(user){
        skiils="Kotiln"
        email="asdf@naver.com"
    }
    println(user)
    println(result)
}

