package com.example.hellokotlin

fun main(){

    b(::a) //고차함수로 넘기려면 함수 이름 앞에 콜론 두개를 붙인다.
   // val c: (String)->Unit = {str:String} //val a:Int 을 쓰듯 함수의 형식을 쓴 것
    val d:(String)->Unit = {str -> println("$str 람다함수") } //String을 썼으므로 str변수가 자동으로 String임을 인지함
//람다 축약버전
    val e = {str:String -> println("$str 람다함수")}
    b(d) //d는 람다함수이므로 연산자 ::가 필요 없음
    b(e)

}


fun a(str:String){       //b를 함수로 이용하여 문자를 A로 집어넣는다.  //함수 a를 만든다.
    println("$str 함수 a")
}
                                //function:String->Unit.
fun b(function:(String)->Unit){ //문자열을 받고 반환이 없는 함수이므로
    function("b가 호출한")                          //String을 쓰고 값이 없다는 의미인 Unit을 쓴다.
}
//함수의형식은 어떻게 자료형으로 나타낼까



//함수를 마치 클래스에서 만들어낸 인스턴스처럼 취급하는 방법
//함수를 패러미터로 넘겨줄 수 있고 결과값으로 반환 받을수도 있는 방법임.
//코틀린 -> 모든함수를 고차함수로 사용 가능

//fun a(str:String){println("$str 함수 a")}
//람다함수 = 그 자체가 고차함수이므로 별도의 연산자 없이도 변수를 담을 수 있다.

