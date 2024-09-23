package com.example.javatokotlin_exercises

//.01_introduction
//4. **Operaciones Aritméticas**
//- Realiza la conversión de este código Java a Kotlin y muestra el resultado de cada operación:
//```java
//int a = 10;
//int b = 20;
//int suma = a + b;
//```

class Ejercicio4 {
    var a= 10
    var b= 20
    var suma = a + b

    fun mostrar(){
        println("Si a = $a y b = $b , la suma es $suma")
    }


}

fun main(){
    val ejercicio4 = Ejercicio4()
    ejercicio4.mostrar()

}