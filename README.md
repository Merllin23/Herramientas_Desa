## Herramientas de Desarollo

# Prueba de versiones(Version 1)

### Intregrandes:

- Patrick Calderon

- Abel Vargas

## Ideas
- Agregar un ejecutor para que el profesor pueda, desde el repositorio en GitHub, cargar la página directamente.
- Incluir instrucciones claras de cómo correr el proyecto en local con Gradle.
- Añadir badges (por ejemplo, “Build with Gradle”, estado del build, etc.) para hacer el README más visual.
- Preparar un ejemplo de uso o captura de pantalla para mostrar el resultado al ejecutar la app.

1. Agregar un ejecutor desde GitHub

Actualmente, para probar el proyecto es necesario descargarlo y ejecutarlo de manera local. Una mejora interesante sería configurar un workflow en GitHub Actions que permita ejecutar el proyecto directamente desde el repositorio. Esto le daría al profesor y a cualquier persona interesada la posibilidad de ver cómo funciona la aplicación sin necesidad de instalar dependencias adicionales en su máquina.
Además, con esta configuración estaríamos aplicando prácticas de integración continua (CI/CD), lo que no solo mejora la experiencia del usuario, sino que también demuestra competencias en entornos de desarrollo modernos y automatización.

2. Instrucciones claras de ejecución local con Gradle

Aunque Gradle es una herramienta bastante estándar en proyectos Java, no todas las personas que revisen el proyecto necesariamente estarán familiarizadas con su uso. Por ello, es importante añadir un apartado en el README con instrucciones claras y detalladas sobre cómo clonar el repositorio, compilar el código y ejecutar la aplicación con Gradle.
Esto asegura que cualquier usuario, sin importar su nivel de experiencia, pueda correr el programa sin contratiempos. También es una buena práctica de documentación, ya que permite que el proyecto sea reproducible y accesible para nuevos desarrolladores en el futuro.

3. Incluir badges en el README

El README puede enriquecerse con el uso de badges (insignias visuales) que aporten información rápida sobre el estado del proyecto. Por ejemplo, se pueden incluir badges de:

Estado de la compilación (Build passing/failing).

Versión de Gradle utilizada.

Cobertura de pruebas unitarias.

Lenguaje o tecnologías empleadas.

Estos elementos no solo hacen que el README sea más atractivo visualmente, sino que también transmiten un aire de profesionalismo y transparencia, mostrando de un vistazo el estado actual del proyecto y sus tecnologías principales.



1. Estructura General de la App

Pantalla de inicio (Home):

Banner con promociones.

Categorías destacadas (laptops, accesorios, componentes, periféricos).

Productos recomendados o más vendidos.


Autenticación de usuarios:

Registro (correo, Google, Facebook).

Inicio de sesión.

Perfil de usuario.


Gestión de productos:

Catálogo de productos con búsqueda y filtros (precio, marca, categoría).

Vista de detalle del producto (nombre, descripción, imágenes, precio, stock, reseñas).

Botón de “Agregar al carrito”.


Carrito de compras:

Listado de productos añadidos.

Actualizar cantidad o eliminar producto.

Calcular subtotal, IGV, total.


Proceso de compra (Checkout):

Datos de envío (dirección, teléfono, distrito).

Selección de método de pago (tarjeta, Yape/Plin, contraentrega).

Confirmación de pedido.


Gestión de pedidos:

Ver historial de pedidos.

Estado del pedido (pendiente, en camino, entregado).




---

🔹 2. Módulos de Administración (Backoffice)

Gestión de usuarios (CRUD).

Gestión de productos (CRUD).

Gestión de categorías.

Gestión de pedidos (ver, actualizar estados).

Reportes (ventas, stock).



---

🔹 3. Base de Datos (Ejemplo en PostgreSQL/MySQL)

Tablas principales:

Usuario: id, nombre, correo, contraseña, rol, dirección, teléfono.

Producto: id, nombre, descripción, precio, stock, categoría, marca, númeroSerie.

Categoría: id, nombre.

Pedido: id, idUsuario, fecha, total, estado.

DetallePedido: id, idPedido, idProducto, cantidad, subtotal.



---

🔹 4. Flujo del Usuario

1. Usuario abre la app → ve productos destacados.


2. Busca o filtra por categoría → selecciona producto.


3. Agrega producto al carrito → revisa total.


4. Pasa al checkout → llena datos de envío y pago.


5. Confirma pedido → se guarda en BD.
6. 

