package com.example.lecciones2687365

class Declarate {
}

fun main() {

    //Declaraciones
    var name: String="Dani \n"
    val text="""Buenas colegas"""

    var big: Long=44555652614568454
    var num: Int=45
    var shor: Short=4514
    var minbite: Byte=35

    //datos flotantes

    var maegor: Double=454.565454
    var mer: Float= 4.5F
    var mer1: Char='4'
    var mer2: Boolean=true

    print(name)
    print(text)
    print("Dato Short" +shor)
    print("Dato long" +big)

    print("la suma entre $num y $shor es ${num+shor}\n")

    println("$name.length is ${name.length}")
}