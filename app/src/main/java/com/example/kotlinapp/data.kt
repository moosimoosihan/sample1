package com.example.kotlinapp
//pojo class
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

// toString(), hashCode(), equals(), copy()

fun main(){
    val ticketA = Ticket("koreanAir","SmmothieHwang","2020-02-16",14)
    val ticketB = TicketNormal("koreanAir","SmmothieHwang","2020-02-16",14)

    println(ticketA)
    println(ticketB)
}