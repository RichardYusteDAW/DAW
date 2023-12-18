create database if not exists instituto;
use instituto;
create table alumno(
	id_alumno smallint auto_increment primary key,
	nombre varchar(60) not null
);
create table expediente(
	id_expediente smallint auto_increment primary key,
    id_alumno smallint not null,
	pdf mediumtext,
    foreign key (id_alumno) references alumno(id_alumno)
);