package com.example.kotlin

fun main() {
    var a=0
    while(a<5){
        print(a++)
    }

    println()

    var b=0
    do{
        print(b++)
    }while(b<5)
    //최초 한번은 무조건 실행하고 싶은 경우 do-while를 사용

    println()

    for(i in 0..9){ //var를 사용하지 않는다. 증가값은 기본적으로 1씩 증가
        print(i)
    }
    println()

    for(i in 0..9 step 3){ //step을 사용하여 3씩 뛰어넘을 수 있다.
        print(i)
    }

    println()
    for(i in 9 downTo 0 step 3){ //1씩 감소하는 것을 알 수 있음.
        print(i)
    }

    println()
    for(i in 'a'..'e'){
        print(i)
    }
}