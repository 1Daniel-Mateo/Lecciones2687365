package com.example.lecciones2687365

class Conditional {
}

fun main() {
    print("MAYOR, MENOR O IGUAL\n")

    print("Ingresa numero 1\n")
    var num1: Int= readLine()!!.toInt()
    print("Ingresa numero 2\n")
    var num2: Int= readLine()!!.toInt()

    if (num1 > num2){
        println("el numero 2 es mayor que numero 1")
    }else if(num1 == num2){
        println("Ambos numeros son iguales")
    }else{
        println("el numero 1 es menor que numero 2")
    }


}