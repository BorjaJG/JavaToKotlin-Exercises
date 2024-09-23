package com.example.javatokotlin_exercises
//
//    .01_introduction
//- Convierte el siguiente código Java a Kotlin:
//```java
//int numero = 5;
//String texto = "Hola";
//boolean esVerdadero = true;

class Ejercicio1 {

    var numero = 5
    var texto = "Hola"
    var esverdadero = true

    fun mostrar() {
        println("Número: $numero, Texto: $texto, Es Verdadero: $esverdadero")
    }

}

fun main() {
    val ejercicio = Ejercicio1()
    ejercicio.mostrar()
}