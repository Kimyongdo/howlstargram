package chpater7.lateinit

class Person{
    val name2:String="name" //초기화
    lateinit var name:String //늦은 초기화
    fun test(){
        if(!::name.isInitialized){
            println("not initilized")
        }else{
            println("initialized")
        }
    }
}

fun main(){
    val kildong = Person()
    kildong.test()
    //kildong.name - lateinit property name has not been initialized 오류
    kildong.name="Kildong"
    kildong.test()
    println("kildong.name : ${kildong.name}")
}