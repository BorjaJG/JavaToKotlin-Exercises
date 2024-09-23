package com.example.javatokotlin_exercises

//.01_introduction
//7. **Concatenación de Cadenas**
//- Convierte el siguiente código Java a Kotlin, que concatena cadenas:
//```java
//String nombre = "Juan";
//String saludo = "Hola, " + nombre;
//```
class Ejercicio7 {

    var nombre = "Juan"
    var saludo = "Hola, " + nombre

    fun mostrar(){
        println(saludo)
    }

}
fun main(){
    val ejercicio7 = Ejercicio7()
    println(ejercicio7.mostrar())
}