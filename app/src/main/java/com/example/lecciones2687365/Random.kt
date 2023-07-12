package com.example.lecciones2687365

class Random {
}

fun main() {
    var result: Int=(1..50).random()//Sintaxis para generar numeros aleatorios

    print(result)

when(result){
    0 -> println("No hay resultados")
    1,2,3,4,5 -> println("hay menos de 5 resutados")
    in 6..58 -> println("Hay entre 5 y 58 resultados")
    else -> println("Esos son bastantes resultados")
}
}