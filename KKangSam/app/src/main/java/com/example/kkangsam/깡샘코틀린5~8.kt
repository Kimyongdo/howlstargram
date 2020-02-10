package com.example.kkangsam

import java.lang.Exception

fun main(){
    var oneMillion=1_000_000 //언더바로 쉼표 가능
    println("언더바를 사용합니다. ${oneMillion}")

    //any타입
    println("any타입을 사용합니다 ${AnyLength("hello")}")
    println("any타입을 사용합니다. ${AnyLength(100)}")

    //when사용 - 순차적으로 하나만 걸림. 그리고 바로 종료
    println(cases(1))
    println(cases(10.0))

    //null허용타입-String을 집어넣어서 인트로 변환하기.
    println("스트링을 숫자로 변환 ${parseInt("100")}")

    //타입확인과 캐스팅
   isture(1)
    isture("안녕하세요")

    //자동형변환 제공 안함
    var a1:Int = 10
    var a2:Double = a1.toDouble()
    println("double로 명시적 형변환한 숫자입니다. ${a2}")

    //배열
    var array = arrayOf(1,"kim",true)
    array[0]=10
    array[1]=false
    println("${array[0]},${array[1]}, ${array[2]}의 값을 가지고 있습니다. ")
    println("${array.size}, ${array.get(2)}의 사이즈와 값을 가져옵니다.")
    var array2 = intArrayOf(10,20,30) //intArrayOf를 사용하여 보다 int만을 가지게함.
    var array3 = doubleArrayOf(10.0,20.0)
    var array4 = Array(3,{i->i*10}) // 사이즈는 3, 처음값부터 10씩 곱하기
    for(a in array4){
        print("${a}출력")
    }
    println()
    //arrayOf == arrayOf<Int> == intArray

    var array5 = arrayOfNulls<Any>(3) //어떤 값 가능, 사이즈는 3
    array5[0]=1
    array5[1]="string"
    println("${array5[0]}, ${array5[1]} 값을 출력")
    var array6 = Array(3,{""}) //숫자 사이즈 3에, {""}을 통해 String만 가능
    array6[0]="1"

    //컬렉션타입 List Map Set
    //Iterfator

    var list = listOf<Int>(1,2,3)
    val iterator1 = list.iterator()
    while(iterator1.hasNext()){ //hasnext는 다음에 값이 있는지 확인해주고
        println(iterator1.next()) //있다면 그 값을 확인 hasnext와next를 같이 쓴다.
    }

    var aasdf:ArrayList<String> = ArrayList() //ArrayList<String>을 반환형으로 받는다.
    aasdf.add("Heelo")
    println("${aasdf}입니다.")

    //반복문
    var sum=0
    for(i in 1..10){
        sum+=i
    }
    println(sum)

    var list1 = listOf("Hello","world","!")
    val sb = StringBuffer()
    for(str in list1){
        sb.append(str)
    }
    println(sb)
    for(i in list.indices){
        println(list[i])
    }

    for(i in 1 until 11 step 2){
        println(i)
    }

    
}

//any타입
fun AnyLength(a:Any):Int{
    if(a is String){           //파라미터가 스트링인가?에 대한 함수는 is를 사용
        return a.length
    }
    return 0 //반환형 Int를 사용했기에 return이 필요.
}

//any타입 when을 사용한 -> 스위치구문
fun cases(a:Any):String{
    when(a){
        1->return "숫자 one 입니다."
        "Hello"->return "문자 Hello입니다."
        is Long -> return "Long타입입니다."
        !is String -> return "스트링이 아닙니다."
        else -> return "일치하는게 없습니다. "
    }
}

//null허용타입
fun parseInt(a:String):Int?{ //반환형이 int이거나 null이거나를 int?로 처리
    return a.toIntOrNull()
}

//Any, Any?타입
//이것도 아직 잘 모르겠네 5.1 기초타입.

//Unit과 Nothing
fun aaa(){}
fun bbb():Unit{} //두 개는 동일한 함수
fun ccc():Nothing{throw Exception()} //아무것도 반환할것이 없음을 명시적으로 표기
//throw는 필수적으로 명시

//타입확인과 캐스팅
fun isture(a:Any){
    if(a is String){
        println("${a}의 숫자가 a.length입니다.")
    }else{
        println("${a}는 스트링이 아닙니다.")
    }
}


