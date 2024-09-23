package com.example.javatokotlin_exercises

//.01_introduction
//8. **Arrays**
//- Convierte el siguiente código de un array en Java a un array en Kotlin:
//```java
//String[] frutas = {"manzana", "banana", "naranja"};
//```
class Ejercicio8 {

    val frutas: Array<String> = arrayOf("manzana", "banana", "naranja")

    fun mostrar(){
        println(frutas)
    }


}

fun main(){
    val ejercicio8 = Ejercicio8()
    println(ejercicio8.mostrar())
}