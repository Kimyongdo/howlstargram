package com.example.kkangsam

fun main(){
    val user = user()
    println("${user.name}")
    println("${user.age}")

    user.name="kim"
    println("name : ${user.name}")

    //사용자 임의프로퍼티
    val user1 = eee()
    user1.gretting="kim"
    println(user1.gretting)
    user1.age=-1
    println(user1.age) // class안에 set get을 넣음으로써 참조했을 때 값을 변경
    //value가 매개변수 field가 이를 받아줌

    //Custom set() get()을 넣은것만으로도 효과가 나타남.
    //주생성자에 var val 변수는 custom get set 이 불가능
    //지역변수는 프로퍼티가 아님.
    println(myval22)
    myval22="asdf"
    println(myval22)

    var asdq = fff("kim")
    println(asdq.name)


}

//코틀린에서는 클래스의 변수를 프로퍼티
//var, val로 선언되는 변수들이 프로퍼티이다. =멤버변수
//getter/setter(accessor)함수가 자동으로 내장

//var로 선언한변수는 값의 획득 및 변경이 가능함 get(), set() 이 추가
// • val로 선언한 변수는 값의 변경이 불가능함으로 get() 만추가
// • get(), set() 의field는 예약어로 프로퍼티에 저장된 값 자체를 지칭

//get set field가 뭔지 모르겠네

class user{
    var name:String = "hey"
        get() = field
        set(value){field=value}


    val age:Int = 20
        get()=field

}

//사용자 프로퍼티
class eee{
    //var은 초기값 gretting이 필수적.
    var gretting:String ="heelp"
    set(value){
        field = "hello"+value
    }
    get() = field.toUpperCase()

    var age:Int=0
    set(value){
        if(value>0){
            field=value
        }else{
            field=0
        }
    }

    //val은 set을 사용할 수 없다.

    val him:String
    get()="him"
}

//꼭 클래스나 메인에 안써도 가능
//get을 사용하면 참조변수가 곧 field에 들어감
var myval22:String="hello"
get() = field.toUpperCase()

class fff(name:String){
    var name:String = name
    get() = field.toUpperCase()
    set(value) { field = "Hello"+ value}
}