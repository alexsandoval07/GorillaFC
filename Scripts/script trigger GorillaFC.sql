use gorillafc;

#Triggers base de datos GorillaFC

#Trigger para actualizar escenarios deportivos
DELIMITER $$
CREATE trigger actualizar_escenario_deportivo
after update on escenario_deportivo
for each row begin
 if new.id_escenario <> old.id_escenario then
        update horarios set escenario_deportivo = new.id_escenario
        where escenario_deportivo.id_escenario = new.id_escenario;
end if;
END;
$$

#Trigger para eliminar escenarios deportivos
DELIMITER $$
create trigger eliminar_escenario_deportivo
after delete on escenario_deportivo
for each row begin
    delete from horarios where horarios.escenario_deportivo = old.id_escenario;
END ;
$$

#Trigger para actualizar categoria
DELIMITER $$
create trigger actualizar_categoria
after update on categoria
for each row begin
if new.codigo_categoria <> old.codigo_categoria then
    update horarios set categoria = new.codigo_categoria
    where categoria.codigo_categoria = new.codigo_categoria;
    update patrocinios set codigo_categoria = new.codigo_categoria
    where categoria.codigo_categoria = new.codigo_categoria;
    update tipo_empleado set codigo_categoria = new.codigo_categoria
    where categoria.codigo_categoria = new.codigo_categoria;
    update torneos_jugados set codigo_categoria = new.codigo_categoria
    where categoria.codigo_categoria = new.codigo_categoria;
    update deportistas set categoria = new.codigo_categoria
    where categoria.codigo_categoria = new.codigo_categoria;
end if;
END;
$$

#Trigger para eliminar categoria
DELIMITER $$
create trigger eliminar_categoria
after delete on categoria
for each row begin
	delete from horarios where horarios.categoria = old.codigo_categoria;
    delete from patrocinios where patrocinios.codigo_categoria = old.codigo_categoria;
    delete from tipo_empleado where tipo_empleado.codigo_categoria = old.codigo_categoria;
	delete from torneos_jugados where torneos_jugados.codigo_categoria = old.codigo_categoria;
	delete from deportistas where deportistas.categoria = old.codigo_categoria;
end;
$$

#Trigger para actualizar  Empleado
DELIMITER $$
create trigger actualizar_empleado
after update on empleados
for each row begin
if new.codigo_empleado <> old.codigo_empleado then 
	update salario_empleado set codigo_empleado = new.codigo_empleado
    where empleados.codigo_empleado = new.codigo_empleado;
    update tipo_empleado set codigo_empleado = new.codigo_empleado
    where empleados.codigo_empleado = new.codigo_empleado;
end if;
end;
$$

#Trigger para eliminar Empleado
DELIMITER $$
create trigger eliminar_empleado 
after delete on empleados
for each row begin
	delete from salario_empleado where salario_empleado.codigo_empleado = old.codigo_empleado;
    delete from tipo_empleado where tipo_empleado.codigo_empleado = old.codigo_empleado;
end;
$$

#Trigger para actualizar Patrocinador
DELIMITER $$
create trigger actualizar_patrocinador
after update on patrocinador
for each row begin
if new.id_patrocinador <> old.id_patrocinador then
	update patrocinios set id_patrocinador = new.id_patrocinador
    where patrocinador.id_patrocinador = new.id_patrocinador;
end if;
end;
$$

#Trigger para eliminar patrocinador
DELIMITER $$
create trigger eliminar_patrocinador
after delete on patrocinador
for each row begin
	delete from patrocinios where patrocinios.id_patrocinador=old.id_patrocinador;
end;
$$

#Trigger para actualizar Deportistas
DELIMITER $$
create trigger actualizar_deportista
after update on deportistas
for each row begin
if new.codigo_deportista <> old.codigo_deportista then
	update mensualidades set deportista = new.codigo_deportista
    where deportistas.codigo_deportista = new.codigo_deportista;
    update jugador_profesional set deportista = new.codigo_deportista
    where deportistas.codigo_deportista = new.codigo_deportista;
    update estadisticas_jugadores set deportista = new.codigo_deportista
    where deportistas.codigo_deportista = new.codigo_deportista;
end if;
end;
$$

#Trigger para eliminar deportistas
DELIMITER $$
create trigger eliminar_deportistas
after delete on deportistas
for each row begin
	delete from mensualidades where mensualidades.deportista=old.codigo_deportista;
    delete from jugador_profesional where jugador_profesional.deportista=old.codigo_deportista;
    delete from estadisticas_jugadores where estadisticas_jugadores.deportista=old.codigo_deportista;
end;
$$

#Trigger para actualizar Ojeador
DELIMITER $$
create trigger actualizar_ojeador
after update on ojeador
for each row begin
if new.id_ojeador <> old.id_ojeador then
	update convenios set ojeador = new.id_ojeador
    where ojeador.id_ojeador = new.id_ojeador;
end if;
end;
$$

#Trigger para eliminar ojeador
DELIMITER $$
create trigger eliminar_ojeador
after delete on ojeador
for each row begin
	delete from convenios where convenios.ojeador = old.id_ojeador;
end;
$$

#Trigger para actualizar torneos
DELIMITER $$
create trigger actualizar_torneos
after update on torneos
for each row begin
if new.codigo_torneo <> old.codigo_torneo then 
	update torneos_jugados set codigo_torneo = new.codigo_torneo
    where torneos.codigo_torneo = new.codigo_torneo;
end if;
end;
$$

##Trigger para eliminar torneos
DELIMITER $$
create trigger eliminar_torneos
after delete on torneos
for each row begin
	delete from torneos_jugados where torneos_jugados.codigo_torneo = old.codigo_torneo;
end;
$$


