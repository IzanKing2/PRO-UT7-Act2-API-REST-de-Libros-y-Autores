# 📚 API REST de Libros y Autores

Bienvenido a **API REST de Libros y Autores**, un proyecto desarrollado con Spring Boot para gestionar libros y autores, incluyendo relaciones, filtros y ordenación.

---

## 📝 Descripción

Esta API permite:
- Gestionar libros y autores con relación **@OneToMany/@ManyToOne**.
- Filtrar y ordenar resultados.
- Operaciones CRUD completas para ambos recursos.

---

## 🚀 ¿Cómo ejecutar la API?

1. **Configura tu base de datos MySQL**  
   Asegúrate de tener una base de datos llamada `librosyautoresdb` y ajusta el usuario en `application.properties` si es necesario.

2. **Ejecuta el proyecto**  
   Desde la raíz del proyecto, ejecuta:
   ```bash
   ./mvnw spring-boot:run
   ```
   o en Windows:
   ```bat
   mvnw spring-boot:run
   ```

3. **Accede a la API**  
   Visita: [http://localhost:8080/api/v1/](http://localhost:8080/api/v1/)

---

## 📂 Estructura del Proyecto

```
libros_y_autores/
│
├── src/
│   ├── main/
│   │   ├── java/com/actividad2/libros_y_autores/
│   │   │   ├── controller/      # Controladores REST
│   │   │   ├── model/           # Entidades JPA
│   │   │   ├── repository/      # Repositorios Spring Data JPA
│   │   │   └── service/         # Lógica de negocio
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/...
├── pom.xml
└── README.md
```

---

## 🌐 Endpoints principales

### 📖 Libros
- `GET /api/v1/libros` — Lista todos los libros
- `GET /api/v1/libros/{id}` — Obtiene un libro por ID
- `POST /api/v1/libros` — Crea un libro (JSON, debe incluir autor existente)
- `PUT /api/v1/libros/{id}` — Actualiza un libro
- `DELETE /api/v1/libros/{id}` — Elimina un libro
- `GET /api/v1/libros/buscar?titulo=Java&anio=2020&sortBy=anioPublicacion&order=asc` — Buscar y ordenar

### 👨‍💼 Autores
- `GET /api/v1/autores` — Lista autores
- `GET /api/v1/autores/{id}` — Ver autor con sus libros
- `POST /api/v1/autores` — Crear autor

---

## 👥 División del trabajo

- **Izan**: Todo lo relacionado con **Libros** y este **README.md**.  
- **Diego**: Todo lo relacionado con **Autores**.

---

¡Esperamos que disfrutes usando esta API! 🚀