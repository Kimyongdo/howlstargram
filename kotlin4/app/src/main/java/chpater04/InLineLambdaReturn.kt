package chpater04

fun main(){
    retFunc()
    retFunc2()
    retFunc3()
}

inline fun inlineLambda(a:Int, b:Int, out:(Int, Int)->Unit){
    out(a,b)
}

fun retFunc() {
    println("start of retFunc")
    inlineLambda(13 ,3)aaa@{a,b-> val result=a+b
    if(result>10) return@aaa
        println("result : $result")
    }
    println("end of retFunc")

}

fun retFunc2() {
    println("start of retFunc")
    inlineLambda(13 ,3){a,b-> val result=a+b
        if(result>10) return@inlineLambda //라벨을 생략하고 끝에 자기 함수를 쓰면 똑같은 효과
        println("result : $result")
    }
    println("end of retFunc")

}

fun retFunc3() {
    println("start of retFunc")
    //익명함수로 사용 할 수 있음.
    inlineLambda(13 ,3,
        fun(a,b){ val result=a+b
        if(result>10) return //라벨을 생략하고 끝에 자기 함수를 쓰면 똑같은 효과
        println("result : $result")
    })
    println("end of retFunc")

}