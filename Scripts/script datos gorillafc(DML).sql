use gorillafc;

#Insertar datos en la tabla Categoria
insert into categoria values(100,"Benjamines");
insert into categoria values (101,"Cebollitas");
insert into categoria values (102,"Mostoles");
insert into categoria values (103,"Sub-10");
insert into categoria values (104,"Sub-14");
insert into categoria values (105,"Sub-17");
insert into categoria values (106,"Sub-20");

select*from categoria;

#Insertar datos en la tabla Escenario deportivo
insert into escenario_deportivo values(100,"Atanasio Girardot","Cra. 74 #48010","Estadio");
insert into escenario_deportivo values(102,"Santiago Bernabeu","An. de Concha Espina","Estadio");
insert into escenario_deportivo values(103,"Olimpus Gym","Calle 10 #20-31","Gimnasio");

select*from escenario_deportivo;

#Insertar datos en la tabla Horarios
insert into horarios values(100,100,"Martes y Viernes","2:00 pm","4:00 pm",100);
insert into horarios values(101,101,"Martes y Viernes","2:00 pm","4:00 pm",100);
insert into horarios values(102,102,"Martes y Viernes","4:00 pm","6:00 pm",100);
insert into horarios values(103,103,"Martes y Viernes","4:00 pm","6:00 pm",100);
insert into horarios values(104,104,"Lunes y Miercoles","2:00 pm","5:00 pm",100);
insert into horarios values(105,105,"Lunes, Miercoles y Jueves","5:00 pm","8:00 pm",102);
insert into horarios values(106,106,"Lunes, Miercoles y Jueves","5:00 pm","8:00 pm",102);
insert into horarios values(107,106,"Sabado","7:00 am","11:00 am",103);

select*from horarios;

#Insertar datos en la tabla Empleados
insert into empleados values(100,"Raul Gonzales","1980-05-23","Calle 15 #12","3210054789","1001");
insert into empleados values(101,"Xavi Alonso","1982-11-11","Calle 23 #22","3210054777","1002");
insert into empleados values(102,"Paulo Autori","1965-02-14","Calle 12 #12","3210058889","1003");
insert into empleados values(103,"Julian Lopetegui","1975-12-23","Calle 87 #13","3210054555","1004");
insert into empleados values(104,"Jose Mourinho","1979-11-07","Calle 26 #5","3210059999","1005");
insert into empleados values(105,"Zinedine Zidane","1979-05-17","Calle 7 #12","3210444449","1006");
insert into empleados values(106,"Carlo Ancelotti","1969-07-10","Calle 18 #77","3210777779","1007");
insert into empleados values(107,"Antonio Pintus","1985-04-14","Calle 25 #99","3210012459","1008");

select*from empleados;

#Inserta datos en la tabla Salario Empleado
insert into salario_empleado values(100,"1500000","2023-05-25",100);
insert into salario_empleado values(101,"1500000","2023-05-25",101);
insert into salario_empleado values(102,"1500000","2023-05-25",102);
insert into salario_empleado values(103,"1500000","2023-05-25",103);
insert into salario_empleado values(104,"1500000","2023-05-25",104);
insert into salario_empleado values(105,"1500000","2023-05-25",105);
insert into salario_empleado values(106,"1500000","2023-05-25",106);
insert into salario_empleado values(107,"1500000","2023-05-25",107);

select*from salario_empleado;

#Insertar datos en la tabla Tipo empleado
insert into tipo_empleado values(100,100,100,"Entrenador");
insert into tipo_empleado values(101,101,101,"Entrenador");
insert into tipo_empleado values(102,102,102,"Entrenador");
insert into tipo_empleado values(103,103,103,"Entrenador");
insert into tipo_empleado values(104,104,104,"Entrenador");
insert into tipo_empleado values(105,105,105,"Entrenador");
insert into tipo_empleado values(106,106,106,"Entrenador");
insert into tipo_empleado values(107,107,105,"Fisioterapeuta");
insert into tipo_empleado values(108,107,106,"Fisioterapeuta");

select*from tipo_empleado;

#Insertar datos en la tabla Patrocinador
insert into patrocinador values(100,"Salud y Vigor");
insert into patrocinador values(101,"Adidas");

select*from patrocinador;

#Insertar datos en la tabla Patrocinios
insert into patrocinios values(100,103,100,"2023-04-10","1000000");
insert into patrocinios values(101,104,100,"2023-04-10","1000000");
insert into patrocinios values(102,105,101,"2023-04-15","1100000");
insert into patrocinios values(104,106,101,"2023-04-15","1100000");

select*from patrocinios;

#Insertar datos en la tabla Representante Legal
insert into representante_legal values(2001,"Carlos Asensio","3005558888");
insert into representante_legal values(2002,"Antonio Alaba","3005558887");
insert into representante_legal values(2003,"David Casillas","3005558886");
insert into representante_legal values(2004,"Andres Militao","3005558844");
insert into representante_legal values(2005,"Rene Ramos","3005558555");
insert into representante_legal values(2006,"Mohamed Benzema","3005556668");
insert into representante_legal values(2007,"Dolores Aveiro","3005557777");

select*from representante_legal;

#Insertar datos en la tabla Deportistas
insert into deportistas values(100,"1100","Marco Asensio","2019-05-11","Calle 2 #1","3220005588","0.65 m","32 kg","11","Avanzar Fox",100,2001);
insert into deportistas values(101,"1101","David Alaba","2017-11-04","Calle 3 #1","3220066688","0.78 m","43 kg","4","Avanzar Fox",101,2002);
insert into deportistas values(102,"1102","Iker Casillas","2015-04-20","Calle 4 #1","3220005111","1.06 m","49 kg","1","Avanzar Fox",102,2003);
insert into deportistas values(103,"1103","Eder Militao","2014-01-06","Calle 5 #1","3223335588","1.12 m","52 kg","3","Avanzar Fox",103,2004);
insert into deportistas values(104,"1104","Sergio Ramos","2010-06-04","Calle 6 #1","3220005444","1.52 m","60 kg","4","Avanzar Fox",104,2005);
insert into deportistas values(105,"1105","Karim Benzema","2007-05-09","Calle 9 #1","3220005999","1.81 m","80 kg","9","Avanzar Fox",105,2006);
insert into deportistas values(106,"1107","Cristiano Ronaldo","2004-02-05","Calle 7 #1","3220005777","1.89 m","85 kg","7","Avanzar Fox",106,2007);

select*from deportistas;

#Insertar datos en la tabla Mensualidades
insert into mensualidades values(100,"2023-05-15","50000",100);
insert into mensualidades values(101,"2023-05-15","50000",101);
insert into mensualidades values(102,"2023-05-15","50000",102);
insert into mensualidades values(103,"2023-05-15","50000",103);
insert into mensualidades values(104,"2023-05-15","50000",104);
insert into mensualidades values(105,"2023-05-15","50000",105);
insert into mensualidades values(106,"2023-05-15","50000",106);

select*from mensualidades;

#Insertar datos en la tabla Jugador profesional
insert into jugador_profesional values(105,"Real Madrid CF","100000000","5000000");
insert into jugador_profesional values(106,"Real Madrid CF","100000000","5000000");

select*from jugador_profesional;

#Insertar datos en la tabla Estadisticas jugadores
insert into estadisticas_jugadores values(100,2,1,0,1,2);
insert into estadisticas_jugadores values(101,2,0,0,1,1);
insert into estadisticas_jugadores values(102,2,0,0,0,0);
insert into estadisticas_jugadores values(103,2,1,1,0,0);
insert into estadisticas_jugadores values(104,2,1,0,0,2);
insert into estadisticas_jugadores values(105,2,1,0,1,3);
insert into estadisticas_jugadores values(106,2,0,0,2,7);

select*from estadisticas_jugadores;

#Insertar datos en la tabla ojeador
insert into ojeador values(301,"Emilio Butragueño");
insert into ojeador values(302,"Rene Higuita");

select*from ojeador;

#Instertar datos en la tabla Convenios
insert into convenios values(100,"Real Madrid CF",301);
insert into convenios values(101,"Atletico Nacional ",302);

select*from convenios;

#Insertar datos en la tabla Torneos
insert into torneos values(100,"Yogursito","Bucaramanga",100);
insert into torneos values(101,"Pony Futbol","Medellin",101);

select*from torneos;

#Insertar datos en la tabla Torneos Jugados
insert into torneos_jugados values(104,100,"200000","350000","50000","1000000","2023-04-25");
insert into torneos_jugados values(105,101,"300000","250000","20000","2000000","2023-04-20");
insert into torneos_jugados values(106,101,"300000","250000","50000","1500000","2023-04-20");

select*from torneos_jugados;

#min max
select min(codigo_empleado) from empleados;
select max(codigo_deportista) from deportista;
select min(numero_factura) from salario_empleado;
select min(id_representante_legal) from representante_legal;

#like
select*from deportista where nombre like 'C%';
select*from deportista where id_deportista like '1%';
select*from empleados where nombre_empleado like 'O%';
select*from torneos where lugar like 'M%';

#in
select*from estadisticas_jugadores where numero_rojas in (0,2);
select*from horarios where categoria in("104","105");

#Between
select fecha_nacimineto from empleados where fecha_nacimineto between "1995-01-01" and "2000-01-01";

#Inner join
select deportistas.nombre,representante_legal.nombre from deportistas
 inner join representante_legal on representante_legal.id_padre=deportistas.representante_legal;
 select categoria.nombre_categoria, horarios.dia from categoria
 inner join horarios on categoria.codigo_categoria = horarios.categoria;
 
 







