package com.example.hellokotlin

fun main(){
 val a = mutableSetOf("귤","바나나", "키위")
 for(item in a ){
  println("${item}")
 }
  a.add("자몽")
 println(a)
 a.remove("바나나")
 println(a)
 println(a.contains("귤"))

 //키와 벨류를 to로 이어준다.
 val b = mutableMapOf("레드벨벳" to "음파음파","트와이스" to "FANCY", "ITZY" to "ICY")
 for(entry in b ){
  println("${entry.key}:${entry.value}") //key와 value로 출력허
 }
 b.put("오마이걸","번지")
 println(b)
 b.remove("ITZY")
 println(b)

 println(b["레드벨벳"]) //음파음파가 나옴

}


//class Collection 중 list set map
//set은 list와 달리 순서가 정렬이 안되어있고 중복을 허용하지 않은 컬렉션
//인덱스 위치로 지정하여 객체를 참조할 수 없으며
//sample.contains("디모") 확인하는 식으로만 함
//Set<out T>과 MutableSet<T>가 있다


//map은 객체를 넣을 때 그 객체를 찾아낼 수 있는 key를 쌍으로 넣어주는 컬렉션
//key : 객체를 찾기 위한 값 , value : key와 연결된 객체
//Map<K, out V> 와 MutableMap<K,V>
//요소의 추가는 put(키,값) 삭제는 remove(키)