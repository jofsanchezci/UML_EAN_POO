
# Sistema de Gestión de Biblioteca en Java

Este archivo describe el diseño de clases y la implementación en Java de un sistema de gestión de préstamos de libros en una biblioteca utilizando UML para su modelado.

## Diagrama de Clases UML

1. **Libro**: Representa los libros disponibles en la biblioteca.
   - Atributos: `id`, `titulo`, `autor`, `disponible`.
   - Métodos: `getters` y `setters` para cada atributo.

2. **Usuario**: Representa a los usuarios que pueden tomar prestados los libros.
   - Atributos: `id`, `nombre`.
   - Métodos: `getters` y `setters`.

3. **Prestamo**: Representa el préstamo de un libro a un usuario.
   - Atributos: `idPrestamo`, `libro`, `usuario`, `fechaPrestamo`, `fechaDevolucion`.
   - Métodos: `getters`, `setters` y `toString()`.

4. **Biblioteca**: Administra los libros, los usuarios y los préstamos.
   - Atributos: `listaLibros`, `listaUsuarios`, `listaPrestamos`.
   - Métodos: `agregarLibro()`, `agregarUsuario()`, `prestarLibro()`, `devolverLibro()`, `mostrarLibros()`, `mostrarUsuarios()`.

5. **MenuPrincipal**: Permite la interacción con el usuario para gestionar los préstamos.

## Implementación en Java

```java
// Código de implementación en Java
```

## Mejoras y extensiones posibles:
- **Persistencia de datos**: Guardar los datos de libros, usuarios y préstamos en una base de datos o en archivos.
- **Interfaz gráfica**: Crear una interfaz gráfica para facilitar la interacción.
- **Manejo de excepciones**: Agregar validaciones adicionales para evitar errores al ingresar datos.
