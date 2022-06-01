-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: megaflix
-- ------------------------------------------------------
-- Server version	8.0.29

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

/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-01 18:30:11
