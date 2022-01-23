//Comentario de la creacion de la base de datos
print("Creando la nueva base de datos ");
//Constructot de la nueva base de datos y conexion
conn = new Mongo("localhost");
dbmongo = conn.getDB("Voluntario");
dbmongo.dropDatabase();
//creacion de las collecciones de la database
dbmongo.createCollection("habilidad");
dbmongo.createCollection("voluntarios");
//Mnesaje de que fue creada con exito 
print("Se ha creado su nueva base de datos  ");