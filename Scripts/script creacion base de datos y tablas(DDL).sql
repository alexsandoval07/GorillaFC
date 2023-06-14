create database gorillafc;
use gorillafc;

create table escenario_deportivo(
id_escenario int not null,
nombre varchar(45),
ubicacion varchar(45),
tipo_escenario varchar(45),

primary key(id_escenario)
);

create table categoria(
codigo_categoria int not null,
nombre_categoria varchar(45),

primary key(codigo_categoria)
);

create table horarios(
codigo_horario int not null,
categoria int,
dia varchar(45),
hora_inicio varchar(45),
hora_finalizacion varchar(45),
escenario_deportivo int,

primary key(codigo_horario),
constraint categoria_codigo_categoria_fk1 foreign key(categoria) references categoria(codigo_categoria),
constraint escenario_escenario_deportivo_fk2 foreign key(escenario_deportivo) references escenario_deportivo(id_escenario)
);

create table empleados(
codigo_empleado int not null,
nombre_empleado varchar(45),
fecha_nacimiento date,
direccion varchar(45),
telefono varchar(45),
id_empleado int,

primary key(codigo_empleado)
);

create table salario_empleado(
numero_factura int not null,
valor double,
fecha_pago date,
codigo_empleado int,

constraint salario_empleado_fk1 foreign key (codigo_empleado) references empleados(codigo_empleado)
);

create table tipo_empleado(
codigo_tipo_empleado int not null,
codigo_empleado int not null,
codigo_categoria int not null,
tipo_empleado varchar(45),

primary key (codigo_tipo_empleado),

constraint empleado_categoria_fk1 foreign key (codigo_empleado) references empleados(codigo_empleado),
constraint categoria_empleado_fk2 foreign key (codigo_categoria) references categoria(codigo_categoria)
);

create table patrocinador(
id_patrocinador int not null,
nombre varchar(45),

primary key (id_patrocinador)
);

create table patrocinios(
id_patrocinio int not null,
codigo_categoria int,
id_patrocinador int,
fecha_patrocinio date,
valor double,

primary key (id_patrocinio),
constraint patrocinio_categoria_fk1 foreign key (codigo_categoria) references categoria(codigo_categoria),
constraint patracinio_patrocinador_fk2 foreign key (id_patrocinador) references patrocinador(id_patrocinador)
);

create table representante_legal(
id_padre int not null,
nombre varchar(45),
telefono varchar(45),

primary key (id_padre)
);

create table deportistas(
codigo_deportista int not null,
id_deportista int,
nombre varchar(45),
fecha_nacimineto date,
direccion varchar(45),
telefono varchar(45),
altura varchar(45),
peso varchar (45),
dorsal varchar (45),
eps varchar (45),
categoria int,
representante_legal int,

primary key (codigo_deportista),
constraint deportista_categoria_fk1 foreign key (codigo_deportista) references categoria(codigo_categoria),
constraint padre_deportisat_fk2 foreign key (representante_legal) references representante_legal(id_padre)
);

create table mensualidades(
numero_factura int not null,
fecha_pago date,
valor double,
deportista int,

primary key (numero_factura),
constraint mensualidad_deportista_fk1 foreign key (deportista) references deportistas(codigo_deportista)
);

create table jugador_profesional(
deportista int not null,
club_profesional varchar(45),
valor_fichaje double,
comision_escuela double,

primary key (deportista),
constraint jugador_profesional_fk1 foreign key (deportista) references deportistas(codigo_deportista)
);

create table estadisticas_jugadores(
deportista int not null,
numero_pj int,
numero_amarillas int,
numero_rojas int,
numero_asistencias int,
numero_goles int,

primary key(deportista),
constraint estadisticas_jugadores_fk1 foreign key (deportista) references deportistas(codigo_deportista)
);

create table ojeador(
id_ojeador int not null,
nombre varchar(45),

primary key (id_ojeador)
);

create table convenios(
codigo_club int not null,
club_profesional varchar(45),
ojeador int,

primary key (codigo_club),
constraint convenio_ojeador_fk1 foreign key(ojeador) references ojeador(id_ojeador)
);

create table torneos(
codigo_torneo int not null,
nombre varchar(45),
lugar varchar(45),
club_convenio int,

primary key (codigo_torneo),
constraint convenio_torneo_fk1 foreign key(club_convenio) references convenios(codigo_club)
);

create table torneos_jugados(
codigo_categoria int,
codigo_torneo int,
valor_inscripcion double,
valor_viaje double,
valor_sanciones double,
valor_ganancias double,
fecha date,

primary key (codigo_categoria),
constraint categoria_torneo1_fk1 foreign key(codigo_categoria) references categoria(codigo_categoria),
constraint torneo_categori_fk2 foreign key(codigo_torneo) references torneos(codigo_torneo)
);













