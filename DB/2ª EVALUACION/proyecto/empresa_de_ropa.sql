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
INSERT INTO cliente VALUES
    (1, '11111111A', 'Juan', 'Perez', 'Garcia'),
    (2, '22222222B', 'Maria', 'Garcia', 'Perez'),
    (3, '33333333C', 'Pedro', 'Marinez', 'Gomez'),
    (4, '44444444D', 'Luis', 'Gomez', 'Martinez'),
    (5, '55555555E', 'Ana', 'Martinez', 'Gomez'),
    (6, '66666666F', 'Sara', 'Gomez', 'Martinez'),
    (7, '77777777G', 'Pablo', 'Gomez', 'Martinez'),
    (8, '88888888H', 'Sergio', 'Gomez', 'Martinez'),
    (9, '99999999I', 'Raul', 'Gomez', 'Martinez'),
    (10, '00000000J', 'Rosa', 'Gomez', 'Martinez');
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
INSERT INTO trabajador VALUES
    (1, 111111111, 'Trabajador 1', 'Perez', 'Garcia'),
    (2, 222222222, 'Trabajador 2', 'Garcia', 'Perez'),
    (3, 333333333, 'Trabajador 3', 'Marinez', 'Gomez'),
    (4, 444444444, 'Trabajador 4', 'Gomez', 'Martinez'),
    (5, 555555555, 'Trabajador 5', 'Martinez', 'Gomez'),
    (6, 666666666, 'Trabajador 6', 'Gomez', 'Martinez'),
    (7, 777777777, 'Trabajador 7', 'Gomez', 'Martinez'),
    (8, 888888888, 'Trabajador 8', 'Gomez', 'Martinez'),
    (9, 999999999, 'Trabajador 9', 'Gomez', 'Martinez'),
    (10, 000000000, 'Trabajador 10', 'Gomez', 'Martinez')
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
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);
;
INSERT INTO dependiente VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);
;
INSERT INTO gerente VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);
;
INSERT INTO contrata VALUES
    
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
INSERT INTO producto VALUES
    (111, 'camiseta', 'm', 'azul',15.50, 'camiseta mediana hombre azul'),
    (222, 'camiseta', 's', 'roja', 15.50, 'camiseta pequeña hombre roja'),
    (333, 'camiseta', 'l', 'verde', 15.50, 'camiseta grande hombre verde'),
    (444, 'camiseta', 'xl', 'amarilla', 15.50, 'camiseta extra grande hombre amarilla'),
    (555, 'camiseta', 'xxl', 'negra', 15.50, 'camiseta extra extra grande hombre negra'),
    (666, 'camiseta', 'm', 'azul', 15.50, 'camiseta mediana mujer azul'),
    (777, 'camiseta', 's', 'roja', 15.50, 'camiseta pequeña mujer roja'),
    (888, 'camiseta', 'l', 'verde', 15.50, 'camiseta grande mujer verde'),
    (999, 'camiseta', 'xl', 'amarilla', 15.50, 'camiseta extra grande mujer amarilla'),
    (1010, 'camiseta', 'xxl', 'negra', 15.50, 'camiseta extra extra grande mujer negra');
;
INSERT INTO compra VALUES
    (1, 1, 'A11111111'),
    (2, 2, 'B22222222'),
    (3, 3, 'C33333333'),
    (4, 4, 'D44444444'),
    (5, 5, 'E55555555'),
    (6, 6, 'F66666666'),
    (7, 7, 'G77777777'),
    (8, 8, 'H88888888'),
    (9, 9, 'I99999999'),
    (10, 10, 'J00000000')
;
INSERT INTO vende VALUES
    (111, 1, 1),
    (222, 2, 2),
    (333, 3, 3),
    (444, 4, 4),
    (555, 5, 5),
    (666, 6, 6),
    (777, 7, 7),
    (888, 8, 8),
    (999, 9, 9),
    (1010, 10, 10)
;
INSERT INTO factura VALUES
    (1, 2, 100, '2019-01-01', 0.1),
    (2, 1, 50, '2019-01-02', 0.2),
    (3, 3, 150, '2019-01-03', 0.3),
    (4, 4, 200, '2019-01-04', 0.4),
    (5, 5, 250, '2019-01-05', 0.5),
    (6, 6, 300, '2019-01-06', 0.6),
    (7, 7, 350, '2019-01-07', 0.7),
    (8, 8, 400, '2019-01-08', 0.8),
    (9, 9, 450, '2019-01-09', 0.9),
    (10, 10, 500, '2019-01-10', 0.10);
;
INSERT INTO recibe VALUES
    (111, 1, 1),
    (222, 2, 2),
    (333, 3, 3),
    (444, 4, 4),
    (555, 5, 5),
    (666, 6, 6),
    (777, 7, 7),
    (888, 8, 8),
    (999, 9, 9),
    (1010, 10, 10)
;