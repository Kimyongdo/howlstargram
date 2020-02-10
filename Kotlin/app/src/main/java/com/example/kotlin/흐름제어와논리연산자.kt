package com.example.kotlin

fun main(){
  for(i in 0..9){
      if(i==3) break
      print(i)
  }

    println()
    for(i in 0..9){
        if(i==3) continue
        print(i)
    }

    println()
    Myloop@for(i in 1..10){
        for(j in 1..10){
            if(i==1 && j==2) break@Myloop
            print("i: $i, j:$j")//""안에 $변수면 변수값이 나옴
        }
    }
    println()
    //고전 언어에서는 break를 안쪽 바깥쪽에 지정하여 정했다면
    //레이블(마음대로)와 @을 넣어


    println(true && true)
    println(true || false)
    println(!true)
    println(!false)

    var a =6
    var b =5
    println(a>5 && b>5)
}

//&& || !
//return : 함수 종료 - 값을 반환
//반복문 -
// break - 즉시 반복문 종료 다음구문 이동
// continue - 다음 반복조건으로 즉시 이동


