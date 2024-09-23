package com.example.javatokotlin_exercises

//.01_introduction
//3. **Uso de var y val**
//- Convierte el siguiente código Java a Kotlin, usando `var` y `val` adecuadamente:
//```java
//final int MAXIMO = 100; // constante
//int contador = 0;
//```
class Ejercicio3 {

    val max = 100
    var contador = 0

    fun mostrar() {
        contador += 1
        println("El valor maximoes $max y su posion es  $contador")
    }


}

fun main() {
    val ejercicio3 = Ejercicio3()
    ejercicio3.mostrar()
}