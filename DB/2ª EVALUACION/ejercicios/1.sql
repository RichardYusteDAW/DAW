create database if not exists balneario;
use balneario;
create table balneario(
	id_balneario int auto_increment primary key,
	nombre varchar(60) not null
);
create table tratamiento(
	id_tratamiento int auto_increment primary key,
    id_balneario int not null,
	nombre varchar(60) not null,
    coste decimal (6, 2) not null,
    foreign key (id_balneario) references balneario(id_balneario)
);

