package com.example.kkangsam

val threeVal =10
val canString:String?=null //타입에 ?를 붙이면 null 사용가능
const val myConst=10 //final == const
val sayhello:String?=null

fun main(){
    println("일반변수 : ${threeVal}")
    println("? 추가하면 null 가능 : ${canString}")
    println("fianl 효과 : ${myConst}")
    println("sum 함수 만들기 : ${sum(1,3)}") //1+2+3
    println("sum 함수 싱글형 : ${sum2(1,4)}")
    sayHello("안녕")
    sayHello(sayhello)
    setsayHello(name="KIM",number=10) //함수 매개변수에 =을 사용하면 여기서도 =으로 표시함.

    //infixClass함수 소환
    //infix(중위표현식) 이란연산자를피연산자의중간에위치시킨다는개념
    var obj = InfixClass()
    obj.infixFun(4)
    obj infixFun 10 //위와 같은 형식을 내포

    //가변인수 varage

    valueNumber(10,20,false)

    //루프함수
    loopfun(5)
    println()
    //재귀함수 - 자기 이름 함수명 안에 자기함수
    recPrint(3,1)
}

//sum함수 만들기
fun sum(a:Int,b:Int):Int{ //Int를 안 쓰면 타입이 기본인 Unit으로 변경
    var sum=0
    for(i in a..b){
        sum+=i
    }
    return sum
}

//sum함수 싱글표현
fun sum2(a:Int, b:Int) =a+b

//null이 가능하게 만들기
fun sayHello(name:String?){
    if(name==null){
        println("null입니다 ${name}입니다.")
    }else{
        println("null이 아닙니다.")
    }
}

//set하기.
fun setsayHello(name:String="안녕", number:Int){
    println("기본값이 안녕이 맞습니다.")
}

//infix
class InfixClass{
    infix fun infixFun(a:Int){
        println("infitx실행중 값은 ${a}입니다")
    }
}

//정확히 이게 뭔지를 모르겠네
fun <T> valueNumber(a:Int, vararg array:T){
    for(a in array){
        println(a)
    }
}

//루프함수
fun loopfun(a:Int){
    var count=1
    while (true){
        print("${count}, ")
        if(a==count) return
        else count++
    }

}

//재귀함수
fun recPrint(a:Int,b:Int){
    println("${a},${b} 루프함수 진행중")
    return if (a==b) return else recPrint(a-1,b)
}

//tailerc은 내용이 어려워서 잠시 패스하기로 합니다.