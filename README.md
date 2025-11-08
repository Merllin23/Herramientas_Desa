# Proyecto: Aplicación de E-Commerce

# Prueba de versiones

## Integrantes

* Patrick Calderon
* Abel Vargas



INTRODUCCION DEL PROYECTO
El presente proyecto consiste en el desarrollo de una tienda virtual de ropa moderna, diseñada para ofrecer una experiencia de compra rapida, atractiva y segura.
El objetivo principal es permitir a los usuarios explorar el catalogo digital de prendas, vizualisar precios, detalles y realizar compras en linea desde cualquier dispositivo.

Este E-commerce fue creado utilizando IntelliJ IDEA como entorno y springboot como framework principal, lo que permite, una arquitectura escalable y segura.
El proyecto busca simular el funcionamiento real de una tienda online, integrando modulos para la gestion de productos, clientes, pedidos y autenticacion de usuarios

El diseño visual se inspira en tendencias minimalistas, priorizando la usabilidad y una navegacion intuitiva.
De esta manera se busca que el cliente encuentre rapidamente lo que busca y disfrute de una experiencia moderna y fluida.

---
Análisis del Boceto de la Tienda de Ropa Online
1. Diseño General

El diseño muestra una apariencia moderna, limpia y profesional, perfecta para una tienda de ropa.
La estructura en secciones (encabezado, catálogo y pie de página) permite una navegación fluida y ayuda al usuario a encontrar rápidamente lo que necesita, algo esencial en el comercio digital.

2. Encabezado Header
Se observa claramente el nombre o logotipo de la tienda, junto con los accesos directos a las secciones mas importantes(inicio, tienda , contacto, etc.)

3. Seccion principal (catalogo)
El catalogo esta bien organizado, con imagenes de las prendas visibles y bien espaciadas
Recomendacion para mejoras: usar fondos blancos o neutros para resaltar mejor los colores y detalles de las prendas.

4.Colores y estilo visual
La tableta es equilibrada y transmite profesionalismo. Se mantiene una tipografia coherente y legible  para reforzar la armonia visual


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

🔐 Seguridad

Se implementó la autenticación de usuarios mediante el framework Spring Boot.

Se aplicó el cifrado de contraseñas para garantizar la confidencialidad de las credenciales.

Se gestionaron roles de acceso (usuario y administrador) para establecer distintos niveles de permisos dentro del sistema.

💡 Propuestas de Mejora

Seguridad: incorporar el uso de JWT (JSON Web Tokens) para fortalecer la protección de las sesiones y mantener el cifrado de datos sensibles.

Escalabilidad: adaptar la aplicación para una futura migración a entornos en la nube, facilitando su crecimiento y mantenimiento.

Programación: integrar herramientas como Swagger o OpenAPI que permitan probar y visualizar los endpoints de manera más eficiente.

Pruebas: implementar JUnit para realizar tests automatizados que aseguren el correcto funcionamiento de los controladores.

👥 Flujo de Usuarios

Diseñar una interfaz rápida e intuitiva, centrada en la experiencia del usuario.

Incorporar métodos de pago locales como Yape o Plin para mayor comodidad.

Mostrar un historial de pedidos, brindando transparencia y confianza al cliente durante su proceso de compra.

☁️ Control de Versiones en la Nube

El empleo de plataformas de control de versiones en la nube permite mantener un trabajo colaborativo, seguro y estructurado, conservando el historial de cambios realizados por cada integrante del equipo.
Asimismo, proporciona sincronización automática y acceso remoto, optimizando la cooperación y el desarrollo continuo del proyecto.

🧩 Contribuciones Realizadas

Creación de la estructura inicial del proyecto en Spring Boot para la tienda de ropa.

Configuración de la conexión a la base de datos y la capa de persistencia mediante JPA.

Desarrollo del controlador principal con operaciones CRUD para los productos.

Inclusión de validaciones de datos en el registro de productos y clientes.

Implementación de un endpoint para listar productos disponibles.

Desarrollo de la lógica de negocio para calcular stock y precios con descuento.

Integración de Swagger para documentar y probar los servicios REST.

Ejecución de pruebas de integración con Postman para comprobar la funcionalidad del backend.

Mejora de la estructura del proyecto, siguiendo el patrón MVC y las buenas prácticas de desarrollo en Spring Boot.

## 🗣️ Comunicación y Coordinación del Equipo (Discord)

Durante el desarrollo del proyecto se utilizó **Discord** como la principal herramienta de comunicación y coordinación del equipo.

### 💬 Objetivos del uso de Discord

- **Comunicación en tiempo real:** permite resolver dudas técnicas o de diseño de forma inmediata sin depender de reuniones presenciales.  
- **Colaboración constante:** facilita la planificación diaria, asignación de tareas y seguimiento del progreso.  
- **Canales temáticos:** se organizaron canales como `#frontend`, `#backend`, `#base-de-datos`, `#reuniones` y `#avisos` para mantener la información clara y ordenada.  
- **Reuniones virtuales:** se realizan llamadas de voz o video para revisiones de código, demostraciones de avance y coordinación de entregas.  
- **Integración con GitHub:** se configuraron notificaciones automáticas de commits, issues y pull requests en un canal dedicado del servidor.

💡 Beneficios adicionales del uso de Discord en proyectos de sistemas

Integración con herramientas de desarrollo: Discord puede conectarse con GitHub, Trello, Notion o Jira, enviando notificaciones automáticas sobre tareas o commits.

Soporte para bots personalizados: se pueden usar bots para automatizar recordatorios de reuniones, registrar asistencia o mostrar el estado del repositorio.

Compartición de archivos: permite subir documentos, capturas de código, imágenes de diseño o manuales sin salir del entorno de trabajo.

Canales de pruebas y debugging: el equipo puede usar canales específicos para compartir errores, sugerencias y avances en correcciones.
🧠 Ejemplo práctico de organización en Discord

Servidor del proyecto: “Sistema de Gestión XYZ”
Canales creados:

#general → anuncios y avisos del líder del equipo

#frontend → discusiones de interfaz y Angular

#backend → lógica del sistema y controladores Java

#base-de-datos → consultas SQL y modelos

#github-commits → notificaciones automáticas de push o pull request

#soporte → dudas técnicas o configuración local

  Roles definidos:

👑 Líder del proyecto

💻 Desarrollador Backend

🎨 Diseñador UI

🧩 Tester / QA

📊 Documentador


🛠️ Sistemas de Seguimiento de Incidentes

Los sistemas de seguimiento de incidentes son herramientas utilizadas para registrar, controlar y resolver errores, fallos o solicitudes que surgen durante el ciclo de vida de un proyecto de software. Permiten a los equipos mantener un control centralizado de problemas, garantizando una respuesta rápida y eficiente.

💡 Objetivos principales

Registrar y priorizar incidentes: cada error o solicitud se documenta con su nivel de urgencia y responsable asignado.

Mejorar la comunicación del equipo: todos los miembros pueden ver el estado de los problemas y colaborar en su solución.

Monitorear el progreso del proyecto: facilita el seguimiento del rendimiento y la detección temprana de áreas críticas.

Asegurar la calidad del software: al gestionar correctamente los errores, se garantiza la estabilidad del sistema final.

🧩 Tecnologías Utilizadas
Categoría	Herramientas / Frameworks
Frontend	Angular, TypeScript, HTML5, CSS3, Bootstrap
Backend	Node.js / Express (o Spring Boot si lo estás usando)
Base de Datos	MySQL / PostgreSQL / Firebase
Control de versiones	GitHub
Comunicación y Organización	Discord, Trello, Notion
Diseño y prototipado	Figma, Canva, Balsamiq
