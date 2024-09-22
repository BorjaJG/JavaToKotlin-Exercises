# Ejercicios: Conversión de Variables y Tipos de Datos de Java a Kotlin

1. **Declaración de Variables**
    - Convierte el siguiente código Java a Kotlin:
      ```java
      int numero = 5;
      String texto = "Hola";
      boolean esVerdadero = true;
      ```

2. **Tipos de Datos Primitivos**
    - Muestra cómo se declararían los tipos de datos primitivos en Kotlin, utilizando las siguientes declaraciones de Java:
      ```java
      double pi = 3.14;
      char letra = 'A';
      ```

3. **Uso de var y val**
    - Convierte el siguiente código Java a Kotlin, usando `var` y `val` adecuadamente:
      ```java
      final int MAXIMO = 100; // constante
      int contador = 0;
      ```

4. **Operaciones Aritméticas**
    - Realiza la conversión de este código Java a Kotlin y muestra el resultado de cada operación:
      ```java
      int a = 10;
      int b = 20;
      int suma = a + b;
      ```

5. **Casting de Tipos**
    - Convierte el siguiente código Java a Kotlin, prestando atención al casting de tipos:
      ```java
      double decimal = 9.78;
      int entero = (int) decimal;
      ```

6. **Operadores Relacionales**
    - Convierte este fragmento de código Java a Kotlin, que usa operadores relacionales:
      ```java
      if (a > b) {
          System.out.println("A es mayor que B");
      }
      ```

7. **Concatenación de Cadenas**
    - Convierte el siguiente código Java a Kotlin, que concatena cadenas:
      ```java
      String nombre = "Juan";
      String saludo = "Hola, " + nombre;
      ```

8. **Arrays**
    - Convierte el siguiente código de un array en Java a un array en Kotlin:
      ```java
      String[] frutas = {"manzana", "banana", "naranja"};
      ```

9. **Ciclo For**
    - Convierte el siguiente ciclo `for` de Java a Kotlin:
      ```java
      for (int i = 0; i < 5; i++) {
          System.out.println(i);
      }
      ```

10. **Uso de String Templates**
    - Convierte este código Java que imprime un mensaje a Kotlin utilizando string templates:
      ```java
      String ciudad = "Ávila";
      System.out.println("Vivo en " + ciudad);
      ```

11. **Uso de Nullable Types**
    - Convierte el siguiente código Java a Kotlin, teniendo en cuenta el manejo de tipos nulos:
      ```java
      String nombre = null;
      if (nombre != null) {
          System.out.println(nombre.length());
      }
      ```

12. **Definición de Constantes**
    - Convierte el siguiente código Java a Kotlin, utilizando `const` para definir constantes:
      ```java
      public static final double GRAVITY = 9.81;
      ```

13. **Uso de StringBuilder**
    - Convierte este código Java que utiliza `StringBuilder` a Kotlin:
      ```java
      StringBuilder sb = new StringBuilder();
      sb.append("Hola");
      sb.append(" Mundo");
      ```

14. **Estructuras de Control: Switch**
    - Convierte el siguiente código Java a Kotlin usando `when` en lugar de `switch`:
      ```java
      int dia = 3;
      switch (dia) {
          case 1:
              System.out.println("Lunes");
              break;
          case 2:
              System.out.println("Martes");
              break;
          default:
              System.out.println("Otro día");
      }
      ```

15. **Uso de Listas Mutables**
    - Convierte este código Java que utiliza una lista de `ArrayList` a una lista mutable en Kotlin:
      ```java
      ArrayList<String> nombres = new ArrayList<>();
      nombres.add("Juan");
      nombres.add("María");
      ```

16. **Cálculo de Promedio**
    - Convierte el siguiente fragmento de código Java a Kotlin que calcula el promedio de un array de números:
      ```java
      int[] numeros = {10, 20, 30};
      int suma = 0;
      for (int num : numeros) {
          suma += num;
      }
      double promedio = suma / numeros.length;
      ```

17. **Uso de Mapas**
    - Convierte este código Java que utiliza un `HashMap` a un `Map` en Kotlin:
      ```java
      HashMap<String, Integer> edades = new HashMap<>();
      edades.put("Juan", 25);
      edades.put("María", 30);
      ```

18. **Métodos en Clases**
    - Convierte el siguiente método de Java a Kotlin:
      ```java
      public int suma(int a, int b) {
          return a + b;
      }
      ```

19. **Uso de Enums**
    - Convierte el siguiente código de una enumeración en Java a Kotlin:
      ```java
      enum Color {
          ROJO, VERDE, AZUL
      }
      ```

20. **Control de Excepciones**
    - Convierte este bloque de código Java que maneja excepciones a Kotlin:
      ```java
      try {
          int resultado = 10 / 0;
      } catch (ArithmeticException e) {
          System.out.println("Error de división por cero");
      }
      ```

