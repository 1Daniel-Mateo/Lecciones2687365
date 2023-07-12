package com.example.lecciones2687365

class Range {
}

fun main() {
    print("RANGO\n")

    print("Ingresa un numero \n")
    var num:Int= readLine()!!.toInt()

    if (num in 1..20){
        println("El numero esta dentro del rango :)")
    }else{
        println("El numero esta fuera del rango :?")
    }
}