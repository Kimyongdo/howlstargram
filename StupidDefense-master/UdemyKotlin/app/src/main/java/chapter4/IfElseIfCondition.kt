package chpater04.ifcondition

fun main(){
    println("Enter the score : ")
    val score = readLine()!!.toDouble();
    var grade:Char = 'F'

//    if(score>=90.0){
////        grade='A'
////    }else if(score>=80.0 && score <=89.9){
////        grade ='B'
////    }else if(score >=70.0 && score <=79.9){
////        grade ='C'
////    }


    //in을 사용하여 코드 간결 및 오류를 제거할 수 있다.
    if(score>=90){
        grade='A'
    }else if(score in 80.0..89.0){
        grade='B'
    }else if(score in 70.0..79.0){
        grade='C'
    }

    println("Score : $score, Grade : $grade")

}