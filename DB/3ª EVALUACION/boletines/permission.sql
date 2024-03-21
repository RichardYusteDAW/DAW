# EJERCICIO 1. Crea un usuario 'admin' con contraseña 'password' y permisos para acceder y administrar todas las bases de datos.
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'admin'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 2. Concede los privilegios SELECT, INSERT, UPDATE y DELETE sobre todas las tablas de la base de datos 'jardineria' al usuario 'admin'.
GRANT SELECT, INSERT, UPDATE, DELETE ON jardineria.* TO 'admin'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 3. Cambia la contraseña del usuario 'admin' a 'newpassword'.
ALTER USER IF EXISTS 'admin'@'localhost' IDENTIFIED BY 'newpassword';
FLUSH PRIVILEGES;

# EJERCICIO 4. Otorga el privilegio de modificación de tablas al usuario 'admin' sobre la tabla 'producto'.
GRANT UPDATE ON jardineria.producto TO 'admin'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 5. Elimina el privilegio de borrado sobre la tabla 'cliente' al usuario 'admin'.
REVOKE DELETE ON jardineria.cliente FROM 'admin'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 6. Crea un nuevo usuario 'analista' con contraseña 'securepass' y permisos solo para acceder a la tabla 'pedido'.
CREATE USER 'analista'@'localhost' IDENTIFIED BY 'securepass';
GRANT SELECT ON jardineria.pedido TO 'analista'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 7. Establece la caducidad de la contraseña del usuario 'analista' para que expire en 90 días.
ALTER USER 'analista'@'localhost' PASSWORD EXPIRE INTERVAL 90 DAY;
FLUSH PRIVILEGES;

# EJERCICIO 8. Concede al usuario 'analista' permisos para SELECT y UPDATE en la columna 'estado' de la tabla 'pedido'.
GRANT SELECT, UPDATE (estado) ON jardineria.pedido TO 'analista'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 9. Elimina al usuario 'analista' el privilegio de actualización sobre la columna 'fecha_entrega' de la tabla 'pedido.
REVOKE UPDATE (fecha_entrega) ON jardineria.pedido FROM 'analista'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 10. Crea un usuario 'cliente1' con contraseña 'clientpass' y permisos solo para acceder y modificar sus propios pagos.
CREATE USER 'cliente1'@'localhost' IDENTIFIED BY 'clientpass';
GRANT SELECT, INSERT, UPDATE ON jardineria.pago TO 'cliente1'@'localhost' WHERE codigo_cliente=1;
FLUSH PRIVILEGES;

# EJERCICIO 11. Bloquea la cuenta del usuario 'cliente1'.
ALTER USER 'cliente1'@'localhost' ACCOUNT LOCK;
FLUSH PRIVILEGES;

# EJERCICIO 12. Desbloquea la cuenta del usuario 'cliente1'.
ALTER USER 'cliente1'@'localhost' ACCOUNT UNLOCK;
FLUSH PRIVILEGES;

# EJERCICIO 13. Elimina al usuario 'cliente1' todos los privilegios sobre la tabla 'pago'.
REVOKE ALL PRIVILEGES ON jardineria.pago FROM 'cliente1'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 14. Crear un usuario 'vendedor' con contraseña 'salespass' y permisos para acceder y administrar todas las tablas excepto 'detalle_pedido'.
CREATE USER 'vendedor'@'localhost' IDENTIFIED BY 'salespass';
GRANT ALL PRIVILEGES ON jardineria.* TO 'vendedor'@'localhost';
REVOKE ALL PRIVILEGES ON jardineria.detalle_pedido FROM 'vendedor'@'localhost';
FLUSH PRIVILEGES;

# EJERCICIO 15. Conceder al usuario 'vendedor' permisos para SELECT, INSERT y UPDATE sobre la tabla 'pedido'.
GRANT SELECT, INSERT, UPDATE ON jardineria.pedido TO 'vendedor'@'localhost';
FLUSH PRIVILEGES;