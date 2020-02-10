package com.example.kotlin.section3.lamdatest

fun main(){
    //인자와 함께 사용하는 경우
    withArgs("arg1","arg2",{a,b->"Hello World $a $b"})
    //withArgs()의 마지막 인자가 람다식인 경우 소괄호 바깥으로 분리 가능
    withArgs("Arg1","Arg2"){a,b->"Hello Worold $a $b"}

    twoLambda({a,b -> "First $a $b"},{"Seocnd $it"})


}
//withArgs함수는 일반 매개변수 2개를 포함, 람다식 함수를 마지막 매개변수로 가짐.
fun withArgs(a:String, b:String, out:(String,String)->String){
    println(out(a,b))
}

fun twoLambda(first:(String, String)->String, second:(String)->String){
    //first함수를 만들거야 String변수 두개에 그 결과값도 String하나.
    //Seocnd함수를 만들거야 String변수 하나에 그 결과값이 String 하나.
    println(first("oneParam","two Param"))
    println(second("oneParam"))
}
