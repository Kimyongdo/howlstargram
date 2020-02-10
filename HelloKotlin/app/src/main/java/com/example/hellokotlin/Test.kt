package com.example.hellokotlin



//Text.kt - 오른쪽 클릭. - run 패키지명 - > 앱 실행 안하고 이 파일만 실행-> 결과창 아래로 나옴.

fun main(){
    println("Hello Kotlin")
    println(10.5)
    println('A')
    println(true)
    println(3+3)

    //에러
    println(10); println(10);

    //변수선언은 var로 시작
    var a=10
    var b =10.5
    var c =3.14f
    var d = true
    var e ='a'
    var f ="hello"


    var a2: Int = 100

    println(10+3.14)
    var n4 =10
    if(n4 is Int){
        println("n4변수는 Int형입니다.")
    }

    var s3: String = "Hello"
    if(s3 is String) println("s3는 스트링입니다.")

    if(s3 !is String) println("string타입이 아닙니다")

    var obj: Any
    obj=10
    if(obj is Int){
        println("${obj}은 Int입니다") // {}로 범위지정가능
    }

    class Person{
        var name="sam"
        var age:Int=10 //멤버변수는 숫자까지 써야함.
    }

    var p = Person() //코틀린에서의 객체생성 new 키워드가 없음.
    if(p is Person){
        println(p.name+" "+p.age)
    }
    obj = Person()
    if(obj is Person){
        println("이름: ${p.name} 나이: ${p.age}")
    }

    var s4 = "Hello"
    var s5 = "Hello"
    if(s4==s5) println("aaa")

    var str = if(10>5) "Hello" else "Nice"
    println(str)

    str = if(10>5){
        "aaa"
        "bbb" //마지막 값만 나옴
    }else{
        "cccc"
    }
    println(str)

    var h:Any? = null
    h=10
    when(h){
        10->{
            println("qqq")
            println("qqq2")
        }
        20-> println("kkk")
        "Hello"-> println("zhghh")
        true-> println("ccc")

        else->{

        }

    }


    h=85;
    when(h){
        h>=90 && h<=100 -> println("A학점입니다")
        h>=80 -> println("B학점입니다.")
    }

    h=20;
    var result = when(h){
        10->"Hellp"
        20->"Nice"
        else->"Bad"
    }
    println(result)

    when(h){
        is Int -> println("Int 타입")

    }

    for( i in 0..5){
        println(i)
    }


    for(i in 0 until 10){
        println(i)
    }

    for(i in 0..10 step 2){
        println(i)
    }

    for(i in 10 downTo 0){
        println(i)
    }

    for(i in 10 downTo 0 step 2){
        println(i)
    }

    var arr = arrayOf(10,20,30)
    arr[0]=11
    println(arr[0])
    //println(arr[3])

    println(arr.size)
    println(arr.get(0))
    arr.set(1,200)
    println(arr.get(1))

    for(i in 0 until 3){
        println(arr[i])
    }

    for(n in arr){
        println(n)
    }

    for((i,v) in arr.withIndex()){
        println("[$i 번째] : $v")
    }

    var arr2 = arrayOf(10,"Hello",true);
    for( t in arr2){
        println(t)
    }

    arr2[1]=20
    var arr4 = arrayOf<Int>(10,20,30)
    var arr5 = intArrayOf(10,30,40)

    var arr6: IntArray
    var arr7 = arrayOfNulls<Any>(5)
    for(e in arr7){
        println(e)
    }

    var arrayList = arrayListOf(10,"heelo")
    for(e in arrayList){
        println(e)
    }
    arrayList.add(3.14)
    println(arrayList)
    arrayList.removeAt(0)
    println(arrayList)

    //2차원배열
    val arrays = arrayOf(arrayOf(10,20), arrayOf("nice","dddd"), arrayOf(true,false))
    for(ar in arrays){
        for(e in ar){
            print(e)
            print(" ")
        }
        println()
    }

    show()
    output(1,"Kotlin")
    var x = sum(5,3)
    println(x)
    var z = display()
    println(z)



}//main

fun show(){
    println("show function")
}

fun output(a: Int, b:String){
    println(a)
    println(b)
}

fun sum(a:Int, b:Int):Int{
    return a+b
}

fun display(){
    println("display!!!")
}




