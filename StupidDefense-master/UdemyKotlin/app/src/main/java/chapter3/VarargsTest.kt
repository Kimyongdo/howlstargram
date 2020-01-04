package chapter3

fun main(){
    normalVarargs(1,2,4)
    normalVarargs(35,67,88)
}

fun normalVarargs(vararg counts:Int){
    for(num in counts){
        println("$num 입니다.")
    }
}