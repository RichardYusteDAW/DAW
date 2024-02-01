--Eliminar base de datos si existe:
drop database `tienda_ropa` if exists;
--Creación base de datos con ut8 y case insensitive:
create database if not exists `tienda_ropa` DEFAULT CHARACTER SET `utf8` COLLATE `utf8_general_ci`;
use `tienda_ropa`;


-- Creación de tablas:
create table factura(
	num_factura int primary key auto_increment,
    cantidad int not null,
    total int not null,
    fecha date not null,
    dto float(3,2) not null	
);

create table cliente(
	id_cliente int primary key auto_increment,
    dni char(9) not null ,
    nombre varchar(25) not null,
	ap1 varchar(25) not null,
    ap2 varchar(25) not null
);

create table telefonos_cliente(
	id_cliente int not null,
    telefono char(12) not null,
    primary key (id_cliente, telefono),
    foreign key (id_cliente) references cliente (id_cliente) 
);

create table dieccion_cliente(
	id_cliente int not null,
    calle varchar(50) not null,
    num int(3) not null,
	cp int(5) not null,
    primary key (id_cliente, calle),
    foreign key (id_cliente) references cliente (id_cliente) 
);


create table producto(
	cod_producto int primary key auto_increment,
    nombre varchar(15) not null,
    talla varchar(3) not null,
	color varchar(15) not null,
    precio float not null,
    descripcion varchar(250)
);

create table proveedor(
	cif char(9) primary key,
    nombre varchar(25) not null,
    mail varchar(30) not null
);

create table telefono_proveedor(
	cif char(9) not null,
	telefono char(12) not null,
    primary key (cif, telefono),
    foreign key (cif) references proveedor (cif)
);

create table direccion_proveedor(
	cif char(9) not null,
	calle varchar(50) not null,
    num int(3) not null,
    cp int(5) not null,
    primary key (cif, calle),
    foreign key (cif) references proveedor (cif)
);


create table trabajador(
	id_trabajador int primary key auto_increment,
    ss int not null,
    nombre varchar(25) not null,
    ap1 varchar(25) not null,
    ap2 varchar(25) not null
);

create table telefono_trabajador(
	id_trabajador int not null,
    telefono char(12) not null,
    primary key (id_trabajador, telefono),
    foreign key (id_trabajador) references trabajador (id_trabajador)
);

create table direccion_trabajador(
	id_trabajador int not null,
    calle varchar(50) not null,
    num int(3) not null,
    cp int(5) not null,
    primary key (id_trabajador, calle),
    foreign key (id_trabajador) references trabajador (id_trabajador)
);

create table comercial(
	id_comercial int primary key not null,
    foreign key (id_comercial) references trabajador (id_trabajador)
);

create table gerente(
	id_gerente int primary key not null,
    foreign key (id_gerente) references trabajador (id_trabajador)
);

create table dependiente(
	id_dependiente int primary key not null,
    foreign key (id_dependiente) references trabajador (id_trabajador)
);

create table recibe(
	cod_producto int not null,
	id_cliente int not null,
	num_factura int not null,
    primary key (cod_producto, id_cliente),
    foreign key (cod_producto) references producto (cod_producto),
    foreign key (id_cliente) references cliente (id_cliente),
    foreign key (num_factura) references factura (num_factura)
);

create table vende(
	cod_producto int not null,
	id_cliente int not null,
	id_dependiente int not null,
    primary key (cod_producto, id_cliente),
    foreign key (cod_producto) references producto (cod_producto),
    foreign key (id_cliente) references cliente (id_cliente),
    foreign key (id_dependiente) references dependiente (id_dependiente)
);

create table compra(
	cod_producto int not null,
	id_comercial int not null,
	cif char(9) not null,
    primary key (cod_producto, id_comercial),
    foreign key (cod_producto) references producto (cod_producto),
    foreign key (id_comercial) references comercial (id_comercial),
    foreign key (cif) references proveedor (cif)
);

create table contrata(
	id_dependiente int not null,
	id_comercial int not null,
	id_gerente int not null,
    primary key (id_dependiente, id_comercial),
    foreign key (id_dependiente) references dependiente (id_dependiente),
    foreign key (id_comercial) references comercial (id_comercial),
    foreign key (id_gerente) references gerente (id_gerente)
);

-- Inserción de datos:
INSERT INTO trabajador (ss, nombre, ap1, ap2) VALUES 
    (111111111, 'Trabajador 1', 'Perez', 'Garcia'),
    (222222222, 'Trabajador 2', 'Garcia', 'Perez'),
    (333333333, 'Trabajador 3', 'Marinez', 'Gomez'),
    (444444444, 'Trabajador 4', 'Gomez', 'Martinez'),
    (555555555, 'Trabajador 5', 'Martinez', 'Gomez'),
    (666666666, 'Trabajador 6', 'Perez', 'Ortega'),
    (777777777, 'Trabajador 7', 'Boro', 'Jimenez'),
    (888888888, 'Trabajador 8', 'Sanchez', 'Diaz'),
    (999999999, 'Trabajador 9', 'Gomez', 'Martinez'),
    (000000000, 'Trabajador 10', 'Gomez', 'Martinez')
;
INSERT INTO direccion_trabajador VALUES
    (1, 'Calle 1', 1, 11111),
    (2, 'Calle 2', 2, 22222),
    (3, 'Calle 3', 3, 33333),
    (4, 'Calle 4', 4, 44444),
    (5, 'Calle 5', 5, 55555),
    (6, 'Calle 6', 6, 66666),
    (7, 'Calle 7', 7, 77777),
    (8, 'Calle 8', 8, 88888),
    (9, 'Calle 9', 9, 99999),
    (10, 'Calle 10', 10, 00000);
;
INSERT INTO telefono_trabajador VALUES
    (1, '111111111'),
    (2, '222222222'),
    (3, '333333333'),
    (4, '444444444'),
    (5, '555555555'),
    (6, '666666666'),
    (7, '777777777'),
    (8, '888888888'),
    (9, '999999999'),
    (10, '000000000')
;
INSERT INTO comercial VALUES
    (1),
    (2),
    (3);
;
INSERT INTO dependiente VALUES
    (4),
    (5),
    (6);
;
INSERT INTO gerente VALUES
    (7),
    (8),
    (9),
    (10);
;
INSERT INTO contrata VALUES
    
;
INSERT INTO cliente (dni, nombre, ap1, ap2) VALUES
    ('11111111A', 'Juan', 'Perez', 'Garcia'),
    ('22222222B', 'Maria', 'Garcia', 'Perez'),
    ('33333333C', 'Pedro', 'Marinez', 'Gomez'),
    ('44444444D', 'Luis', 'Gomez', 'Martinez'),
    ('55555555E', 'Ana', 'Martinez', 'Gomez'),
    ('66666666F', 'Sara', 'Gomez', 'Martinez'),
    ('77777777G', 'Pablo', 'Gomez', 'Martinez'),
    ('88888888H', 'Sergio', 'Gomez', 'Martinez'),
    ('99999999I', 'Raul', 'Gomez', 'Martinez'),
    ('00000000J', 'Rosa', 'Gomez', 'Martinez');
;
INSERT INTO direccion_cliente VALUES
    (1, 'Calle 1', 1, 11111),
    (2, 'Calle 2', 2, 22222),
    (3, 'Calle 3', 3, 33333),
    (4, 'Calle 4', 4, 44444),
    (5, 'Calle 5', 5, 55555),
    (6, 'Calle 6', 6, 66666),
    (7, 'Calle 7', 7, 77777),
    (8, 'Calle 8', 8, 88888),
    (9, 'Calle 9', 9, 99999),
    (10, 'Calle 10', 10, 00000);
;
INSERT INTO telefono_cliente VALUES
    (1, '111111111'),
    (2, '222222222'),
    (3, '333333333'),
    (4, '444444444'),
    (5, '555555555'),
    (6, '666666666'),
    (7, '777777777'),
    (8, '888888888'),
    (9, '999999999'),
    (10, '000000000')
;
INSERT INTO proveedor VALUES
    ('A11111111', 'Proveedor 1', 'prov1@gmail.com'),
    ('B22222222', 'Proveedor 2', 'prov2@gmail.com'),
    ('C33333333', 'Proveedor 3', 'prov3@gmail.com'),
    ('D44444444', 'Proveedor 4', 'prov4@gmail.com'),
    ('E55555555', 'Proveedor 5', 'prov5@gmail.com'),
    ('F66666666', 'Proveedor 6', 'prov6@gmail.com'),
    ('G77777777', 'Proveedor 7', 'prov7@gmail.com'),
    ('H88888888', 'Proveedor 8', 'prov8@gmail.com'),
    ('I99999999', 'Proveedor 9', 'prov9@gmail.com'),
    ('J00000000', 'Proveedor 10', 'prov10@gmail.com')
;
INSERT INTO direccion_proveedor VALUES
    ('A11111111', 'Calle 1', 1, 11111),
    ('B22222222', 'Calle 2', 2, 22222),
    ('C33333333', 'Calle 3', 3, 33333),
    ('D44444444', 'Calle 4', 4, 44444),
    ('E55555555', 'Calle 5', 5, 55555),
    ('F66666666', 'Calle 6', 6, 66666),
    ('G77777777', 'Calle 7', 7, 77777),
    ('H88888888', 'Calle 8', 8, 88888),
    ('I99999999', 'Calle 9', 9, 99999),
    ('J00000000', 'Calle 10', 10, 00000);
;
INSERT INTO telefono_proveedor VALUES
    ('A11111111', '111111111'),
    ('B22222222', '222222222'),
    ('C33333333', '333333333'),
    ('D44444444', '444444444'),
    ('E55555555', '555555555'),
    ('F66666666', '666666666'),
    ('G77777777', '777777777'),
    ('H88888888', '888888888'),
    ('I99999999', '999999999'),
    ('J00000000', '000000000')
;
INSERT INTO producto (nombre, talla, color, precio, descripcion) VALUES
    ('camiseta', 'm', 'azul',15.50, 'camiseta mediana hombre azul'),
    ('camiseta', 's', 'roja', 15.50, 'camiseta pequeña hombre roja'),
    ('camiseta', 'l', 'verde', 15.50, 'camiseta grande hombre verde'),
    ('camiseta', 'xl', 'amarilla', 15.50, 'camiseta extra grande hombre amarilla'),
    ('camiseta', 'xxl', 'negra', 15.50, 'camiseta extra extra grande hombre negra'),
    ('camiseta', 'm', 'azul', 15.50, 'camiseta mediana mujer azul'),
    ('camiseta', 's', 'roja', 15.50, 'camiseta pequeña mujer roja'),
    ('camiseta', 'l', 'verde', 15.50, 'camiseta grande mujer verde'),
    ('camiseta', 'xl', 'amarilla', 15.50, 'camiseta extra grande mujer amarilla'),
    ('camiseta', 'xxl', 'negra', 15.50, 'camiseta extra extra grande mujer negra');
;
INSERT INTO compra VALUES
    (1, 1, 'A11111111'),
    (2, 2, 'B22222222'),
    (3, 3, 'C33333333'),
    (4, 1, 'D44444444'),
    (5, 2, 'E55555555'),
    (6, 3, 'F66666666'),
    (7, 1, 'G77777777'),
    (8, 2, 'H88888888'),
    (9, 3, 'I99999999'),
    (10, 1, 'J00000000')
;
INSERT INTO vende VALUES
    (1, 1, 4),
    (2, 2, 5),
    (3, 3, 6),
    (4, 4, 4),
    (5, 5, 5),
    (6, 6, 6),
    (7, 7, 4),
    (8, 8, 5),
    (9, 9, 6),
    (10, 10, 4)
;
INSERT INTO factura (cantidad, total, fecha, dto) VALUES
    (2, 100, '2019-01-01', 0.1),
    (1, 50, '2019-01-02', 0.2),
    (3, 150, '2019-01-03', 0.3),
    (4, 200, '2019-01-04', 0.4),
    (5, 250, '2019-01-05', 0.5),
    (6, 300, '2019-01-06', 0.6),
    (7, 350, '2019-01-07', 0.7),
    (8, 400, '2019-01-08', 0.8),
    (9, 450, '2019-01-09', 0.9),
    (10, 500, '2019-01-10', 0.10);
;
INSERT INTO recibe VALUES
    (1, 1, 1),
    (2, 2, 2),
    (3, 3, 3),
    (4, 4, 4),
    (5, 5, 5),
    (6, 6, 6),
    (7, 7, 7),
    (8, 8, 8),
    (9, 9, 9),
    (10, 10, 10)
;