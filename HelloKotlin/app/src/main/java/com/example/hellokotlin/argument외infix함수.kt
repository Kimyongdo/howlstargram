package com.example.hellokotlin

fun main(){
    read(7)
    read("감사합니다")
    //자료형을 구분하여 함수가 매칭되어 실행되는 것을 볼 수 있음
    deliverItem("짬뽕")
    deliverItem("책",3)
    deliverItem("노트북",30,"학교")
    deliverItem("선물", destination = "친구집 ") //중간값 count를 제외하고 넣어지게 할 수 있다.

    sum(1,2,3,4)

    println(6 multiply 4)
    println(6.multiply(4)) //이렇게 써도 작동됨
    //좌측 6이 infix 함수가 적용된 객체 자신, this에 해당한다
    //우측에 붙은 4가 패머리티인 x에 해당

    //class안에서 infix함수를 선언할때에는 적용할 클래스가 자기자신이므로
    //infix fun multiply(x:Int):Int = this*x


}

fun read(x:Int){
    println("숫자 $x 입니다")
}

fun read(x:String){
    println(x)
}

//패러미터가 없다면 지정된 기본값을 출력한다
fun deliverItem(name:String, count:Int=1, destination:String="집"){
    println("${name}, ${count}개를 ${destination}에 배달하였습니다")
}

// named argument = 패러미의 순서와 상관없이 패러미터의 이름을 사용하여
//직접 패러미터의 값을 할당하는 기능

//같은 자료형을 개수에 상관없이 패러미터로 받고 싶을 때
//사용하는 variable number of arguments(vararg)
//vararg는 개수가 지정되지 않은 패러미터라는 특징이 있기에
//fun sample(text:Strong, varage x:Int)항상 끝에 써야한다는 점 잊지 말기


fun sum(vararg numbers:Int){
    var sum=0
    for(n in numbers){ //varage를 쓰면 배열처럼 쓸 수 있음.
        sum+=n
    }
    println(sum)
}

//함수 이름을 infix함수가 적용될 자료형.이름으로 지정 (Int.multiply())
//반환값은 Int
//반환값은 this*x로 반환

infix fun Int.multiply(x:Int):Int = this*x
