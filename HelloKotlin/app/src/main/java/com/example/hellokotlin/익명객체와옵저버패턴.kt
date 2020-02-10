package com.example.hellokotlin

fun main(){
    EventPrinter().start()
}

interface EventListener{
   fun onEvent(count:Int)
}

class Counter2(var listener:EventListener){ //listenr변수는 EventListner을 상송받음
    fun count(){
        for(i in 1..100){
            if(i%5==0) listener.onEvent(i)
        }
    }
}

class EventPrinter:EventListener{ //EventListner를 상속받음
    override fun onEvent(count: Int) { //interface이므로 override 필수
        print("${count}-")
    }
    fun start(){
        val counter = Counter2(this) //this는 EventPrinter객체 자신을 나타내지만 받는 쪽에서 EvnetListener만 요구했기에
        //EventListenr구현부만 넘겨주게 됩니다 이를 객체지향의 다향성이라 부른다.
        counter.count()
    }
}


//옵저버 - 이벤트 기능을 감시(키입력, 데이터 입력 등)
//이벤트 : 함수로 직접요청하지 않았지만 시스템,루틴에 의해 발생되는 동작
//옵저버 패턴 : 이벤트가 발생할때마다 즉각적으로 처리하는 패턴
//옵저버=리스너 -> 이벤트를 넘겨주는 행위를 콜백(callback)이라고 한다.

// class EventPrinter->  interface EventListenr <-class Counter

//