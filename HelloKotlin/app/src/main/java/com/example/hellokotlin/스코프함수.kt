package com.example.hellokotlin

fun main(){

    var price = 5000 //class Book에 있는 변수명과 같게 한 경우


    var a = Book("디모의 코틀린",10000)
    a.name="초특가"+a.name
    a.discount()
    println(a.name)
    println(a.price)

    var b = Book("디모의 코틀린",10000).apply {
        name="[초특가]"+name
        discount() //apply를 사용하면 초기화과정에서 참조연산자 없이 사용 가능
    }
    //apply를 적용하여 참조연산자 없이 깔끔하게 사용할 수 있음.
    println(b.name)
    println(b.price)

    b.run {
        println("상품명:${name},가격:${price}원") //run을 통해 내부 b.name을 사용 안함
    }//인스턴스 내의 price속성보다 run이 속해있는 main함수의 price변수를 우선시하고 있음
    //이를 방지하기 위해 let, it.name, it.price을 사용
    b.let {
        println("상품명:${it.name},가격:${it.price}원") //8000원이 나옴
    }
    //run이라면 let
    //apply라면 also로 대체

   var c = a.run {//run은 이미 인스턴스가 만들어진 후에 인스턴스의 함수나 속성을 scope내에서 사용해야할때 유용
       println(a.price) //가격은 출력
       a.name //이름은 반환하여 c라는 변수에 할당.
   }
    println(c)
}


//람다함수 -> 여러줄을 사용할 수 있다.
val c:(String)->Unit ={str->
    println("$str 람다함수")
    println("여러구문을")
    println("사용가능합니다")
}

val calcualte:(Int,Int)->Int ={a,b-> //(Int,Int) - int 패러미터가 2개
    println(a)
    println(b)
    a+b//마지막 구분값인 a+b를 Int로 반환함.
}

//with은 run과 동일한 기능을 가지지만 단지 인스턴스를 참조연산자 대신
//패러미터로 받는 차이뿐
//a.run  // with(a) 정말 이것뿐

//also와 let은
//처리가 끝나면 인스턴스를 반환 applay / also
//처리가 끝나면 최종값을 반환 run/let
//apply와 run이 참조연산자 없이 인스턴스의 변수와 함수를 사용할수 있다면
//aslo와 let은 마치 패러미터로 인스턴스를 넘긴것처럼 it을 통해서 인스턴스 사용 가능
//같은 이름의 변수나 함수가 scope바깥에 중복되어있는 경우에 혼란 방지하기 위함


//람다함수에 패러미터가 없다면?
val a:()->Unit = {println("패러미터가 없어요")} //()에 자료형이 없다면 실행할 구문만 나열

//패러미타가 하나뿐이라면 it 사용
val d:(String)->Unit = { println("$it 람다함수")} // 패러미터가 하나라면 it으로 대체 가능함

//클래스 내에 생성된 인스턴스를 scope함수에 전달 스코프함수 내에서 인스턴스의 속성이나 함수 사용 가능
//스코프함수 : apply run with also let
//apply : 인스턴스 생성한 후, 변수에 담기전, 초기화 과정 수행할때 많이 사용



class Book(var name:String, var price:Int){
    fun discount(){
        price-=2000
    }
}

