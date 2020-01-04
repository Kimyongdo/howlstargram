package chpater04.WhenNoArgs


fun main(){

    print("enter the score:")
    val score = readLine()!!.toDouble()
    var grade ='C'

    //범위연산자를 사용함.
    when{
        score>=90 -> grade='A'
        score in 80.0..89.9 -> grade='B'
        score in 70.0..79.9 -> grade='C'
        score <70.0 -> grade='F'
    }


    println("scroe : $score, Grade: $grade,")
}