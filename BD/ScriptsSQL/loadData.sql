--Voluntario

INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('18.555.124-1','Gustaco Fernandez','Atacama','Chañaral','956755214','1998-06-12','correo1@gmail.com',
true,false,true,true,false,true,true);
INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('17.354.785-3','Andrea Fernandez','La serena','Vallenar','989654125','1996-05-06','correo2@gmail.com',
false,false,true,false,true,true,true);
INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('19.534.485-6','Ariel Urra','Arica y Parinacota','Arica','956515345','1998-08-01','correo3@gmail.com',
true,false,true,true,false,true,true);
INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('19.254.534-7','Fernando Gonzalez','OHiggins','Rancagua','921235651','1995-07-27','correo4@gmail.com',
true,true,true,true,false,true,true);
INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('18.454.754-8','Andrea Donoso','Los rios','Valdivia','988652255','1998-09-28','correo5@gmail.com',
true,false,true,true,false,false,true);
INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('19.123.454-6','Chantal Moreno','Metropolitana','Santiago','942165621','1998-02-10','correo6@gmail.com',
true,true,true,true,true,false,false);
INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('18.568.445-2','Ybraim Huenchumilla','Araucania','Temuco','974851263','1997-03-10','correo7@gmail.com',
true,true,true,true,true,true,true);
INSERT INTO "Voluntario"(rut,nombre,region,ciudad,telefono_contacto,fecha_nacimiento,correo,disponibilidad_lunes,
disponibilidad_martes,disponibilidad_miercoles,disponibilidad_jueves,disponibilidad_viernes,disponibilidad_sabado,
disponibilidad_domingo) values ('19.124.343-3','Metropolitana','Jorge Sepulveda','Santiago','912548613','1995-04-03','correo8@gmail.com',
false,false,true,true,false,false,true);

--Instituciones
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_1','descripcion_1');
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_2','descripcion_2');
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_3','descripcion_3');
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_4','descripcion_4');
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_5','descripcion_5');
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_6','descripcion_6');
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_7','descripcion_7');
INSERT INTO "Institucion"(nombre,descripcion) VALUES('Institucion_8','descripcion_8');

--Habilidad

INSERT INTO "Habilidad"(criterio) VALUES('criterio_1');
INSERT INTO "Habilidad"(criterio) VALUES('criterio_2');
INSERT INTO "Habilidad"(criterio) VALUES('criterio_3');
INSERT INTO "Habilidad"(criterio) VALUES('criterio_4');
INSERT INTO "Habilidad"(criterio) VALUES('criterio_5');
INSERT INTO "Habilidad"(criterio) VALUES('criterio_6');
INSERT INTO "Habilidad"(criterio) VALUES('criterio_7');
INSERT INTO "Habilidad"(criterio) VALUES('criterio_8');
--Emergencia

INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (1,'Grave','descripcion_1','nombre_coor_1','rut_coor_1','correo_coor_1','Santiago','Metropolitana');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (2,'Agudo','descripcion_2','nombre_coor_2','rut_coor_2','correo_coor_2','Rancagua','OHiggins');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (3,'Peligroso','descripcion_3','nombre_coor_3','rut_coor_3','correo_coor_3','Santiago','Metropolitana');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (4,'Grave','descripcion_4','nombre_coor_4','rut_coor_4','correo_coor_4','Temuco','Araucania');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (5,'Grave','descripcion_5','nombre_coor_5','rut_coor_5','correo_coor_5','Nueva Imperial','Araucania');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (6,'Agudo','descripcion_6','nombre_coor_6','rut_coor_6','correo_coor_6','Chillan','Ñuble');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (7,'Grave','descripcion_7','nombre_coor_7','rut_coor_7','correo_coor_7','Temuco','Araucania');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (2,'Peligroso','descripcion_8','nombre_coor_2','rut_coor_8','correo_coor_8','Santiago','Metropolitana');
INSERT INTO "Emergencia"(institucion_encargada,estado_emergencia,descripcion,nombre_coordinador,rut_coordinador,correo_coordinador,
ciudad,region) VALUES (1,'Peligroso','descripcion_9','nombre_coor_1','rut_coor_9','correo_coor_9','Santiago','Metropolitana');

--Tarea
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (1,'Terminada','nombre_1','descripcion_1');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (2,'En proceso','nombre_2','descripcion_2');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (3,'No iniciada','nombre_3','descripcion_3');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (4,'No iniciada','nombre_4','descripcion_4');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (5,'En proceso','nombre_5','descripcion_5');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (3,'En proceso','nombre_6','descripcion_6');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (2,'En proceso','nombre_7','descripcion_7');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (2,'Terminada','nombre_8','descripcion_8');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (6,'Terminada','nombre_9','descripcion_9');
INSERT INTO "Tarea"(emergencia,estado_tarea,nombre,descripcion) VALUES (1,'No iniciada','nombre_10','descripcion_10');

--Ranking

INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (1,2,0,true,true);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (1,3,0,true,false);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (2,7,0,true,true);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (3,5,0,true,false);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (4,1,0,true,false);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (5,1,0,true,true);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (6,6,0,true,true);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (7,5,0,true,true);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (8,4,0,true,true);
INSERT INTO "Ranking"(id_voluntario,id_tarea,puntaje,inscrito,aceptado) VALUES (3,2,0,true,true);


--Emergencia_Habilidad

INSERT INTO "Emergencia_Habilidad"(id_emergencia,id_habilidad) VALUES (2,1);
INSERT INTO "Emergencia_Habilidad"(id_emergencia,id_habilidad) VALUES (1,2);
INSERT INTO "Emergencia_Habilidad"(id_emergencia,id_habilidad) VALUES (3,5);
INSERT INTO "Emergencia_Habilidad"(id_emergencia,id_habilidad) VALUES (4,4);
INSERT INTO "Emergencia_Habilidad"(id_emergencia,id_habilidad) VALUES (5,3);
INSERT INTO "Emergencia_Habilidad"(id_emergencia,id_habilidad) VALUES (8,2);
INSERT INTO "Emergencia_Habilidad"(id_emergencia,id_habilidad) VALUES (3,1);

--Tarea_habilidad

INSERT INTO "Tarea_Habilidad"(id_tarea,id_habilidad) VALUES (1,1);
INSERT INTO "Tarea_Habilidad"(id_tarea,id_habilidad) VALUES (2,1);
INSERT INTO "Tarea_Habilidad"(id_tarea,id_habilidad) VALUES (3,2);
INSERT INTO "Tarea_Habilidad"(id_tarea,id_habilidad) VALUES (4,3);
INSERT INTO "Tarea_Habilidad"(id_tarea,id_habilidad) VALUES (5,4);
INSERT INTO "Tarea_Habilidad"(id_tarea,id_habilidad) VALUES (6,5);
INSERT INTO "Tarea_Habilidad"(id_tarea,id_habilidad) VALUES (7,6);

--Voluntario_habilidad

INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (1,1);
INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (2,6);
INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (7,5);
INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (2,4);
INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (3,2);
INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (5,3);
INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (8,1);
INSERT INTO "Voluntario_Habilidad"(id_voluntario,id_habilidad) VALUES (2,2);
