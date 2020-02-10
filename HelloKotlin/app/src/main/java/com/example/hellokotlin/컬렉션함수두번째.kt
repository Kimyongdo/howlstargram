package com.example.hellokotlin

fun main(){

    data class Person(val name:String, val birthYear:Int)
    val personList = listOf(
        Person("유나",1992),
        Person("조이",1996),
        Person("츄",1999),
        Person("유나",2003))

    //person객체의 년도를 기준으로 map을 만들어 출력하기
    println(personList.associateBy { it.birthYear })
    //person객체의 이름을 기준으로 map을 만들어 출력하기
    println(personList.groupBy { it.name })

    val(over98,under98) = personList.partition { it.birthYear>1998 }
    println(over98)
    println(under98)

    val numbers = listOf(-3,7,2,-10,1)
    println(numbers.flatMap { listOf(it*10, it+10) })
    println(numbers.getOrElse(1){50})
    println(numbers.getOrElse(10){50})

    val names = listOf("A","B","C","D")
    println(names zip numbers) //1:1로 대응
    


}


//associateBy : 객채에서 key를 추출하여 map으로 변환하는 함수
//groupBy : key가 같은 아이템끼리 배열로 묶어 map으로 만드는 함수
//partition : 아이템에 조건을 걸어 두개의 컬렉션으로 나누어 줌
//flatMap : 아이템마다 만들어진 컬렉션을 합쳐서 반환하는 함수
//getOrElse : 인덱스 위치에 아이템이 있으면 아이템을 반환하고 아닌 경우 지정한 기본값을 반환하는 함수
//zip : 컬렉션 두개의 아이템을 1:1로 매칭하여 새 컬렉션을 만들어줌

