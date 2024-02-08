create database coches;
USE coches;

-- Table: MARCA
CREATE TABLE IF NOT EXISTS MARCA ( 
    cifm   SMALLINT    NOT NULL
                       DEFAULT 1,
    nombre CHAR( 10 )  NOT NULL,
    ciudad CHAR( 20 )  NOT NULL,
    PRIMARY KEY ( cifm ) 
);


INSERT INTO MARCA (cifm, nombre, ciudad) VALUES (1, 'seat', 'Madrid');
INSERT INTO MARCA (cifm, nombre, ciudad) VALUES (2, 'renault', 'Barcelona');
INSERT INTO MARCA (cifm, nombre, ciudad) VALUES (4, 'audi', 'Madrid');
INSERT INTO MARCA (cifm, nombre, ciudad) VALUES (3, 'citroen', 'Valencia');
INSERT INTO MARCA (cifm, nombre, ciudad) VALUES (5, 'opel', 'Bilbao');
INSERT INTO MARCA (cifm, nombre, ciudad) VALUES (6, 'bmw', 'Barcelona');

-- Table: COCHE
CREATE TABLE IF NOT EXISTS COCHE ( 
    codcoche SMALLINT    NOT NULL,
    nombre   CHAR( 15 )  NOT NULL,
    modelo   CHAR( 10 ),
    PRIMARY KEY ( codcoche )
);


INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (1, 'ibiza', 'glx');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (2, 'ibiza', 'gti');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (3, 'ibiza', 'gtd');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (4, 'toledo', 'gtd');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (5, 'cordoba', 'gti');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (6, 'megane', '1.6');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (7, 'megane', 'gti');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (8, 'laguna', 'gtd');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (9, 'laguna', 'td');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (10, 'zx', '16v');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (11, 'zx', 'td');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (12, 'xantia', 'gtd');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (13, 'a4', '1.8');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (14, 'a4', '2.8');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (15, 'astra', 'caravan');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (16, 'astra', 'gti');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (17, 'corsa', '1.4');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (18, 300, '316i');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (19, 500, '525i');
INSERT INTO COCHE (codcoche, nombre, modelo) VALUES (20, 700, '750i');

-- Table: MARCO
CREATE TABLE IF NOT EXISTS MARCO ( 
    cifm     SMALLINT NOT NULL,
    codcoche SMALLINT NOT NULL,
    PRIMARY KEY ( cifm, codcoche ),
    FOREIGN KEY ( cifm ) REFERENCES MARCA (cifm),
    FOREIGN KEY ( codcoche ) REFERENCES COCHE (codcoche)
);


INSERT INTO MARCO (cifm, codcoche) VALUES (1, 1);
INSERT INTO MARCO (cifm, codcoche) VALUES (1, 2);
INSERT INTO MARCO (cifm, codcoche) VALUES (1, 3);
INSERT INTO MARCO (cifm, codcoche) VALUES (1, 4);
INSERT INTO MARCO (cifm, codcoche) VALUES (1, 5);
INSERT INTO MARCO (cifm, codcoche) VALUES (2, 6);
INSERT INTO MARCO (cifm, codcoche) VALUES (2, 7);
INSERT INTO MARCO (cifm, codcoche) VALUES (2, 8);
INSERT INTO MARCO (cifm, codcoche) VALUES (2, 9);
INSERT INTO MARCO (cifm, codcoche) VALUES (3, 10);
INSERT INTO MARCO (cifm, codcoche) VALUES (3, 11);
INSERT INTO MARCO (cifm, codcoche) VALUES (3, 12);
INSERT INTO MARCO (cifm, codcoche) VALUES (4, 13);
INSERT INTO MARCO (cifm, codcoche) VALUES (4, 14);
INSERT INTO MARCO (cifm, codcoche) VALUES (5, 15);
INSERT INTO MARCO (cifm, codcoche) VALUES (5, 16);
INSERT INTO MARCO (cifm, codcoche) VALUES (5, 17);
INSERT INTO MARCO (cifm, codcoche) VALUES (6, 18);
INSERT INTO MARCO (cifm, codcoche) VALUES (6, 19);
INSERT INTO MARCO (cifm, codcoche) VALUES (6, 20);

-- Table: CONCESIONARIO
CREATE TABLE IF NOT EXISTS CONCESIONARIO ( 
    cifc   SMALLINT    PRIMARY KEY
                       NOT NULL,
    nombre CHAR( 50 ),
    ciudad CHAR( 50 ) 
);


INSERT INTO CONCESIONARIO (cifc, nombre, ciudad) VALUES (1, 'acar', 'Madrid');
INSERT INTO CONCESIONARIO (cifc, nombre, ciudad) VALUES (2, 'bcar', 'Madrid');
INSERT INTO CONCESIONARIO (cifc, nombre, ciudad) VALUES (3, 'ccar', 'Barcelona');
INSERT INTO CONCESIONARIO (cifc, nombre, ciudad) VALUES (4, 'dcar', 'Valencia');
INSERT INTO CONCESIONARIO (cifc, nombre, ciudad) VALUES (5, 'ecar', 'Bilbao');

-- Table: DISTRIBUCION
CREATE TABLE IF NOT EXISTS DISTRIBUCION ( 
    cifc     SMALLINT NOT NULL,
    codcoche SMALLINT     NOT NULL,
    cantidad INT          NOT NULL,
    PRIMARY KEY ( cifc, codcoche),
    CONSTRAINT test_ibfk_1 FOREIGN KEY ( cifc ) REFERENCES CONCESIONARIO ( cifc ),
    CONSTRAINT test_ibfk_2 FOREIGN KEY ( codcoche ) REFERENCES COCHE ( codcoche ) 
);


INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (1, 1, 3);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (1, 5, 7);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (1, 6, 7);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (2, 6, 5);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (2, 8, 10);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (2, 9, 10);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (3, 10, 5);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (3, 11, 3);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (3, 12, 5);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (4, 13, 10);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (4, 14, 5);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (5, 15, 10);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (5, 16, 20);
INSERT INTO DISTRIBUCION (cifc, codcoche, cantidad) VALUES (5, 17, 8);

-- Table: VENTA
CREATE TABLE IF NOT EXISTS VENTA ( 
    cifc     SMALLINT    NOT NULL,
    cifcl    SMALLINT    NOT NULL,
    codcoche SMALLINT    NOT NULL,
    color    CHAR( 20 )  NOT NULL,
    PRIMARY KEY ( cifc, cifcl, codcoche ),
    FOREIGN KEY ( cifc ) REFERENCES CONCESIONARIO ( cifc ) 
);


INSERT INTO VENTA (cifc, cifcl, codcoche, color) VALUES (1, 1, 1, 'blanco');
INSERT INTO VENTA (cifc, cifcl, codcoche, color) VALUES (1, 2, 5, 'rojo');
INSERT INTO VENTA (cifc, cifcl, codcoche, color) VALUES (2, 3, 8, 'blanco');
INSERT INTO VENTA (cifc, cifcl, codcoche, color) VALUES (2, 1, 6, 'rojo');
INSERT INTO VENTA (cifc, cifcl, codcoche, color) VALUES (3, 4, 11, 'rojo');
INSERT INTO VENTA (cifc, cifcl, codcoche, color) VALUES (4, 5, 14, 'verde');

-- Table: CLIENTE
CREATE TABLE IF NOT EXISTS CLIENTE ( 
    cifcl           SMALLINT    PRIMARY KEY
                                NOT NULL,
    nombre          CHAR( 50 ),
    apellidos       CHAR( 50 ),
    ciudad          CHAR( 50 ),
    fechanacimiento DATE 
);


INSERT INTO CLIENTE (cifcl, nombre, apellidos, ciudad, fechanacimiento) VALUES (1, 'Luis', 'García', 'Madrid', '1981-10-06');
INSERT INTO CLIENTE (cifcl, nombre, apellidos, ciudad, fechanacimiento) VALUES (2, 'Antonio', 'López', 'Valencia', null);
INSERT INTO CLIENTE (cifcl, nombre, apellidos, ciudad, fechanacimiento) VALUES (3, 'Juan', 'Martín', 'Madrid', null);
INSERT INTO CLIENTE (cifcl, nombre, apellidos, ciudad, fechanacimiento) VALUES (4, 'María', 'García', 'Madrid', null);
INSERT INTO CLIENTE (cifcl, nombre, apellidos, ciudad, fechanacimiento) VALUES (5, 'Javier', 'González', 'Barcelona', null);
INSERT INTO CLIENTE (cifcl, nombre, apellidos, ciudad, fechanacimiento) VALUES (6, 'Ana', 'López', 'Barcelona', null);

-- Index: icifm
CREATE UNIQUE INDEX icifm ON MARCA ( cifm );



-- EJERCICIO 1. Obtener los datos de todos los clientes de Madrid:
SELECT * FROM cliente WHERE ciudad = 'Madrid';

-- EJERCICIO 2. Obtener los nombres de todas las marcas de coches ordenadas alfabéticamente:
SELECT nombre FROM marca ORDER BY nombre ASC;

-- EJERCICIO 3. Obtener el identificador de todos los concesionarios cuya cantidad de coches distribuida sea mayor que 18:
SELECT cifc, cantidad FROM distribucion WHERE cantidad > 18;

-- EJERCICIO 4. Obtener el identificador de todos los concesionarios cuya cantidad de coches distribuida esté comprendida entre 10 y 18, ambos inclusive:
SELECT cifc, cantidad FROM distribucion WHERE cantidad BETWEEN 10 AND 18;
SELECT cifc, cantidad FROM distribucion WHERE cantidad >= 10 AND cantidad <= 18;

-- EJERCICIO 5. Obtener el identificador de todos los concesionarios cuya cantidad distribuida está comprendida entre 10 y 18, ambos incluidos:
SELECT cifc, SUM (cantidad) AS cantidad_total FROM distribucion GROUP BY cifc HAVING cantidad_total BETWEEN 10 AND 18;

-- EJERCICIO 6. Obtener el identificador de los concesionarios que han adquirido más de 10 coches de algún tipo, o menos de 5 (como se indica, de un tipo, no en total):
SELECT cifc, cantidad FROM distribucion WHERE cantidad > 10 OR cantidad < 5;

-- EJERCICIO 7. Obtener todas las parejas de identificadores de marcas y clientes que sean de la misma ciudad:
SELECT cifcl, cifm FROM cliente c, marca m WHERE c.ciudad = m.ciudad;
SELECT cifcl, cifm FROM cliente c INNER JOIN marca m ON c.ciudad = m.ciudad;

-- EJERCICIO 8. Obtener todas las parejas de identificadores de clientes y marcas que no sean de la misma ciudad:
SELECT cifcl, cifm FROM cliente c, marca m WHERE c.ciudad <> m.ciudad;
SELECT cifcl, cifm FROM cliente c, marca m WHERE c.ciudad != m.ciudad;

-- EJERCICIO 9. Obtener los códigos de los coches distribuidos por algún concesionario de Barcelona:
SELECT codcoche FROM concesionario c, distribucion d WHERE (d.cifc = c.cifc) AND (c.ciudad = 'Barcelona');
SELECT codcoche FROM concesionario c INNER JOIN distribucion d ON (d.cifc = c.cifc) WHERE c.ciudad = 'Barcelona';

-- EJERCICIO 10. Obtener el código de los coches vendidos a clientes de Madrid:
SELECT codcoche FROM cliente c, venta v WHERE (c.cifcl = v.cifcl) AND (ciudad = 'Madrid');
SELECT codcoche FROM cliente c INNER JOIN venta v ON (c.cifcl = v.cifcl) WHERE c.ciudad = 'Madrid';

SELECT default_collation_name FROM information_schema.schemata WHERE schema_name = 'coches';