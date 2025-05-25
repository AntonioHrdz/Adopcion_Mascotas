# Sistema de Adopción de Mascotas

Desarrollado como parte del Desafío Práctico N.º 3 del Ciclo 01-2025 - Universidad Don Bosco.

## Contenido

Este proyecto incluye:

- Backend REST en **Java con Quarkus**
- Base de datos en **MySQL**
- Frontend con **HTML, Bootstrap y JavaScript**

---

## Requisitos

- Java 17 o superior
- Maven
- Quarkus CLI (opcional)
- MySQL
- Navegador web

---

## 1. Base de Datos

### Crear y poblar la base de datos

1. Abre tu gestor (phpMyAdmin o consola).
2. Ejecuta el script SQL ubicado en:

```
backend/adopcion_mascotas.sql
```

Esto creará la base de datos `adopcion_mascotas` con tablas y datos de prueba.

---

## 2. Backend - Quarkus

### Ejecución

1. Abre terminal en la carpeta `backend`.
2. Ejecuta:

```bash
./mvnw quarkus:dev
```

El backend estará disponible en:

```
http://localhost:8080
```

---

## 3. Frontend

Abre los siguientes archivos HTML desde la carpeta `frontend` en tu navegador:

- `inicio.html` → Ver mascotas disponibles
- `registro.html` → Registrar persona interesada
- `solicitud.html` → Realizar solicitud de adopción
- `admin.html` → Panel de administración (ver/aprobar solicitudes)

---

## 4. Endpoints REST

### Mascotas
- `GET /mascotas` → Listar mascotas
- `POST /mascotas` → Registrar nueva
- `PUT /mascotas/{id}/estado` → Cambiar estado

### Personas
- `POST /personas` → Registrar persona

### Solicitudes
- `GET /solicitudes` → Listar solicitudes
- `POST /solicitudes?idPersona=&idMascota=` → Crear solicitud
- `PUT /solicitudes/{id}` → Cambiar estado

---

## Capturas y Video (opcional)

Puedes incluir aquí un enlace a capturas de pantalla o video que muestre el funcionamiento.

---

## Autor

**Tu nombre aquí**  
Programación Orientada a Objetos – Universidad Don Bosco  
Ciclo 01-2025
