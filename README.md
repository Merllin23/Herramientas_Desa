# Resumen de proyecto

## 👥 Integrantes
- Patrick Calderon  
- Abel Vargas  

---

## 🚀 Mejoras Propuestas
1. **Ejecutor en GitHub**  
   - Configurar *GitHub Actions* para correr el proyecto desde el repositorio.  
   - Permite a cualquier persona (ej. el profesor) ver la app sin instalar dependencias.  
   - Aplica buenas prácticas de CI/CD.  

2. **Instrucciones con Gradle**  
   - Añadir pasos claros en el README para clonar, compilar y ejecutar.  

3. **Badges en el README**  
   - Estado del build (passing/failing).  
   - Versión de Gradle.  
   - Cobertura de pruebas.  
   - Lenguajes/tecnologías usadas.  

4. **Ejemplo visual**  
   - Incluir capturas de pantalla o demo del uso de la app.  

---

## 📱 Estructura General de la App

### 🏠 Pantalla de Inicio (Home)
- Banner con promociones.  
- Categorías destacadas (laptops, accesorios, componentes, periféricos).  
- Productos recomendados o más vendidos.  

### 🔑 Autenticación de Usuarios
- Registro (correo, Google, Facebook).  
- Inicio de sesión.  
- Perfil de usuario.  

### 🛍️ Gestión de Productos
- Catálogo con búsqueda y filtros (precio, marca, categoría).  
- Detalle del producto (nombre, descripción, imágenes, precio, stock, reseñas).  
- Botón de **Agregar al carrito**.  

### 🛒 Carrito de Compras
- Listado de productos añadidos.  
- Actualizar cantidad o eliminar.  
- Cálculo de subtotal, IGV y total.  

### 💳 Checkout
- Datos de envío (dirección, teléfono, distrito).  
- Métodos de pago: tarjeta, Yape/Plin, contraentrega.  
- Confirmación de pedido.  

### 📦 Gestión de Pedidos
- Ver historial de pedidos.  
- Estado: pendiente, en camino, entregado.  


## 🛠️ Módulos de Administración (Backoffice)
- CRUD de usuarios.  
- CRUD de productos.  
- CRUD de categorías.  
- Gestión de pedidos (actualizar estado).  
- Reportes (ventas, stock).  


## 🗄️ Base de Datos (Ejemplo en PostgreSQL/MySQL)

**Usuario**  
`id, nombre, correo, contraseña, rol, dirección, teléfono`  

**Producto**  
`id, nombre, descripción, precio, stock, categoría, marca, númeroSerie`  

**Categoría**  
`id, nombre`  

**Pedido**  
`id, idUsuario, fecha, total, estado`  

**DetallePedido**  
`id, idPedido, idProducto, cantidad, subtotal`  


## 🔄 Flujo del Usuario
1. Usuario abre la app → ve productos destacados.  
2. Busca o filtra por categoría → selecciona un producto.  
3. Agrega producto al carrito → revisa total.  
4. Pasa al checkout → llena datos de envío y pago.  
5. Confirma pedido → se guarda en la base de datos.  



# 3. Ejecutar la aplicación
./gradlew bootRun
