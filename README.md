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

Para asegurar un flujo de trabajo organizado y de calidad, hemos implementado las siguientes prácticas:

- **Main protegido**: la rama principal no acepta commits directos, evitando errores y cambios accidentales.  
- **Pull Requests (PRs)**: todos los cambios deben realizarse en ramas individuales y luego enviarse mediante un PR hacia `main`.  
- **Revisiones de código**: los PRs deben ser revisados y aprobados antes de fusionarse, fomentando el trabajo en equipo y la detección temprana de problemas.  
- **Resolución de conflictos**: en caso de conflictos, estos se resuelven en la rama del PR antes de la fusión.  

Este flujo asegura colaboración responsable, control de calidad y trazabilidad de todos los cambios en el proyecto.



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

☁️ Control de Versiones en la Nube

El uso de plataformas de control de versiones en la nube permite una colaboración estructurada y segura entre los miembros del equipo. Estas herramientas almacenan el historial de modificaciones, mostrando quién realizó cada cambio y en qué momento. Además, ofrecen sincronización automática y acceso remoto, lo que facilita el trabajo colaborativo y la continuidad del desarrollo del proyecto.

Principales contribuciones al proyecto:

Se estableció la estructura base del proyecto en Spring Boot para la tienda de ropa.

Se configuró la conexión con la base de datos y la capa de persistencia mediante JPA.

Se desarrolló el controlador CRUD completo para la gestión de productos.

Se añadieron validaciones de datos al registrar nuevos productos y clientes.

Se implementó un endpoint para listar los productos disponibles en la tienda.

Se integró la lógica de negocio para el cálculo de stock y aplicación de descuentos.

Se configuró Swagger para la documentación de los servicios REST.

Se realizaron pruebas de integración con Postman para comprobar el correcto funcionamiento del backend.

Se optimizó la arquitectura del proyecto aplicando el patrón MVC y las buenas prácticas de desarrollo con Spring Boot.

🗣️ Comunicación y Coordinación del Equipo (Discord)

Durante el desarrollo, Discord se utilizó como la herramienta principal para la comunicación y coordinación del equipo.

💬 Propósitos del uso de Discord

Interacción en tiempo real: permitió resolver dudas técnicas o de diseño de manera inmediata sin necesidad de reuniones presenciales.

Colaboración continua: facilitó la planificación diaria, distribución de tareas y seguimiento del avance del proyecto.

Canales organizados: se crearon canales temáticos como #frontend, #backend, #base-de-datos, #reuniones y #avisos, lo que ayudó a mantener una comunicación clara y ordenada.

Reuniones virtuales: se llevaron a cabo videollamadas y revisiones de código para evaluar avances y coordinar entregas.

Integración con GitHub: se configuraron notificaciones automáticas sobre commits, issues y pull requests en un canal específico, mejorando la sincronización del equipo.


