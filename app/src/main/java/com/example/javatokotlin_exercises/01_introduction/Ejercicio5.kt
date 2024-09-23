package com.example.javatokotlin_exercises

//.01_introduction
//**Casting de Tipos**
//- Convierte el siguiente código Java a Kotlin, prestando atención al casting de tipos:
//```java
//double decimal = 9.78;
//int entero = (int) decimal;
//```
class Ejercicio5 {

    var decimal = 9.78

    val entero = decimal.toInt()

    fun mostrar(){
        var texto =  String.format("El número decimal es %.2f, y el número entero es $entero", decimal)
        println(texto)
    }




}
fun main(){
    val ejercicio5 = Ejercicio5()
    ejercicio5.mostrar()
}