package com.example.kotlinapp

fun main(){
    //helloWorld()
    //println(add(4,5)
//    val name = "mms"
//    val lastName = "Hwang"
//    println("my name is ${name + lastName} I'm 33")
//
//    println("is this true? ${1==0}")
//    println("this is 2\$a")
    checkNum(1)
}

fun maxBy(a: Int , b: Int):Int {
    if(a>b){
        return a
    } else{
        return b
    }
}


fun maxBy2(a:Int, b:Int) = if(a>b) a else b

fun checkNum(score :Int){
    when(score){
        0-> println("this is 0")
        1-> println("this is 1")
        2,3-> println("this is 2 or 3")
        else -> println("I don't know")
    }
    var b = when(score){
        1->1
        2->2
        else ->3
    }
    println("b:${b}")
    when(score){
        in 90..100->println("You are genius")
        in 10..80 ->println("not bad")
        else -> println("okay")
    }
}

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"b",3.4f)
    val list2 = listOf(1,"d",11L)


}
//
//fun helloWorld() : Unit{
//    println("Hello World!")
//}
//
//fun add(a : Int,b : Int) : Int {
//    return a+b
//}
//
//fun hi(){
//    //val 고정
//    //var 고정x
//    val a : Int = 10
//    var b : Int = 9
//    val c = 100
//    var name = "mms"
//}