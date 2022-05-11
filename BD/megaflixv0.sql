CREATE DATABASE  IF NOT EXISTS `megaflix` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `megaflix`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: megaflix
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `contenido`
--

DROP TABLE IF EXISTS `contenido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contenido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(70) DEFAULT NULL,
  `Director` varchar(45) DEFAULT NULL,
  `Descripcion` varchar(500) DEFAULT NULL,
  `Temporadas` int(11) DEFAULT NULL,
  `Duracion` varchar(8) DEFAULT '00:00',
  `Imagen` longblob,
  `Tipo` enum('Peliculas','Series') DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contenido`
--

/*!40000 ALTER TABLE `contenido` DISABLE KEYS */;
INSERT INTO `contenido` VALUES (1,'Your Name','Makoto Shinkai','Una chica del campo comienza a despertar en el cuerpo de un joven de la ciudad que tiene la vida que ella siempre soñó',NULL,'01:46',NULL,'Peliculas'),(2,'El juego del calamar','Hwang Dong-hyuk','Cientos de jugadores con problemas de dinero aceptan una invitación rarísima para competir en juegos infantiles. Dentro les esperan un tentador premio y desafíos letales.',1,NULL,NULL,'Series');
/*!40000 ALTER TABLE `contenido` ENABLE KEYS */;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `genero` (
  `idgenero` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idgenero`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Acción'),(2,'Animación'),(3,'Thriller'),(4,'Comedia'),(5,'Ciencia Ficción'),(6,'Drama'),(7,'Fantástica'),(8,'Romántica'),(9,'Terror'),(10,'Documental');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;

--
-- Table structure for table `generocontenido`
--

DROP TABLE IF EXISTS `generocontenido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `generocontenido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idContenido` int(11) NOT NULL,
  `idgenero` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_genpel_id_idx` (`idContenido`),
  KEY `fk_gen_g_id_idx` (`idgenero`),
  CONSTRAINT `fk_content` FOREIGN KEY (`idContenido`) REFERENCES `contenido` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_gen_g_id` FOREIGN KEY (`idgenero`) REFERENCES `genero` (`idgenero`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `generocontenido`
--

/*!40000 ALTER TABLE `generocontenido` DISABLE KEYS */;
INSERT INTO `generocontenido` VALUES (1,1,2),(2,1,7),(3,2,3);
/*!40000 ALTER TABLE `generocontenido` ENABLE KEYS */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(100) NOT NULL,
  `Alias` varchar(45) NOT NULL,
  `passwd` varchar(45) DEFAULT NULL,
  `Bio` varchar(70) DEFAULT NULL,
  `TipoUsuario` enum('Invitado','Usuario','Admin') NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Administrador','admin','admin',NULL,'Admin');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

--
-- Table structure for table `usuariovaloracontenido`
--

DROP TABLE IF EXISTS `usuariovaloracontenido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuariovaloracontenido` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idUsuario` int(11) NOT NULL,
  `idContenido` int(11) NOT NULL,
  `Puntuacion` decimal(1,0) DEFAULT NULL,
  `Comentario` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_usu_id_idx` (`idUsuario`),
  KEY `fk_peli_id_idx` (`idContenido`),
  CONSTRAINT `fk_peli_id` FOREIGN KEY (`idContenido`) REFERENCES `contenido` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_usu_id` FOREIGN KEY (`idUsuario`) REFERENCES `usuarios` (`Id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuariovaloracontenido`
--

/*!40000 ALTER TABLE `usuariovaloracontenido` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuariovaloracontenido` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-11 19:39:23
