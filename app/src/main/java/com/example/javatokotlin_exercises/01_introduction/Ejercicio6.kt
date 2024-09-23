package com.example.javatokotlin_exercises

//.01_introduction
//6. **Operadores Relacionales**
//- Convierte este fragmento de código Java a Kotlin, que usa operadores relacionales:
//```java
//if (a > b) {
//    System.out.println("A es mayor que B");
//}
//```

class Ejercicio6 {

    var a = 1
    var b = 2
    var mayor = 0
    fun mostrar(){
        if(a>b){
           mayor =a
        }else{
            mayor = b
        }
        println("mostrar el mayor $mayor")
    }



}
fun main(){
    val ejercicio6 = Ejercicio6()
    println(ejercicio6.mostrar())
}