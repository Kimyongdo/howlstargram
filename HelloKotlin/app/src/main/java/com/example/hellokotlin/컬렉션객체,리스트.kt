package com.example.hellokotlin

fun main(){
 var a = listOf("사과","딸기","배")
    println(a[1])
    for(fruit in a){ //리스트 a에서 요소를 하나씩 꺼내서 fruit에 할당해줌
        print("${fruit}:")
    }
    println()
    var b = mutableListOf(6,3,1)
    for(number in b){
        print("${number}:")
    }
    b.add(4)
    println()
    println(b) //b만써도 다 출력 [ ]는 자동으로 나오는 듯
    b.add(2,8) //2번자리에 8을 넣기
    println(b)
    b.removeAt(1)  //1번자리 삭제 At을 사용
    println(b)
    b.shuffle()  //무작위 섞기
    println(b)
    b.sort() //순서대로 정렬
    println(b)
}

//컬렉션을 상속받는 List, set, Map 중 List는 가장 단순한 형태
//List에는 List<outT>와 MutableList<T>
//List<outT>는 생성시에 넣은 객체를 대체,추가,삭제 할 수 없음
//MutableList<T>는 생성시에 넣은 객체를 대체,추가,삭제 할 수 있음.
