package com.example.javatokotlin_exercises

//.01_introduction
//9. **Ciclo For**
//- Convierte el siguiente ciclo `for` de Java a Kotlin:
//```java
//for (int i = 0; i < 5; i++) {
//    System.out.println(i);
//}
//```


class Ejercicio9 {
    fun contador(){
    for(i in 1..5){
       print(i)
    }
}
}
fun main(){
    val ejercicio9 =Ejercicio9()
    println(ejercicio9.contador())
}