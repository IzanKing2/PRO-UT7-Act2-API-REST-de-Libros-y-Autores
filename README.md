# API REST de Libros y Autores

## Descripción
Proyecto Spring Boot que implementa una API REST para gestionar libros y autores, con relación @OneToMany/@ManyToOne, filtros y ordenación.

## Ejecución
1. Configura tu base de datos MySQL y ajusta `application.properties` si es necesario.
2. Ejecuta:
   ```
   mvnw spring-boot:run
   ```
3. Accede a la API en `http://localhost:8080/api/v1/`

## Endpoints principales

### Libros
- `GET /api/v1/libros` — Lista todos los libros
- `GET /api/v1/libros/{id}` — Obtiene un libro por ID
- `POST /api/v1/libros` — Crea un libro (JSON, debe incluir autor existente)
- `PUT /api/v1/libros/{id}` — Actualiza un libro
- `DELETE /api/v1/libros/{id}` — Elimina un libro
- `GET /api/v1/libros/buscar?titulo=Java&anio=2020&sortBy=anioPublicacion&order=asc` — Buscar y ordenar

### Autores
- `GET /api/v1/autores` — Lista autores
- `GET /api/v1/autores/{id}` — Ver autor con sus libros
- `POST /api/v1/autores` — Crear autor