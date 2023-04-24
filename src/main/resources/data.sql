
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


INSERT INTO peliculas (nombre,calificacionedad) VALUES ('Citizen Kane','PG'),('Singin` in the Rain','G'),('The Wizard of Oz','G'),('The Quiet Man',NULL),('North by Northwest',NULL),('Mary Poppins','NC-17');
INSERT INTO salas (nombre,pelicula) VALUES ('Odeon',5),('Imperial',1),('Majestic',2),('Royale',6),('Paraiso',3),('Nickelodeon',3);