** Week 02 – Spring Boot Intro ** 

En esta segunda semana se inicia el entrenamiento con Spring Boot, aprendiendo a crear aplicaciones modernas en Java con buenas prácticas de arquitectura. Se avanza desde la configuración básica hasta la construcción de un CRUD completo.

# 📅 Contenido por días
- 📌 Day 08 – Spring Boot Basics
Introducción al ecosistema Spring Boot 3.
Creación de un proyecto base con Spring Initializr.
Explicación de la estructura del proyecto (src/main/java, src/test/java, resources).
Ejecución de la primera aplicación REST “Hello World”.

- 📌 Day 09 – Components, Services, Repositories
Comprender la arquitectura en capas de Spring Boot.
Uso de @Component, @Service y @Repository.
Flujo básico de datos a través de las capas.
Ejemplo sencillo de entidad + servicio + controlador.

- 📌 Day 10 – Mini Spring App 01
Desarrollo de una primera mini aplicación REST.
Definición de modelos (DTOs / Entities).
Uso de controladores con @RestController.
Validaciones iniciales con @Valid y @RequestParam.

- 📌 Day 11 – Mini Spring App 02
Ampliación de la aplicación anterior.
Integración con Spring Data JPA y base de datos en memoria (H2).
Uso de repositories para persistencia.
Creación de endpoints CRUD simples.

- 📌 Day 12 – Mini Spring App 03
Refuerzo del CRUD con operaciones más avanzadas.
Uso de consultas personalizadas en Repository.
Introducción a manejo de excepciones con @ControllerAdvice.
Primeros tests de integración con Spring Boot Test.

- 📌 Day 13 – Refactor Calculator with Spring
Migrar la Calculadora Avanzada (semana 1, días 5 y 6) a Spring Boot.
Organización en capas (Controller → Service → Model).
Endpoints REST para operaciones: suma, resta, multiplicación, división, potencias, raíces y porcentajes.
Pruebas unitarias e integración.

- 📌 Day 14 – Project 1: Tasks CRUD
Desarrollo de un CRUD completo de Tareas (ToDo List).
Funcionalidades: crear, listar, actualizar, eliminar tareas.
Uso de Spring Data JPA con PostgreSQL.
Documentación de la API con Swagger/OpenAPI.
Ejecución y pruebas de la aplicación con Postman.

# 📂 Estructura de Carpeta
│
├── week-02-spring-boot-intro/
│   ├── day-08-spring-boot-basics/
│   ├── day-09-components-services-repositories/
│   ├── day-10-mini-spring-app-01/
│   ├── day-11-mini-spring-app-02/
│   ├── day-12-mini-spring-app-03/
│   ├── day-13-refactor-calculator-spring/
│   └── day-14-project1-tasks-crud/

# 🎯 Objetivo de la Semana
Al finalizar esta semana, el estudiante será capaz de:
Entender la arquitectura de una aplicación Spring Boot.
Implementar controladores, servicios y repositorios.
Construir un CRUD real conectado a base de datos.
Aplicar pruebas unitarias e integración en Spring Boot.
Preparar proyectos básicos para portafolio profesional.