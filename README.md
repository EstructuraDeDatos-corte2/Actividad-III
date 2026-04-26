# 🌳 Implementación de Árboles 

## 📌 Descripción del proyecto

Este proyecto consiste en la implementación de **estructuras no lineales tipo árbol**, específicamente un **Árbol Binario** y un **Árbol Binario de Búsqueda (ABB)** en Java.

El objetivo es comprender y aplicar conceptos fundamentales como:

* Jerarquía de nodos
* Relaciones padre-hijo
* Recorridos
* Inserción y búsqueda
* Representación gráfica en consola

---

## 🧠 Fundamento teórico

Un **árbol** es una estructura de datos no lineal compuesta por nodos conectados jerárquicamente.

### Conceptos clave:

* **Raíz:** nodo principal del árbol
* **Nodo:** elemento que contiene un valor
* **Hijo:** nodo dependiente de otro
* **Padre:** nodo que tiene hijos
* **Hoja:** nodo sin hijos
* **Subárbol:** cualquier nodo con sus descendientes

---

## 🌳 Tipos de árboles implementados

### 1. Árbol Binario

Cada nodo puede tener como máximo dos hijos:

* Hijo izquierdo
* Hijo derecho

### 2. Árbol Binario de Búsqueda (ABB)

Es un árbol binario con una propiedad adicional:

* Los valores menores van a la izquierda
* Los valores mayores van a la derecha

Esto permite realizar búsquedas eficientes.

---

## 🧩 Implementación

### Clase Nodo

Representa la unidad básica del árbol:

* Valor
* Referencia al hijo izquierdo
* Referencia al hijo derecho

---

### Árbol Binario de Búsqueda (ABB)

#### ✔ Inserción

Se realiza de forma recursiva respetando la propiedad del ABB:

* Menores → izquierda
* Mayores → derecha

#### ✔ Búsqueda

Permite encontrar un valor recorriendo el árbol de manera eficiente.

---

### 🔁 Recorridos implementados

* **Inorden:** izquierda → raíz → derecha
* **Preorden:** raíz → izquierda → derecha
* **Postorden:** izquierda → derecha → raíz

El recorrido **inorden** en un ABB devuelve los valores ordenados.

---

## 🌳 Representación gráfica en consola

Se implementó un método que imprime el árbol usando caracteres ASCII para reflejar la jerarquía:

```
Árbol:
└── 8
    ├── 3
    │   ├── 1
    │   └── 6
    └── 10
```

## ▶️ Ejecución del programa

### Entrada (valores insertados)

```
8, 3, 10, 1, 6
```

### Salida

```
Recorrido Inorden:
1 3 6 8 10

Buscar 6: true
Buscar 15: false

Árbol:
└── 8
    ├── 3
    │   ├── 1
    │   └── 6
    └── 10
```

## ✅ Conclusiones

* Se logró implementar correctamente una estructura de árbol funcional.
* Se comprendieron las relaciones jerárquicas entre nodos.
* Se aplicaron recorridos fundamentales.
* Se desarrolló una representación gráfica clara en consola.
* El proyecto cumple con los criterios de:

  * Funcionalidad
  * Uso de terminología
  * Clasificación
  * Visualización

---
