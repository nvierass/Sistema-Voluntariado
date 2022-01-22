CREATE DATABASE "BD_TBD"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

\c BD_TBD

--Drops previos en caso de existir tablas*/

DROP TABLE IF EXISTS "Institucion";
DROP TABLE IF EXISTS "Ranking";
DROP TABLE IF EXISTS "Voluntario";
DROP TABLE IF EXISTS "Voluntario_Habilidad";
DROP TABLE IF EXISTS "Emergencia";
DROP TABLE IF EXISTS "Emergencia_Habilidad";
DROP TABLE IF EXISTS "Habilidad";
DROP TABLE IF EXISTS "Tarea_Habilidad";
DROP TABLE IF EXISTS "Tarea";


create table "Institucion" (
	id_institucion serial PRIMARY KEY,
	nombre varchar(32) unique not null,
	descripcion varchar(256) not null
);

create table "Ranking" (
	id_ranking serial primary key,
	id_voluntario int not null,
	id_tarea int not null,
	puntaje int not null,
	inscrito boolean not null,
	aceptado boolean not null
);

create table "Voluntario" (
	id_voluntario serial primary key,
	rut varchar(16) not null UNIQUE,
	nombre varchar(64) not null,
	region varchar(32) not null,
	ciudad varchar(32) not null,
	telefono_contacto varchar(16) not null UNIQUE,
	fecha_nacimiento DATE not null,
	correo varchar(64) not null UNIQUE,
	disponibilidad_lunes boolean,
	disponibilidad_martes boolean,
	disponibilidad_miercoles boolean,
	disponibilidad_jueves boolean,
	disponibilidad_viernes boolean,
	disponibilidad_sabado boolean,
	disponibilidad_domingo boolean
);

create table "Voluntario_Habilidad" (
	id_voluntario_habilidad serial primary key,
	id_voluntario int not null,
	id_habilidad int not null
);
create table "Emergencia" (
	id_emergencia serial primary key,
	institucion_encargada int not null,
	nombre_emergencia varchar(32) not null,
	estado_emergencia varchar(32) not null,
	descripcion varchar(256) not null,
	nombre_coordinador varchar(64) not null,
	rut_coordinador varchar(16) not null,
	correo_coordinador varchar(64) not null,
	region varchar(32) not null,
    ciudad varchar(32) not null
);
create table "Emergencia_Habilidad" (
	id_emergencia_habilidad serial primary key,
	id_emergencia int not null,
	id_habilidad int not null
);


create table "Habilidad" (
	id_habilidad serial primary key,
	criterio varchar(128) not null
);

create table "Tarea_Habilidad" (
	id_tarea_habilidad serial primary key,
	id_tarea int not null,
	id_habilidad int not null
);

create table "Tarea" (
	id_tarea serial primary key,
	nombre varchar(32) not null,
	emergencia int not null,
	estado_tarea varchar(32) not null,
	descripcion varchar(128) not null,
	voluntarios_requeridos int not null
);


CREATE OR REPLACE FUNCTION edad(fecha_nacimiento date)
RETURNS integer AS $$
BEGIN
IF date_part('month',current_date) - date_part('month',fecha_nacimiento) > 0 then 
	return date_part('year',current_date) - date_part('year',fecha_nacimiento);
ELSEIF date_part('month',current_date) - date_part('month',fecha_nacimiento) < 0 then
	return date_part('year',current_date) - date_part('year',fecha_nacimiento) - 1; 
ELSEIF date_part('month',current_date) - date_part('month',fecha_nacimiento) = 0 and date_part('day',current_date) - date_part('day',fecha_nacimiento) > -1 then
	return date_part('year',current_date) - date_part('year',fecha_nacimiento);
ELSE 
	return date_part('year',current_date) - date_part('year',fecha_nacimiento) - 1;
END IF;
END; $$
LANGUAGE PLPGSQL;


--Procedimiento Almacenado*/

CREATE OR REPLACE PROCEDURE calcular_ranking(id_tareas int)
LANGUAGE SQL
AS $$
Delete from "Ranking" where id_tarea = id_tareas;
INSERT into "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) 
SELECT T.id_voluntario,id_tareas,T.puntaje,false,false FROM (select id_voluntario,count(*) as puntaje 
from "Voluntario_Habilidad" as VH 
inner join "Tarea_Habilidad" as TH on VH.id_habilidad = TH.id_habilidad 
where id_tarea = id_tareas
group by id_voluntario) T;
$$;


--ALTER TABLE "Ranking" ADD CONSTRAINT FK_Ranking_ID_Voluntario FOREIGN KEY (id_voluntario) REFERENCES "Voluntario"(id_voluntario);
--ALTER TABLE "Ranking" ADD CONSTRAINT FK_Ranking_ID_Tarea FOREIGN KEY (id_tarea) REFERENCES "Tarea"(id_tarea);
--ALTER TABLE "Emergencia" ADD CONSTRAINT FK_Emergencia_ID_Institucion FOREIGN KEY (institucion_encargada) REFERENCES "Institucion"(id_institucion);
--ALTER TABLE "Voluntario_Habilidad" ADD CONSTRAINT FK_Voluntario_Habilidad_ID_Voluntario FOREIGN KEY (id_voluntario) REFERENCES "Voluntario"(id_voluntario);
--ALTER TABLE "Voluntario_Habilidad" ADD CONSTRAINT FK_Voluntario_Habilidad_ID_Habilidad FOREIGN KEY (id_habilidad) REFERENCES "Habilidad"(id_habilidad);
--ALTER TABLE "Emergencia_Habilidad" ADD CONSTRAINT FK_Emergencia_Habilidad_ID_Emergencia FOREIGN KEY (id_emergencia) REFERENCES "Emergencia"(id_emergencia);
--ALTER TABLE "Emergencia_Habilidad" ADD CONSTRAINT FK_Emergencia_Habilidad_ID_Habilidad FOREIGN KEY (id_habilidad) REFERENCES "Habilidad"(id_habilidad);
--ALTER TABLE "Tarea_Habilidad" ADD CONSTRAINT FK_Tarea_Habilidad_ID_Tarea FOREIGN KEY (id_tarea) REFERENCES "Tarea"(id_tarea);
--ALTER TABLE "Tarea_Habilidad" ADD CONSTRAINT FK_Tarea_Habilidad_ID_Habilidad FOREIGN KEY (id_habilidad) REFERENCES "Habilidad"(id_habilidad);
