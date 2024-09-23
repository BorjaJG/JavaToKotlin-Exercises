package com.example.javatokotlin_exercises

//.01_introduction
//2. **Tipos de Datos Primitivos**
//- Muestra cómo se declararían los tipos de datos primitivos en Kotlin, utilizando las siguientes declaraciones de Java:
//```java
//double pi = 3.14;
//char letra = 'A';
//```

class Ejercicio2 {

    var pi = 3.14
    var letra = 'a'

    fun mostrar(){
        println("El numero pi: $pi y la letra es $letra")
    }
}
fun main() {
    val ejercicio2 = Ejercicio2()
    println(ejercicio2.mostrar())
}