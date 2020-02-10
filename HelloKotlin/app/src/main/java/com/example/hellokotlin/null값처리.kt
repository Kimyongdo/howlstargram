package com.example.hellokotlin

fun main(){
var a:String?=null
    println(a?.toUpperCase())
    println(a?:"default".toUpperCase()) //null인경우 문자열 default가 나옴 -> toUpperCase를 만나 DEFAULT가 나옴
  //  println(a!!.toUpperCase()) //에러 발생 - 아래문장들 쭉 안나와서 주석처리함

    a?.run{//a가 null이기에 스코프함수 run이 실행되지 않음
        println(toUpperCase())
        println(toLowerCase())
    }

var b:String?="Kotlin Exam"

    //스코프함수를 사용하면 null체크를 위해 if문을 쓰지 않아도 되기에 상당히 편한기능
    b?.run{
        println(toUpperCase())
        println(toLowerCase())
    }

    var c= Product("콜라",1000)
    var d= Product("콜라",1000)
    var e =c
    var f = Product("사이다",1000)

    println(c==d)//t
    println(c===d)//f
    println(c==e)//t
    println(c===e)//t
    println(c==f)//f
    println(c===f)//f



}

//var aaa:String?=null이라면 nullpointException가능성 때문에
//if(aaa!=null)체크를 해줘야하는데 null체크를 하기 편하게 하는 방법은 다음과 같음

// ?. == null safe operator
// sample?.toUpperCase()는 참조연산자를 실행하기전에  먼저 객체가 null인지 확인하고
// 객체가 null이라면  sample?. 뒤에 따라오는 toUpperCase()를 실행하지 않음

// ?: == elvis operator
// 객체가 null이 아니라면 그대로 사용하지만 null이라면
// sample?:"default"로 대체되는 연산자(sample이 null이니까 대신 default를 써야겠군

// !!. == non-null assertion operator
// 참조연산자를 사용할때 null여부를 컴파일시 확인하지 않도록 하여
// 런타임시 null pointer exception이 나도록 의도적으로 방치하는 연산자

//변수의 동일성 체크하는 방법
//동일성 - 내용의 동일성, 객체의 동일성
//내용의 동일성 = 서로 다른곳에 할당된 객체라고해도  내용이 같다면 동일하다고 판단
// 코틀린의 모든 클래스가 내부적으로 상속받는 'Any'라는 최상위 클래스의 equals()함수가
// 반환하는 Boolean값으로 판단
// a==b

//객체의 동일성 = 서로 다른 변수가 메모리상에 같은 객체를 가리키고 있을 떄만 동일하다고 판단
//a===b

class Product(val naming:String, val pricing:Int){
    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return other.naming == naming && other.pricing == pricing
        }else{
            return false
        }
    }
}

