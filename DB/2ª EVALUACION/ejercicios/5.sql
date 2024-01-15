create database if not exists balneario;
use balneario;
create table balneario(
	id_balneario smallint auto_increment primary key,
	nombre varchar(60) not null
);
create table tratamiento(
	id_tratamiento smallint auto_increment primary key,
	nombre varchar(60) not null
);

create table terapeuta(
	id_terapeuta smallint auto_increment primary key,
    nombre varchar(60) not null
);

create table oferta(
	id_balneario smallint not null,
    id_tratamiento smallint not null,
    id_terapeuta smallint not null,
    coste decimal (6, 2) not null,
    primary key (id_balneario, id_tratamiento, id_terapeuta),
    foreign key (id_balneario) references balneario (id_balneario),
    foreign key (id_tratamiento) references tratamiento (id_tratamiento),
	foreign key (id_terapeuta) references terapeuta (id_terapeuta)
);

CREATE USER 'richard'@'localhost' IDENTIFIED WITH mysql_native_password BY '1234';
FLUSH PRIVILEGES;

use instituto;
CREATE TABLE IF NOT EXISTS profesores (
  dni INT PRIMARY key,
  nombre VARCHAR(45) UNIQUE NOT NULL,
  direccion VARCHAR(45) NOT NULL
);

CREATE TABLE IF NOT EXISTS alumnos (
  id_alumno INT PRIMARY key AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  edad INT NOT NULL,
  foreign key (nombre) REFERENCES profesores(nombre)
);
