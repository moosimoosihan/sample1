package com.example.kotlinapp


open class Human constructor(val name : String = "Anonymous") { //constructor 생략 가능, open 써야 아래 korean 상속 가능

    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }

    init{//주 생성자의 일부 제일 먼저 불려짐
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMYYY~~~")
    }
    open fun singASong(){//open 해줘야 다른곳에서 부를 수 있음
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()//위 내용도 불러올 수 있음
        println("랄라랄")
        println("my name is : ${name}")
    }
}


fun main(){
    val korean = Korean()
    korean.singASong()
//    val human = Human("minsu")
//
//    val stranger = Human()
//
//    human.eatingCake()
    val mom = Human("Kuri",52)
//    println("this human's name is ${stranger.name}")
//    println("this human's name is ${human.name}")
}