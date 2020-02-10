package chpater7.propertyoverride

open class First(){
    open val x:Int =0
    get(){
        println("First x")
        return field
    }
    val y:Int =0
}

class Second:First(){
    override val x:Int=0
    get(){
        println("Second x")
        return field+3
    }
    //ovrride val y:Int=0

}

fun main(){
    val second=Second()
    println(second.x)//3
    println(second.y)//0


}