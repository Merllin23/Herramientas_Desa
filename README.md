# Herramientas de Desarollo

## Intregrandes:

- Patrick Calderon

- Abel Vargas

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

