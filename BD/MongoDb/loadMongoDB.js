dbmongo.voluntarios.insertMany([
{"nombre": "Gustavo",
"apellido" : "Fernandez",
"rut" : "rut_1",
"direccion" : {
    "ciudad" : "Santiago",
    "region" : "Metropolitana"
},
 "email": "corre_1@usach.cl",
 "habilidad":["HH1", "HH2"],
 "fecha_nacimiento": new Date(1998, 10, 10),
     "disponibilidad":{
     "lunes" : true,
     "martes" : true,
     "miercoles" : false,
     "jueves" : true,
     "viernes" : false,
     "sabado" : true,
     "domingo" : true
     }
 }, 

     {"nombre": "Andrea",
"apellido" : "Fernandez",
"rut" : "rut_2",
"direccion" : {
    "ciudad" : "Temuco",
    "region" : "Araucania"
},
 "email": "corre_2@usach.cl",
 "habilidad":["AA1","ZZ1","VV1"],
 "fecha_nacimiento": new Date(1997, 09, 28),
     "disponibilidad":{
     "lunes" : true,
     "martes" : true,
     "miercoles" : true,
     "jueves" : true,
     "viernes" : true,
     "sabado" : false,
     "domingo" : false
     }
 },

     {"nombre": "Ariel",
"apellido" : "Urra",
"rut" : "rut_3",
"direccion" : {
    "ciudad" : "Chillan",
    "region" : "Ñuble"
},
 "email": "corre_3@usach.cl",
 "habilidad":["CC3", "BB1","TT1","AA1"],
 "fecha_nacimiento": new Date(1996, 08, 25),
     "disponibilidad":{
     "lunes" : false,
     "martes" : false,
     "miercoles" : false,
     "jueves" : false,
     "viernes" : false,
     "sabado" : true,
     "domingo" : true
     }
 },
      {"nombre": "Fernando",
"apellido" : "Gonzalez",
"rut" : "rut_4",
"direccion" : {
    "ciudad" : "Concepcion",
    "region" : "Bio-Bio"
},
 "email": "corre_4@usach.cl",
 "habilidad":["HH2", "ZZ1","HH1","AA1","RR1","ZZ1"],
 "fecha_nacimiento": new Date(1998, 12, 21),
     "disponibilidad":{
     "lunes" : false,
     "martes" : true,
     "miercoles" : false,
     "jueves" : true,
     "viernes" : false,
     "sabado" : true,
     "domingo" : true
     }
 },

      {"nombre": "Andrea",
"apellido" : "Donoso",
"rut" : "rut_5",
"direccion" : {
    "ciudad" : "Santiago",
    "region" : "Metropolitana"
},
 "email": "corre_5@usach.cl",
 "habilidad":["CC3", "MM1","AA1","TT1","ZZ1"],
 "fecha_nacimiento": new Date(1998, 01, 15),
     "disponibilidad":{
     "lunes" : true,
     "martes" : false,
     "miercoles" : false,
     "jueves" : false,
     "viernes" : true,
     "sabado" : true,
     "domingo" : true
     }
 },
      {"nombre": "Chantal",
"apellido" : "Moreno",
"rut" : "rut_6",
"direccion" : {
    "ciudad" : "San Nicolas",
    "region" : "Ñuble"
},
 "email": "corre_6@usach.cl",
 "habilidad":["BB1","HH1","AA1","RR1"],
 "fecha_nacimiento": new Date(1997, 10, 18),
     "disponibilidad":{
     "lunes" : false,
     "martes" : true,
     "miercoles" : true,
     "jueves" : true,
     "viernes" : false,
     "sabado" : true,
     "domingo" : true
     }
 },
      {"nombre": "Ybraim",
"apellido" : "Huenchumilla",
"rut" : "rut_7",
"direccion" : {
    "ciudad" : "Freire",
    "region" : "Araucania"
},
 "email": "corre_7@usach.cl",
 "habilidad":["CC3", "MM1","HH1","AA1","HH2","RR1"],
 "fecha_nacimiento": new Date(1998, 10, 17),
     "disponibilidad":{
     "lunes" : true,
     "martes" : true,
     "miercoles" : true,
     "jueves" : true,
     "viernes" : true,
     "sabado" : true,
     "domingo" : true
     }
 },
      {"nombre": "Jorge",
"apellido" : "Sepulveda",
"rut" : "rut_8",
"direccion" : {
    "ciudad" : "Santiago",
    "region" : "Metropolitana"
},
 "email": "corre_8@usach.cl",
 "habilidad":["CC3", "BB1","TT1","AA1","MM1","HH2"],
 "fecha_nacimiento": new Date(1998, 12, 12),
     "disponibilidad":{
     "lunes" : true,
     "martes" : false,
     "miercoles" : true,
     "jueves" : false,
     "viernes" : true,
     "sabado" : true,
     "domingo" : false
     }
 }

]);

dbmongo.habilidad.insertMany([
    {"nombre": "Habilidad 1", "description": "Descripcion_1", "codigo": "HH1"},
    {"nombre": "Habilidad 2", "description": "Descripcion_2", "codigo": "HH2"},
    {"nombre": "Habilidad 3", "description": "Descripcion_3", "codigo": "BB1"},
    {"nombre": "Habilidad 4", "description": "Descripcion_4", "codigo": "AA1"},
    {"nombre": "Habilidad 5", "description": "Descripcion_5", "codigo": "RR1"},
    {"nombre": "Habilidad 6", "description": "Descripcion_6", "codigo": "TT1"},
    {"nombre": "Habilidad 7", "description": "Descripcion_7", "codigo": "BB2"},
    {"nombre": "Habilidad 8", "description": "Descripcion_8", "codigo": "CC3"},
    {"nombre": "Habilidad 9", "description": "Descripcion_9", "codigo": "ZZ1"},
    {"nombre": "Habilidad 10", "description": "Descripcion_10", "codigo": "VV1"},
    {"nombre": "Habilidad 11", "description": "Descripcion_111", "codigo": "MM1"}
    ]);