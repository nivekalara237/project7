-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: db_library
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'Le seigneur des anneaux','J.R.R. Tolkien',25,12,'https://static.fnac-static.com/multimedia/Images/FR/NR/40/67/1e/1992512/1507-1/tsp20200411070916/Le-Seigneur-des-Anneaux.jpg'),(2,'1984','George Orwell',10,8,'https://static.fnac-static.com/multimedia/Images/FR/NR/10/35/01/79120/1507-1/tsp20200507072651/1984.jpg'),(3,'L\'étranger','Albert Camus',3,1,'https://static.fnac-static.com/multimedia/Images/FR/NR/99/65/14/1336729/1507-1/tsp20150310100357/L-etranger-d-Albert-Camus.jpg'),(4,'Les misérables','Victor Hugo',24,18,'https://static.fnac-static.com/multimedia/FR/images_produits/FR/Fnac.com/ZoomPE/4/1/8/9782013232814/tsp20130901133749/Les-Miserables.jpg'),(5,'Madame Bovary','Gustave Flaubert',5,4,'https://static.fnac-static.com/multimedia/Images/FR/NR/1e/9c/3d/4037662/1507-0/tsp20191031072439/Madame-Bovary.jpg'),(6,'Le rouge et le noir','Stendhal',3,3,'https://static.fnac-static.com/multimedia/Images/FR/NR/cd/9e/10/1089229/1507-1/tsp20200525092055/Le-Rouge-et-le-Noir.jpg'),(7,'La peste','Albert Camus',2,2,'https://static.fnac-static.com/multimedia/Images/FR/NR/2e/f9/01/129326/1507-0/tsp20191030071015/La-Peste.jpg'),(8,'ça','Stephen king',6,5,'https://static.fnac-static.com/multimedia/FR/images_produits/FR/Fnac.com/ZoomPE/0/4/3/9782253151340/tsp20110122033923/Ca.jpg'),(9,'Germinal','Emile Zola',7,7,'https://static.fnac-static.com/multimedia/Images/FR/NR/f0/cd/04/314864/1507-1/tsp20180823094146/Germinal.jpg'),(10,'Harry Potter','J.K. Rowling',32,27,'https://static.fnac-static.com/multimedia/Images/FR/NR/ba/d8/1d/1956026/1507-1/tsp20200301071729/Harry-Potter-I-Harry-Potter-a-l-ecole-des-sorciers.jpg');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `loan`
--

LOCK TABLES `loan` WRITE;
/*!40000 ALTER TABLE `loan` DISABLE KEYS */;
INSERT INTO `loan` VALUES (1,1,1,'2020-06-02',0,0,'2020-07-28'),(2,3,2,'2020-05-13',0,0,'2020-07-09'),(3,2,3,'2020-02-12',0,1,'2020-04-07'),(4,1,4,'2020-04-11',0,1,'2020-05-09'),(5,4,5,'2020-04-11',0,0,'2020-06-09'),(7,4,6,'1970-01-01',1,1,'1970-02-26'),(8,1,7,'1970-01-01',0,0,'1970-01-29'),(9,1,8,'1970-01-01',0,0,'1970-01-29'),(10,4,9,'2020-02-12',0,0,'2020-05-05'),(11,4,10,'2020-02-12',0,0,'2020-07-05'),(12,3,1,'2020-06-02',0,0,'2020-06-30');
/*!40000 ALTER TABLE `loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Martin','Sonia','radotfranck03@gmail.com','so','so123','USER'),(2,'Petit','Théo','radotfranck03@gmail.com','theo','theo123','USER'),(3,'Richaud','Nina','radotfranck03@gmail.com','nina','nina123','USER'),(4,'Dubois','Geoffrey','radotfranck03@gmail.com','geo','geo123','USER');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_library'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-07  9:36:13
