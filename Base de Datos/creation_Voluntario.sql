CREATE DATABASE "BD_Voluntario_TBD"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Spain.1252'
    LC_CTYPE = 'Spanish_Spain.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
    
\c BD_Voluntario_TBD

--Drops en caso de que existan las tablas*/

DROP TABLE IF EXISTS "Ranking";
DROP TABLE IF EXISTS "Institucion";
DROP TABLE IF EXISTS "Emergencia";
DROP TABLE IF EXISTS "Tarea";
DROP TABLE IF EXISTS "Emergencia_habilidad";
DROP TABLE IF EXISTS "Habilidad";
DROP TABLE IF EXISTS "Tarea_habilidad";
DROP TABLE IF EXISTS "Voluntario_habilidad";
DROP TABLE IF EXISTS "Voluntario";


create table "Voluntario"(
    id_voluntario serial PRIMARY KEY,
    rut varchar(32)  NOT NULL UNIQUE,
    region varchar(64) NOT NULL,
    ciudad varchar(128) NOT NULL,
    nombre varchar(64) NOT NULL,
    telefono_contacto varchar(64) NOT NULL UNIQUE,
    fecha_nacimiento date,
    correo varchar(32) NOT NULL UNIQUE,
    disponibilidad_lunes bool NOT NULL,
    disponibilidad_martes bool NOT NULL,
    disponibilidad_miercoles bool NOT NULL,
    disponibilidad_jueves bool NOT NULL,
    disponibilidad_viernes bool NOT NULL,
    disponibilidad_sabado bool NOT NULL,
    disponibilidad_domingo bool NOT NULL
);

create table "Institucion" (
	id_institucion serial PRIMARY KEY,
	nombre varchar(32) NOT NULL,
	descripcion varchar(128) NOT NULL
	
);

create table "Habilidad"(
    id_habilidad serial PRIMARY KEY,
    criterio varchar(128)
);

create table "Emergencia" (
	id_emergencia serial PRIMARY KEY,
	estado_emergencia varchar(32) NOT NULL,
	descripcion varchar(128) NOT NULL,
	nombre_coordinador varchar(64) NOT NULL,
	rut_coordinador varchar(32) NOT NULL UNIQUE,
	correo_coordinador varchar(64) NOT NULL UNIQUE,
	ciudad varchar(32) NOT NULL,
	region varchar(32) NOT NULL,
	eme_institucion int NOT NULL
	
);

create table "Tarea"(
    id_tarea serial PRIMARY KEY,
    estado_tarea varchar(32) NOT NULL,
    nombre varchar(64) NOT NULL,
    descripcion varchar(128) NOT NULL,
    tarea_emerge int NOT NULL
    
);


create table "Ranking" (
	id_ranking serial PRIMARY KEY,
	requisitos_cumplidos int not NULL,
	puntaje int not NULL, 
	ranking_voluntary int NOT NULL,
	ranking_work int NOT NULL
	
);


create table "Emergencia_habilidad"(
    id_emergencia_habilidad serial PRIMARY KEY,
    id_emergencia_hability int NOT NULL,
    id_hability_emergencia int NOT NULL
    
);


create table "Tarea_habilidad"(
    id_tarea_habilidad serial PRIMARY KEY,
    id_tarea_hability int NOT NULL,
    id_hability_work int NOT NULL
  
);

create table "Voluntario_habilidad"(
    id_voluntario_habilidad serial PRIMARY KEY,
    id_voluntary_hability int NOT NULL,
    id_hability_voluntary int NOT NULL
);



--Referenciacion para las llaves foraneas

ALTER TABLE "Ranking"
	ADD CONSTRAINT FK_Ranking_ID_Voluntario 
	FOREIGN KEY (ranking_voluntary) REFERENCES "Voluntario"(id_voluntario);
	
ALTER TABLE "Ranking"
	ADD CONSTRAINT FK_Ranking_ID_Tarea 
	FOREIGN KEY (ranking_work) REFERENCES "Tarea"(id_tarea);
	

ALTER TABLE "Emergencia"
	ADD CONSTRAINT FK_Emergencia_ID_Institucion 
	FOREIGN KEY (eme_institucion) REFERENCES "Institucion"(id_institucion);
ALTER TABLE "Tarea"
	ADD CONSTRAINT FK_Tarea_ID_Emergencia
	FOREIGN KEY (tarea_emerge) REFERENCES "Emergencia"(id_emergencia);

ALTER TABLE "Emergencia_habilidad"
	ADD CONSTRAINT FK_Emergencia_habilidad_ID_emergencia 
	FOREIGN KEY (id_emergencia_hability) REFERENCES "Emergencia"(id_emergencia);
ALTER TABLE "Emergencia_habilidad"
	ADD CONSTRAINT FK_Emergencia_habilidad_ID_habilidad
	FOREIGN KEY (id_hability_emergencia) REFERENCES "Habilidad"(id_habilidad);
ALTER TABLE "Tarea_habilidad"
	ADD CONSTRAINT FK_Tarea_habilidad_ID_Tarea
	FOREIGN KEY (id_tarea_hability) REFERENCES "Tarea"(id_tarea);

ALTER TABLE "Tarea_habilidad"
	ADD CONSTRAINT FK_Tarea_habilidad_ID_habilidad 
	FOREIGN KEY (id_hability_work) REFERENCES "Habilidad"(id_habilidad);
ALTER TABLE "Voluntario_habilidad"
	ADD CONSTRAINT FK_Voluntario_habilidad_ID_voluntario 
	FOREIGN KEY (id_voluntary_hability) REFERENCES "Voluntario"(id_voluntario);

ALTER TABLE "Voluntario_habilidad"
	ADD CONSTRAINT FK_Voluntario_habilidad_ID_habilidad 
	FOREIGN KEY (id_hability_voluntary) REFERENCES "Habilidad"(id_habilidad);



--Funcion calcular edad

CREATE FUNCTION calcular_edad(fecha_nacimiento date)
RETURNS integer AS $$
BEGIN
RETURN ( EXTRACT(YEAR FROM CURRENT_DATE) - EXTRACT(YEAR FROM
fecha_nacimiento));
END; $$
LANGUAGE PLPGSQL;

/* Consulta SQL

select id_voluntario, "Voluntario".nombre as nom ,rut,region,ciudad,fecha_nacimiento,calc_edad_aprox(fecha_nacimiento) edad
from "Voluntario" 
INNER JOIN "Ranking" ON "Voluntario".id_voluntario = "Ranking".ranking_voluntary
INNER JOIN "Tarea" ON "Tarea".id_tarea = "Ranking".ranking_work
GROUP BY "Voluntario".id_voluntario; 
 */

--Procedimiento Almacenado






