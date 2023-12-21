CREATE DATABASE richard;
USE richard;

CREATE TABLE facultad (
  cod_facultad INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (cod_facultad)
);

CREATE TABLE decano (
  dni CHAR(9) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  ap1 VARCHAR(45) NOT NULL,
  ap2 VARCHAR(45),
  cod_facultad INT NOT NULL,
  PRIMARY KEY (dni),
  FOREIGN KEY (cod_facultad) REFERENCES facultad(cod_facultad)
);

CREATE TABLE docente (
  dni CHAR(9) NOT NULL,
  nombre VARCHAR(45) NOT NULL,
  ap1 VARCHAR(45) NOT NULL,
  ap2 VARCHAR(45),
  PRIMARY KEY (dni),
  cod_facultad INT NOT NULL,
  FOREIGN KEY (cod_facultad) REFERENCES facultad(cod_facultad)
);

CREATE TABLE asignatura (
  cod_asig INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  PRIMARY KEY (cod_asig)
);

CREATE TABLE imparte (
  dni_docente CHAR(9) NOT NULL,
  cod_asig INT NOT NULL,
  PRIMARY KEY (dni_docente, cod_asig),
  FOREIGN KEY (dni_docente) REFERENCES docente(dni),
  FOREIGN KEY (cod_asig) REFERENCES asignatura(cod_asig)
);