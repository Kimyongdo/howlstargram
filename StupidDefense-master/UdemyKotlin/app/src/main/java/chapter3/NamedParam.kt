package chapter3

fun main(){
    namedParm(x=200, z=100)
    namedParm(z=150)
    namedParm(20,50,700)



}

fun namedParm(x:Int=100, y:Int=200, z:Int){
    println(x+y+z)
}