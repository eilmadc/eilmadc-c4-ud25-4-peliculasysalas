
DROP TABLE IF EXISTS peliculas;
CREATE TABLE peliculas (
  CODIGO int NOT NULL AUTO_INCREMENT,
  NOMBRE varchar(255) DEFAULT NULL,
  CALIFICACIONEDAD varchar(255) DEFAULT NULL,
  PRIMARY KEY (CODIGO)
);




DROP TABLE IF EXISTS salas;
CREATE TABLE salas (
  CODIGO int NOT NULL AUTO_INCREMENT,
  NOMBRE varchar(255) DEFAULT NULL,
  PELICULA int DEFAULT NULL,
  PRIMARY KEY (CODIGO),
  CONSTRAINT salas_ibfk_1 FOREIGN KEY (PELICULA) REFERENCES peliculas (CODIGO)  ON UPDATE CASCADE ON DELETE CASCADE
) ;


INSERT INTO peliculas (codigo,nombre,calificacionedad) VALUES (1,'Citizen Kane','PG'),(2,'Singin` in the Rain','G'),(3,'The Wizard of Oz','G'),(4,'The Quiet Man',NULL),(5,'North by Northwest',NULL),(6,'Mary Poppins','NC-17');
INSERT INTO salas (codigo,nombre,pelicula) VALUES (1,'Odeon',5),(2,'Imperial',1),(3,'Majestic',2),(4,'Royale',6),(5,'Paraiso',3),(6,'Nickelodeon',3);