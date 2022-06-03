DROP DATABASE IF EXISTS  megaflix;
CREATE DATABASE megaflix;
use megaflix;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `Alias` varchar(45) NOT NULL,
  `passwd` varchar(45) DEFAULT NULL,
  `Bio` varchar(70) DEFAULT NULL,
  `TipoUsuario` enum('Invitado','Usuario','Admin') NOT NULL,
  `Imagen` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Administrador','admin','admin',NULL,'Admin',"./src/imagenes/admin.jpg"),(2,'Ian','elevenlol','1234',NULL,'Usuario','./src/imagenes/ian.jpg'),(3,'Carmen','carmenSa','1234',NULL,'Usuario','./src/imagenes/carmen.jpg'),(4,'Laura','lauav','1234',NULL,'Usuario','./src/imagenes/laura.jpg'),(5,'Pepito','pepi1','1234',NULL,'Usuario','./src/imagenes/pepito.jpg');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `idgenero` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idgenero`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Acción'),(2,'Animación'),(3,'Thriller'),(4,'Comedia'),(5,'Ciencia Ficción'),(6,'Drama'),(7,'Fantástica'),(8,'Romántica'),(9,'Terror'),(10,'Documental'),(11,'Surrealismo');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `generocontenido`
--

DROP TABLE IF EXISTS `generocontenido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generocontenido` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idContenido` int NOT NULL,
  `idgenero` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_genpel_id_idx` (`idContenido`),
  KEY `fk_gen_g_id_idx` (`idgenero`),
  CONSTRAINT `fk_content` FOREIGN KEY (`idContenido`) REFERENCES `contenido` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_gen_g_id` FOREIGN KEY (`idgenero`) REFERENCES `genero` (`idgenero`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generocontenido`
--

LOCK TABLES `generocontenido` WRITE;
/*!40000 ALTER TABLE `generocontenido` DISABLE KEYS */;
INSERT INTO `generocontenido` VALUES (1,1,2),(2,1,7),(3,2,3),(23,30,5),(24,31,4),(25,32,4),(26,33,9),(28,34,4),(29,35,3),(30,36,5),(31,37,8),(32,38,8),(33,39,10),(34,40,2);
/*!40000 ALTER TABLE `generocontenido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

--
-- Table structure for table `contenido`
--

DROP TABLE IF EXISTS `contenido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contenido` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(70) DEFAULT NULL,
  `Director` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(500) DEFAULT NULL,
  `Temporadas` int DEFAULT NULL,
  `Duracion` varchar(8) DEFAULT '00:00',
  `Imagen` varchar(100) DEFAULT NULL,
  `Tipo` enum('Peliculas','Series') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contenido`
--

LOCK TABLES `contenido` WRITE;
/*!40000 ALTER TABLE `contenido` DISABLE KEYS */;
INSERT INTO `contenido` VALUES (1,'Your Name','Makoto Shinkai','Una chica del campo comienza a despertar en el cuerpo de un joven de la ciudad que tiene la vida que ella siempre soñó',NULL,'01:46','./src/imagenes/YourName.jpg','Peliculas'),(2,'El juego del calamar','Hwang Dong-hyuk','Cientos de jugadores con problemas de dinero aceptan una invitación rarísima para competir en juegos infantiles. Dentro les esperan un tentador premio y desafíos letales.',1,NULL,'./src/imagenes/ElJuegoDelCalamar.jpg','Series'),(3,'Ultrasecretos','Shion Takeuchi','¿Los lagartos humanoides? Existen. ¿El alunizaje? Nunca sucedió. Esta genia asocial y sus disfuncionales compañeros de trabajo investigan conspiraciones mundiales. Comedia animada ambientada en un gobierno secreto donde abundan las teorías conspirativas.',1,NULL,'./src/imagenes/Ultrasecretos.jpg','Series'),(7,'Shrek','Andrew Adamson, Vicky Jenson','Hace mucho tiempo, en una lejanísima ciénaga, vivía un feroz ogro llamado Shrek. De repente, un día, su soledad se ve interrumpida por una invasión de sorprendentes personajes. ',0,'87 min.','./src/imagenes/Shrek.jpg','Peliculas'),(30,'Stranger Things','Hermanos Duffer','Cuando un niño desaparece, sus amigos, la familia y la policía se ven envueltos en una serie de eventos misteriosos al tratar de encontrarlo. Su ausencia coincide con el avistamiento de una criatura terrorífica y la aparición de una extraña niña.',3,'','./src/imagenes/StrangerThings.jpg','Series'),(31,'Paquita Salas','Javier Calvo y Javier Ambrossi','El mundo de Paquita se tambalea cuando su actriz más conocida la abandona inesperadamente. Junto a Magüi, su inseparable asistente, y Álex, un repartidor, Paquita se lanza desesperada al descubrimiento de un nuevo talento.',3,'','./src/imagenes/PaquitaSalas.jpg','Series'),(32,'Rick y Morty ',' J. Michael Mendel','Después de haber estado desaparecido durante casi 20 años, Rick Sánchez llega de imprevisto a la puerta de la casa de su hija Beth y se va a vivir con ella y su familia utilizando el garaje como su laboratorio personal.',5,'','./src/imagenes/RickyMorty.jpg','Series'),(33,'The Walking Dead ','Frank Darabont, Angela Kang','Basado en la historieta escrita por Robert Kirkman, este drama crudo describe las vidas de un grupo de sobrevivientes que está siempre en movimiento en busca de un hogar seguro durante las semanas y meses de un apocalipsis zombi.',11,'','./src/imagenes/TheWalkingDead.jpg','Series'),(34,'Senior year','Alex Hardcastle','Una estudiante de secundaria y animadora entra en coma antes de su baile de graduación. Veinte años después, cuando se despierta, quiere volver al instituto para recuperar su popularidad y convertirse en la reina del baile de graduación.',0,'1h51mins','./src/imagenes/Senioryear.jpg','Peliculas'),(35,'Quien a hierro mata','Paco Plaza','En un pueblo de la costa gallega vive Mario, un hombre ejemplar. En la residencia de ancianos en la que trabaja como enfermero todos le aprecian. Cuando el narco más conocido de la zona, Antonio Padín, recién salido de la cárcel, ingresa en la residencia, Mario lo cuida como a uno más.',0,'1h47mins','./src/imagenes/Quienahierromata.jpg','Peliculas'),(36,'Star Trek Beyond','Justin Lin','Durante una misión de rescate a una de las zonas más recónditas del espacio, la USS Enterprise es emboscada por Krall, un despiadado señor de la guerra en una cruzada contra la Federación.',0,'2h2mins','./src/imagenes/StarTrekBeyond.jpg','Peliculas'),(37,'Tal Para Cual','Stuart McDonald','Con la idea de ganarse a una clienta importante, una emprendedora ejecutiva vinícola trabaja en un criadero de ovejas, donde cruza flechazos con un tosco y misterioso lugareño.',0,'1h41mins','./src/imagenes/TalParaCual.jpg','Peliculas'),(38,'Fuimos canciones','Juana Macías','Maca tiene ya 30 años y malgasta su talento trabajando para una influencer de moda. Junto a sus dos amigas, Jimena y Adriana, siempre dispuestas a darlo todo para que sus problemas parezcan más livianos, Maca ha conseguido convertir a Madrid en una ciudad donde todo es posible.',0,'1h51m','./src/imagenes/Fuimoscanciones.jpg','Peliculas'),(39,'El Dilema De las Redes Sociales','Jeff Orlowski','Expertos en tecnología de Silicon Valley hacen sonar la alarma sobre el peligroso impacto de las redes sociales, que Big Tech utiliza en un intento de manipular e influir.',0,'1h34m','./src/imagenes/ElDilema.jpg','Peliculas'),(40,'Madagascar','Tom McGrath, Eric Darnell','Cuatro animales muy mimados del zoo de Nueva York naufragan en la isla de Madagascar y deben aprender a sobrevivir en un mundo salvaje.',0,'1h26m','./src/imagenes/Madagascar.jpg','Peliculas');
/*!40000 ALTER TABLE `contenido` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;


--
-- Table structure for table `usuariovaloracontenido`
--

DROP TABLE IF EXISTS `usuariovaloracontenido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuariovaloracontenido` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idUsuario` int NOT NULL,
  `idContenido` int NOT NULL,
  `Puntuacion` decimal(1,0) DEFAULT NULL,
  `Comentario` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_usu_id_idx` (`idUsuario`),
  KEY `fk_peli_id_idx` (`idContenido`),
  CONSTRAINT `fk_peli_id` FOREIGN KEY (`idContenido`) REFERENCES `contenido` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_usu_id` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuariovaloracontenido`
--


/*!40000 ALTER TABLE `usuariovaloracontenido` DISABLE KEYS */;
INSERT INTO `usuariovaloracontenido` VALUES (1,4,7,9,'Probablemente mi película favorita del mundo.'),(2,3,33,6,'Las primeras temporadas muy buenas, luego va decayendo.'),(3,5,32,2,'Pues a mí no me ha gustado para nada :('),(4,5,34,0,'Es malísima, un poco dosmilera. No me gusta este humor.'),(5,4,34,7,'Está bien para echar el rato, muchas vibes del 2000.'),(6,2,31,6,'Me hizo gracia la verdad.'),(7,3,35,4,'Muy lenta para mi gusto, la trama está bien.'),(8,3,40,8,'A mis sobrinos les encantó, es para toda la familia!'),(9,5,40,3,'Hasta mi perro se durmió viéndola '),(10,2,39,8,'Para reflexionar, me ha gustado bastante.'),(11,4,39,9,'Genial, te hace pensar y está muy bien hecho.'),(14,4,33,6,'Un poco densa y mueren mis favoritos :('),(15,4,31,8,'Muy buena, soy fan de Paquita.');
/*!40000 ALTER TABLE `usuariovaloracontenido` ENABLE KEYS */;


