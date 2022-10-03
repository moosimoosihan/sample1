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
//    checkNum(1)
    forAndWhile()
}

fun forAndWhile(){
    val students = arrayListOf("joy","james","jenny","jennifer")

    for (name in students) {
        println("$name")
    }
    var sum = 0
    for (i in 1..10 step 2){
        sum += i
    }
    var sum2 = 0
    for (y in 10 downTo 1){
        sum2 += y
    }
    var sum3 = 0
    for (x in 1 until 100){//1~99 != 1..100
        sum3 += x
    }
    println("$sum $sum2 $sum3")
    var index = 0
    while (index < 10) {
        println("current index : ${index}")
        index++
    }
    for((index,name)in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }
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