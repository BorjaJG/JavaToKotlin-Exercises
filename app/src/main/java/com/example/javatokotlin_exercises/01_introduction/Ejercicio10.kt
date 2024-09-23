package com.example.javatokotlin_exercises

//.01_introduction
//10. **Uso de String Templates**
//- Convierte este código Java que imprime un mensaje a Kotlin utilizando string templates:
//```java
//String ciudad = "Ávila";
//System.out.println("Vivo en " + ciudad);
//```
class Ejercicio10 {

    var ciudad = "Avila"
    fun mostrar(){
        println("Vivo en $ciudad")
    }

}
fun main(){
    val ejercicio10 = Ejercicio10()
    println(ejercicio10.mostrar())
}