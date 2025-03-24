# 📚 Spring Boot Bookstore App

Aplicación web simple desarrollada con **Spring Boot**, basada en el patrón **MVC (Modelo - Vista - Controlador)**. Este proyecto está diseñado para practicar y comprender los fundamentos del desarrollo web con Spring, incluyendo conceptos clave como **Inversión de Control (IoC)**, **Inyección de Dependencias (DI)**, **repositorios**, **controladores** y **vistas con Thymeleaf**.

---

## 🔧 ¿Qué hace esta aplicación?

- Genera automáticamente datos de ejemplo (autores, libros y editoriales) al iniciar.
- Muestra listas de autores y libros en vistas HTML.
- Utiliza una base de datos en memoria (**H2**) para pruebas rápidas y sin configuración externa.

---

## 🧠 Tecnologías utilizadas

- **Spring Boot** – Simplifica la configuración y ejecución de la app.
- **Spring Data JPA** – Permite acceder a la base de datos sin necesidad de escribir consultas SQL manuales.
- **Thymeleaf** – Motor de plantillas para renderizar HTML dinámico.
- **H2 Database** – Base de datos embebida en memoria, ideal para pruebas y desarrollo local.
- **Java 17+** – Lenguaje base del proyecto.

---

## 🔄 Flujo general de la aplicación

1. **Spring Boot** inicia la aplicación desde `Application.java`.
2. `BootStrapData` se ejecuta automáticamente y **crea datos de ejemplo**.
3. El usuario accede a rutas como `/authors` o `/books` en su navegador.
4. Los **controladores** (`AuthorController`, `BookController`) reciben la petición.
5. Los controladores usan los **repositorios** para obtener los datos desde la base H2.
6. Los datos se pasan al **modelo**, y se renderizan con las **vistas Thymeleaf** (`list.html`).
7. El navegador muestra una **tabla con autores o libros** renderizada dinámicamente.

📦 **Resultado:** Una aplicación web funcional, conectada a base de datos, con arquitectura limpia y modular.

---
