# Proyecto: Aplicación de E-Commerce

# Prueba de versiones

## Integrantes

* Patrick Calderon
* Abel Vargas

---
1. Diseño general

El diseño muestra una apariencia moderna, ordenada y atractiva, adecuada para una tienda de ropa. La organización por secciones (encabezado, catálogo y pie de página) facilita la navegación, permitiendo que los usuarios encuentren fácilmente los productos que buscan, lo cual es esencial en una plataforma de comercio electrónico.

2. Encabezado (Header)

El encabezado presenta correctamente el nombre o logotipo de la tienda junto con los enlaces principales (Inicio, Productos, Contacto, etc.).
Se sugiere incorporar un buscador en la parte superior para optimizar la experiencia del usuario, especialmente cuando el catálogo de productos aumente.

3. Sección principal (Catálogo)

Las imágenes de los productos están bien organizadas, lo que aporta claridad visual.
Se recomienda utilizar fondos blancos o neutros en las fotografías para resaltar mejor las prendas.
Cada artículo debe incluir su nombre, precio y un botón de compra o ver detalles, para ofrecer una navegación más funcional.

4. Colores y estilo

La paleta de colores es armoniosa y coherente, aunque sería ideal definir de dos a tres tonos principales que representen la identidad visual de la marca (por ejemplo, beige, negro y dorado para una imagen elegante; o azul y blanco para un estilo más moderno).
Además, es importante mantener una tipografía uniforme y fácil de leer, lo que contribuye a una presentación más profesional.
## 5. Pie de página (Footer):

Añadir enlaces a redes sociales, términos y condiciones, o una pequeña sección “Sobre nosotros” reforzaría la confianza del cliente.
<img width="1024" height="1536" alt="image" src="https://github.com/user-attachments/assets/b329e9c0-114a-42d1-bfb5-2928d0c0106e" />


## Herramientas de Desarrollo

* Lenguaje principal: Java
* Gestor de dependencias: **Gradle**
* Base de datos: PostgreSQL 
* Control de versiones: Git + GitHub

---

## Ejecución del Proyecto

## 📸 Capturas de la ejecución

A continuación se muestran algunas imágenes de la aplicación en funcionamiento:

### 🖥️ Pantalla principal
<img width="1910" height="886" alt="image" src="https://github.com/user-attachments/assets/65bcb269-3382-4820-a655-96de5f077512" />

### 🖥️ Pantallas de categorias(Mujer, Hombre, Infantil)
<img width="1350" height="681" alt="image" src="https://github.com/user-attachments/assets/183a7229-90a5-4364-960c-21f39e78250c" />

<img width="1327" height="661" alt="image" src="https://github.com/user-attachments/assets/2e41436b-ea4f-488f-a648-f5dd4f996f07" />

<img width="1336" height="660" alt="image" src="https://github.com/user-attachments/assets/9d51dc16-700c-41a5-9b3d-c8b45cbebf6b" />

### 🖥️ Pantalla de Contacto
<img width="1336" height="675" alt="image" src="https://github.com/user-attachments/assets/2f5ab198-e6e2-4c4e-84a8-ee7f6468158e" />

### Internacionalizacion(funciona en todas las pantallas)

<img width="1343" height="675" alt="image" src="https://github.com/user-attachments/assets/bb674d4b-1684-478d-986d-c10b5cc7e31e" />


### Ejecución Local con Gradle

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/usuario/repositorio.git
   cd repositorio
   ```
2. Compilar y ejecutar:

   ```bash
   ./gradlew build
   ./gradlew run
   ```
3. Abrir la aplicación en el navegador en `http://localhost:8080`

### Ejecución desde GitHub (propuesta futura)

Se está evaluando implementar **GitHub Actions** para que el proyecto pueda ejecutarse directamente desde el repositorio, aplicando principios de CI/CD.

---

## Ideas de Mejora

* Configurar un ejecutor en GitHub Actions para pruebas en línea.
* Añadir badges (build, versión de Gradle, cobertura de pruebas).
* Incluir ejemplos de uso o capturas de pantalla.
* Configurar CI/CD para despliegue automático (Heroku, Vercel, Docker Hub, etc.).
* Mejorar la interfaz con temas oscuros/claros.
  
---

## Estructura General de la App

### Módulo de Usuario

* **Pantalla de inicio**: banner, categorías destacadas, productos recomendados.
* **Autenticación**: registro (correo/Google/Facebook), inicio de sesión, perfil de usuario.
* **Gestión de productos**: catálogo con filtros, vista de detalle, botón “Agregar al carrito”.
* **Carrito de compras**: listado, actualización de cantidades, cálculo subtotal/IGV/total.
* **Checkout**: datos de envío, métodos de pago (tarjeta, Yape/Plin, contraentrega), confirmación de pedido.
* **Pedidos**: historial, estado (pendiente, en camino, entregado).

### Módulo de Administración

* Gestión de usuarios (CRUD).
* Gestión de productos (CRUD).
* Gestión de categorías.
* Gestión de pedidos y actualización de estados.
* Reportes de ventas y stock.

## Flujo del Usuario

1. Usuario abre la app → ve productos destacados.
2. Busca/filtra productos → selecciona uno.
3. Agrega producto al carrito → revisa total.
4. Realiza checkout → llena datos de envío y pago.
5. Confirma pedido → se guarda en BD.

---

## Buenas Prácticas de Colaboración

* **Main protegido**: no se aceptan commits directos.
* **Pull Requests (PRs)**: todos los cambios se realizan en ramas individuales y se integran vía PR.
* **Revisiones de código**: los PRs deben ser aprobados antes de fusión.
* **Resolución de conflictos**: se resuelven en la rama del PR antes de integrarse.


Este flujo asegura control de calidad, trazabilidad y colaboración responsable.
=======
---


### Conflictos y Resolución
Los **conflictos** en Git ocurren cuando dos cambios afectan la misma parte del código.  
Se resuelven revisando, eligiendo o combinando las versiones antes de confirmar.


---


### Buenas Prácticas de Colaboración

Opción 1: Formal y Concisa (Énfasis en el control de calidad)
"Hemos establecido un protocolo de Buenas Prácticas de Colaboración para garantizar un flujo de trabajo organizado y de alta calidad. Este se basa en la protección de la rama principal (main) contra commits directos, requiriendo que todas las modificaciones se realicen a través de Pull Requests (PRs) desde ramas separadas. La revisión y aprobación de código es obligatoria antes de la fusión, y cualquier conflicto debe ser resuelto en el PR de origen. Este proceso asegura la responsabilidad, el control de calidad y la trazabilidad de cada cambio."

Opción 2: Orientada al Proceso (Énfasis en los pasos a seguir)
"Para mantener un desarrollo ordenado y de calidad, se implementa el siguiente flujo de trabajo colaborativo:

Protección de main: El commit directo a la rama principal está prohibido para prevenir fallos.

Uso de PRs: Todo cambio debe originarse en una rama nueva y ser enviado a main mediante un Pull Request.

Revisión y Aprobación: Los PRs deben ser revisados por un compañero y recibir aprobación antes de ser fusionados.

Manejo de Conflictos: La resolución de conflictos es responsabilidad del PR antes de proceder a la integración.

Este método garantiza la colaboración, el control de cambios y la calidad del proyecto."

Opción 3: Breve y Directa
"Hemos adoptado buenas prácticas de colaboración para un desarrollo de calidad: La rama main está protegida, y todos los cambios requieren un Pull Request (PR). Es obligatorio que estos PRs pasen por una revisión y aprobación de código antes de fusionarse. Los **conflictos deben ser resueltos en la rama del



###Configuracion del entorno
- java version: 21
- -IDE recomendado: IntelliJ
- Plugins Gradle: Spring-boot

###Estructura 
src/
 ├─ main/
 │   ├─ java/com/ecommerce/app/
 │   │   ├─ controllers/
 │   │   ├─ services/
 │   │   ├─ repositories/
 │   │   └─ models/
 │   └─ resources/
 │       ├─ application.properties
 │       └─ static/ (CSS, JS, imágenes)
 └─ test/java/com/ecommerce/app/

###Seguridad
-verificacion con springboot
cifrado de contraseñas
manejo de roles(usuario/admin)

###IDEAS DE MEJORA
-Seguridad:Implementar JWT para sesiones seguras y cifrado de contraseñas.
-Escalabilidad:Preparar la app para migrarla fácilmente a la nube.
-Programacion:Usar Swagger o OpenAPI para probar y visualizar los endpoints.
-Pruebas:Integrar JUnit para verificar el funcionamiento de los controladores.

###FLUJO DE USUARIOS
-Diseño intuitivo y rapido para mejorar la experiencia
-Integrar metodos locales como yape o plin
-El historial de pedidos refuerza la confianza

###CONTROL DE VERSIONES EN LA NUBE
Trabajar con sistemas de control de versiones en la nube permite colaborar de forma organizada y segura, guardando el historial de cambios y mostrando quién modificó qué y cuándo.
Además, ofrece sincronización automática y acceso remoto, lo que facilita el trabajo en equipo.

 Contribución: se implementó la estructura base del proyecto Spring Boot para la tienda de ropa.
Contribución: se configuró la conexión a la base de datos y la capa de persistencia con JPA.
Contribución: se desarrolló el controlador para gestionar los productos (CRUD completo).
Contribución: se agregó validación de datos al registrar nuevos productos y clientes.
Contribución: se implementó el endpoint para listar los productos disponibles en la tienda.
Contribución: se añadió la lógica de negocio para calcular el stock y los precios con descuento.
Contribución: se configuró Swagger para documentar los servicios REST del proyecto.
Contribución: se realizaron pruebas de integración con Postman para verificar el correcto funcionamiento del backend.
Contribución: se mejoró la estructura del proyecto siguiendo el patrón MVC y buenas prácticas de Spring Boot.


## 🗣️ Comunicación y Coordinación del Equipo (Discord)

Durante el desarrollo del proyecto se utilizó **Discord** como la principal herramienta de comunicación y coordinación del equipo.

### 💬 Objetivos del uso de Discord

- **Comunicación en tiempo real:** permite resolver dudas técnicas o de diseño de forma inmediata sin depender de reuniones presenciales.  
- **Colaboración constante:** facilita la planificación diaria, asignación de tareas y seguimiento del progreso.  
- **Canales temáticos:** se organizaron canales como `#frontend`, `#backend`, `#base-de-datos`, `#reuniones` y `#avisos` para mantener la información clara y ordenada.  
- **Reuniones virtuales:** se realizan llamadas de voz o video para revisiones de código, demostraciones de avance y coordinación de entregas.  
- **Integración con GitHub:** se configuraron notificaciones automáticas de commits, issues y pull requests en un canal dedicado del servidor.


