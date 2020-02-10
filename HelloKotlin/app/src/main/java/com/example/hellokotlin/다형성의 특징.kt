package com.example.hellokotlin

fun main(){
 var a = Drink()
    a.drink()

    var b:Drink= Cola() //변수 b는 Drink의 변수지만 Cola의 인스턴스를 담았기에 Cola가 기준이 된다
    b.drink()          //다만 오버라이드가 안된 washdishes는 불가
                       //이를 해결하기 위해 is나 as를 통해 다운캐스팅 실행
    if(b is Cola){ //b가 Cola와 호환되는지 여부를 확인 //is는 조건문 안에서만 잠시 다운캐스팅
        b.washDishes()
    }

    var c =  b as Cola //다운캐스팅을 통해 c에 할당
    c.washDishes()
    b.washDishes() //as를 사용하면 b의 변수값 이외에도 변수 자체도 다운캐스팅이 됨


}

open class Drink{ //상속가능하도록 open을 만듦
    var name="음료"

    open fun drink(){ //함수를 만들고 open을 사용하여 오버라이드가 가능하게 한다
        println("${name}를 마십니다") //name은 클래스 내의 멤버변수를 얻는다
    }
}

class Cola:Drink(){ //Drink를 상속받음
    var type ="콜라"
    override fun drink() {
        println("${name}중에 ${type}를 마십니다")
    }

    fun washDishes(){
        println("${type}로 설거지를 합니다")
    }
}


// as는 변수를 호환되는 자료형으로 변환해주는 캐스팅 연산자
// is는 변수가 자료형에 호횐되는지를 먼저 체크한 후 변환해주는 캐스팅
