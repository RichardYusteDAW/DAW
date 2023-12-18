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

create table oferta(
	id_balneario smallint not null,
    id_tratamiento smallint not null,
    coste decimal (6, 2) not null,
    primary key (id_balneario, id_tratamiento),
    foreign key (id_balneario) references balneario (id_balneario),
    foreign key (id_tratamiento) references tratamiento (id_tratamiento)
);
