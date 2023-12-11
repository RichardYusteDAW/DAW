/*DDL (Data Definition Language)*/
	--Crear nuevas tablas o bases de datos:
	CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] nombre_base_datos CHARACTER SET utf8 COLLATE utf8_general_ci;
		CHARACTER SET		--Especifica el set de caracteres que vamos a utilizar en la base de datos.
		SHOW CHARACTER SET 	--Muestras las opciones (utf8, utf8mb4, utf16, utf32...).
		COLLATE				--Indica el criterio que vamos a seguir para ordenar las cadenas de caracteres.
		SHOW COLLATE		--Muestras las opciones (case-sensitive(_cs), case-insensitive(_ci), binary(_bin)).
		
	--Eliminar tablas y bases de datos:
	DROP {DATABASE | SCHEMA} [IF EXISTS] nombre_base_datos;
	
	--Modificar la estructura de las tablas existentes:
	ALTER DATABASE nombre_base_datos CHARACTER SET utf8;
	
	--Eliminar contenido de una tabla sin eliminar la tabla:
	TRUNCATE TABLE nombre_de_la_tabla;


/*DML (Data Manipulation Language)*/
	USE	nombre_base_datos				--Seleccionar la base de datos.
	SHOW {DATABASES | SCHEMAS}			--Muestra todas las bases de datos en el servidor.
	SHOW TABLES							--Muestra todas las tablas en la base de datos actual.
	SHOW TABLES FROM nombre_base_datos	--Muestra todas las tablas en una base de datos específica.
	SHOW COLUMNS FROM nombre_tabla		--Muestra información sobre las columnas de una tabla específica
	SELECT		--Consultar datos de la base de datos y recuperar filas de una tabla.
	INSERT		--Insertar datos en una tabla.
	UPDATE		--Actualizar datos existentes dentro de una tabla.
	DELETE		--Eliminar datos de una tabla.


/*DCL (Data Control Language)*/
GRANT		--Se utiliza para otorgar permisos a los usuarios de la base de datos para realizar acciones específicas, como permisos para leer o escribir en una tabla.
REVOKE		--Se utiliza para retirar esos permisos.


/*TCL (Transaction Control Language)*/