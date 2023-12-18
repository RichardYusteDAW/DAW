create database if not exists instituto;
use instituto;
create table alumno(
	id_alumno smallint auto_increment primary key,
	nombre varchar(60) not null
);
create table expediente(
	numero smallint auto_increment not null,
    id_alumno smallint not null,
	pdf mediumtext,
    primary key (numero, id_alumno),
    foreign key (id_alumno) references alumno(id_alumno)
);