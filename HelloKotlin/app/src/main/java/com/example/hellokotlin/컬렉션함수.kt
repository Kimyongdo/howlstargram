package com.example.hellokotlin

fun main(){
 val namelist = listOf("박수영","김지수","김다현","신유나","김지우")
     namelist.forEach{println(it+"")}
    println()
    println(namelist.filter { it.startsWith("김") })
    println(namelist.map{"이름:"+it})
    println(namelist.any{it=="김지연"})
    println(namelist.all{it.length==3})//이름이 전부 3글자인지
    println(namelist.none { it.startsWith("이") })
    println(namelist.first { it.startsWith("김") })//김씨 사람 첫번째
    println(namelist.last { it.startsWith("김") })//김씨 사람 마지막
    println(namelist.count { it.contains("지") })
}

// collection.forEach{println(it)} 하나씩 출력
// collection.filter{ it<4 }  it에 해당하는 조건만 출력
// collection.map{it*2} 각 수식의 값을 *2
// collection.any{it==0} 하나라도 조건에 맞으면 true
// collection.all{it==0} 모두 조건에 맞으면 true
// collection.none{it==0} 하나도 조건에 맞지 않으면 true
// collection.first{it>3} 조건에 맞는 첫번째 아이템 반환 last->find
// collection.last{it>3} 조건에 맞는 마지막 아이템 반환 last->findLast
// firstOrNull lastOrNull을 사용하면 객체가 없는 경우 null을 반환
// collection.count() 포함된 모든 아이템 개수 반환

//컬렉션함수는 람다함수를 이용하여 컬렉션을 편하게 조작가능항 함수로