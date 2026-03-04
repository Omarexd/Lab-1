# Laboratorio – Modularización en Java


Curso: Programación 1



#  Objetivo

Aplicar los conceptos de modularización mediante métodos, uso correcto de variables locales y globales, validación de entradas del usuario, manejo básico de excepciones y mejora de la organización del código.



---



#  Parte 1 – Análisis del Programa Original



## Identificación de tareas repetitivas



En el programa original se observó que varias secciones del código realizaban tareas específicas que podían convertirse en métodos independientes. Entre ellas:



- Agregar estudiante.

- Mostrar estudiantes.

- Calcular promedio.

- Mostrar estudiante con mayor calificación.

- Mostrar el menú.



Dividir estas tareas mejora el programa porque facilita su lectura, permite reutilizar funciones, simplifica el mantenimiento y evita repetir código innecesariamente.



---



## Variables Locales vs Globales



Las listas de estudiantes y calificaciones se declararon como variables globales porque son utilizadas por distintos métodos del programa.



En cambio, variables como opciones del menú, datos ingresados temporalmente y resultados intermedios se declararon como locales dentro de los métodos correspondientes.



Esto es importante porque reduce errores accidentales, limita el alcance de las variables y mejora la seguridad del programa.



---



#  Parte 2 – Modularización del Programa



El programa fue reorganizado dividiendo sus funciones en métodos independientes, donde cada uno cumple una responsabilidad específica.



Se crearon métodos para:



- Mostrar el menú.

- Agregar estudiantes.

- Mostrar registros.

- Calcular promedio.

- Determinar la mayor calificación.



Todos los métodos son llamados desde el método `main`, manteniendo el funcionamiento del programa.



La modularización permitió que el código sea más ordenado, legible y fácil de mantener.



---



#  Parte 3 – Validaciones y Manejo de Excepciones



Se identificaron posibles errores como:



- Ingresar texto en lugar de números.

- Ingresar notas fuera del rango permitido.

- Intentar realizar cálculos sin datos registrados.



Para evitar estos problemas se utilizaron bloques `try-catch`, los cuales capturan errores de entrada y evitan que el programa se cierre inesperadamente.



También se implementó validación del rango de las notas para asegurar que los datos ingresados sean correctos.



Estas mejoras hacen que el programa sea más robusto y confiable.



---



# Parte 4 – Reflexión



## 1️ Ventajas de dividir el código en métodos



Dividir el código en métodos permite organizar mejor el programa, facilita la lectura, mejora el mantenimiento y permite reutilizar funciones sin repetir código.



---



## 2️ Por qué no usar muchas variables globales



El uso excesivo de variables globales puede provocar errores inesperados, dificultar la depuración y generar dependencia entre los métodos, lo cual reduce la claridad del programa.



---



## 3️ Cómo mejora la modularización la legibilidad



La modularización divide el programa en partes pequeñas y comprensibles. Cada método representa una acción específica, lo que facilita entender el flujo del sistema y analizar el código.



---
