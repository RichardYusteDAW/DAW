-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.24a-Debian_9ubuntu2-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema information_schema
--

--
-- Table structure for table `cicli80_03`.`ciclista`
--
CREATE DATABASE IF NOT EXISTS `ciclismo`;
USE `ciclismo`;
DROP TABLE IF EXISTS `ciclista`;
CREATE TABLE `ciclista` (
  `dorsal` smallint(5) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `edad` smallint(5) default NULL,
  `nomeq` varchar(25) NOT NULL,
  PRIMARY KEY  (`dorsal`),
  KEY `equipociclista` (`nomeq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cicli80_03`.`ciclista`
--

/*!40000 ALTER TABLE `ciclista` DISABLE KEYS */;
LOCK TABLES `ciclista` WRITE;
INSERT INTO `ciclista` VALUES  (1,'Miguel Induráin',32,'Banesto'),
 (2,'Pedro Delgado',35,'Banesto'),
 (3,'Alex Zulle',27,'ONCE'),
 (4,'Tony Rominger',30,'Mapei-Clas'),
 (5,'Gert-Jan Theunisse',32,'TVM'),
 (6,'Adriano Baffi',33,'Mercatone Uno'),
 (7,'Massimiliano Lelli',30,'Mercatone Uno'),
 (8,'Jean Van Poppel',33,'Lotus Festina'),
 (9,'Massimo Podenzana',34,'Navigare'),
 (10,'Mario Cipollini',28,'Mercatone Uno'),
 (11,'Flavio Giupponi',31,'Bresciali-Refin'),
 (12,'Alessio Di Basco',31,'Amore Vita'),
 (13,'Lale Cubino',28,'Seguros Amaya'),
 (14,'Roberto Pagnin',33,'Navigare'),
 (15,'Jesper Skibby',31,'TVM'),
 (16,'Dimitri Konishev',29,'Jolly Club'),
 (17,'Bruno Leali',37,'Bresciali-Refin'),
 (18,'Robert Millar',37,'TVM'),
 (19,'Julian Gorospe',34,'Banesto'),
 (20,'Alfonso Gutiérrez',29,'Artiach'),
 (21,'Erwin Nijboer',31,'Artiach'),
 (22,'Giorgio Furlan',32,'Gewiss'),
 (23,'Lance Armstrong',27,'Motorola'),
 (24,'Claudio Chiappucci',29,'Carrera'),
 (25,'Gianni Bugno',32,'Gatorade'),
 (26,'Mikel Zarrabeitia',27,'Banesto');
INSERT INTO `ciclista` VALUES  (27,'Laurent Jalabert',28,'ONCE'),
 (28,'Jesus Montoya',33,'Banesto'),
 (29,'Angel Edo',28,'Kelme'),
 (30,'Melchor Mauri',28,'Banesto'),
 (31,'Vicente Aparicio',30,'Banesto'),
 (32,'Laurent Dufaux',28,'ONCE'),
 (33,'Stefano della Santa',29,'Mapei-Clas'),
 (34,'Angel Yesid Camargo',30,'Kelme'),
 (35,'Erik Dekker',28,'Wordperfect'),
 (36,'Gian Matteo Fagnini',32,'Mercatone Uno'),
 (37,'Scott Sunderland',29,'TVM'),
 (38,'Javier Palacin',25,'Euskadi'),
 (39,'Rudy Verdonck',30,'Lotus Festina'),
 (40,'Viatceslav Ekimov',32,'Wordperfect'),
 (41,'Rolf Aldag',25,'Telecom'),
 (42,'Davide Cassani',29,'TVM'),
 (43,'Francesco Casagrande',28,'Mercatone Uno'),
 (44,'Luca Gelfi',27,'Gatorade'),
 (45,'Alberto Elli',26,'Artiach'),
 (46,'Agustin Sagasti',24,'Euskadi'),
 (47,'Laurent Pillon',32,'Gewiss'),
 (48,'Marco Saligari',29,'Gewiss'),
 (49,'Eugeni Berzin',23,'Gewiss'),
 (50,'Fernando Escartin',27,'Mapei-Clas'),
 (51,'Udo Bolts',30,'Telecom'),
 (52,'Vladislav Bobrik',26,'Gewiss'),
 (53,'Michele Bartoli',28,'Mercatone Uno');
INSERT INTO `ciclista` VALUES  (54,'Steffen Wesemann',30,'Telecom'),
 (55,'Nicola Minali',28,'Gewiss'),
 (56,'Andrew Hampsten',29,'Banesto'),
 (57,'Stefano Zanini',28,'Navigare'),
 (58,'Gerd Audehm',34,'Telecom'),
 (59,'Mariano Picolli',28,'Mercatone Uno'),
 (60,'Giovanni Lombardi',28,'Bresciali-Refin'),
 (61,'Walte Castignola',26,'Navigare'),
 (62,'Raul Alcala',30,'Motorola'),
 (63,'Alvaro Mejia',32,'Motorola'),
 (64,'Giuseppe Petito',28,'Mercatone Uno'),
 (65,'Pascal Lino',29,'Amore Vita'),
 (66,'Enrico Zaina',24,'Gewiss'),
 (67,'Armand de las Cuevas',28,'Castorama'),
 (68,'Angel Citracca',28,'Navigare'),
 (69,'Eddy Seigneur',27,'Castorama'),
 (70,'Sandro Heulot',29,'Banesto'),
 (71,'Prudencio Induráin',27,'Banesto'),
 (72,'Stefano Colage',28,'Bresciali-Refin'),
 (73,'Laurent Fignon',35,'Gatorade'),
 (74,'Claudio Chioccioli',36,'Amore Vita'),
 (75,'Juan Romero',32,'Seguros Amaya'),
 (76,'Marco Giovannetti',34,'Gatorade'),
 (77,'Javier Mauleon',33,'Mapei-Clas'),
 (78,'Antonio Esparza',35,'Kelme'),
 (79,'Johan Bruyneel',33,'ONCE');
INSERT INTO `ciclista` VALUES  (80,'Federico Echave',37,'Mapei-Clas'),
 (81,'Piotr Ugrumov',33,'Gewiss'),
 (82,'Edgar Corredor',30,'Kelme'),
 (83,'Hernan Buenahora',32,'Kelme'),
 (84,'Jon Unzaga',31,'Mapei-Clas'),
 (85,'Dimitri Abdoujaparov',30,'Carrera'),
 (86,'Juan Martinez Oliver',32,'Kelme'),
 (87,'Fernando Mota',32,'Artiach'),
 (88,'Angel Camarillo',28,'Mapei-Clas'),
 (89,'Stefan Roche',36,'Carrera'),
 (90,'Ivan Ivanov',27,'Artiach'),
 (91,'Nestor Mora',28,'Kelme'),
 (92,'Federico Garcia',27,'Artiach'),
 (93,'Bo Hamburger',29,'TVM'),
 (94,'Marino Alonso',30,'Banesto'),
 (95,'Manuel Guijarro',31,'Lotus Festina'),
 (96,'Tom Cordes',29,'Wordperfect'),
 (97,'Casimiro Moreda',28,'ONCE'),
 (98,'Eleuterio Anguita',25,'Artiach'),
 (99,'Per Pedersen',29,'Seguros Amaya'),
 (100,'William Palacios',30,'Jolly Club');
UNLOCK TABLES;
/*!40000 ALTER TABLE `ciclista` ENABLE KEYS */;


--
-- Table structure for table `cicli80_03`.`equipo`
--

DROP TABLE IF EXISTS `equipo`;
CREATE TABLE `equipo` (
  `nomeq` varchar(25) NOT NULL,
  `director` varchar(30) default NULL,
  PRIMARY KEY  (`nomeq`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cicli80_03`.`equipo`
--

/*!40000 ALTER TABLE `equipo` DISABLE KEYS */;
LOCK TABLES `equipo` WRITE;
INSERT INTO `equipo` VALUES  ('Amore Vita','Ricardo Padacci'),
 ('Artiach','José Peréz'),
 ('Banesto','Miguel Echevarria'),
 ('Bresciali-Refin','Pietro Armani'),
 ('Carrera','Luigi Petroni'),
 ('Castorama','Jean Philip'),
 ('Euskadi','Pedro Txucaru'),
 ('Gatorade','Gian Luca Pacceli'),
 ('Gewiss','Moreno Argentin'),
 ('Jolly Club','Johan Richard'),
 ('Kelme','Álvaro Pino'),
 ('Lotus Festina','Suarez Cuevas'),
 ('Mapei-Clas','Juan Fernandez'),
 ('Mercatone Uno','Ettore Romano'),
 ('Motorola','John Fidwell'),
 ('Navigare','Lonrenzo Sciacci'),
 ('ONCE','Manuel Sainz'),
 ('PDM','Piet Van Der Kruis'),
 ('Seguros Amaya','Minguez'),
 ('Telecom','Morgan Reikcard'),
 ('TVM','Steveens Henk'),
 ('Wordperfect','Bill Gates');
UNLOCK TABLES;
/*!40000 ALTER TABLE `equipo` ENABLE KEYS */;


--
-- Table structure for table `cicli80_03`.`etapa`
--

DROP TABLE IF EXISTS `etapa`;
CREATE TABLE `etapa` (
  `netapa` smallint(5) NOT NULL,
  `km` smallint(5) NOT NULL,
  `salida` varchar(35) NOT NULL,
  `llegada` varchar(35) NOT NULL,
  `dorsal` smallint(5) default NULL,
  PRIMARY KEY  (`netapa`),
  KEY `ciclistaetapa` (`dorsal`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cicli80_03`.`etapa`
--

/*!40000 ALTER TABLE `etapa` DISABLE KEYS */;
LOCK TABLES `etapa` WRITE;
INSERT INTO `etapa` VALUES  (1,9,'Valladolid','Valladolid',1),
 (2,180,'Valladolid','Salamanca',36),
 (3,240,'Salamanca','Caceres',12),
 (4,230,'Almendralejo','Córdoba',83),
 (5,170,'Córdoba','Granada',27),
 (6,150,'Granada','Sierra Nevada',52),
 (7,250,'Baza','Alicante',22),
 (8,40,'Benidorm','Benidorm',1),
 (9,150,'Benidorm','Valencia',35),
 (10,200,'Igualada','Andorra',2),
 (11,195,'Andorra','Estación de Cerler',65),
 (12,220,'Benasque','Zaragoza',12),
 (13,200,'Zaragoza','Pamplona',93),
 (14,172,'Pamplona','Alto de la Cruz de la Demanda',86),
 (15,207,'Santo Domingo de la Calzada','Santander',10),
 (16,160,'Santander','Lagos de Covadonga',5),
 (17,140,'Cangas de Onis','Alto del Naranco',4),
 (18,195,'Ávila','Ávila',8),
 (19,190,'Ávila','Destilerias Dyc',2),
 (20,52,'Segovia','Destilerias Dyc',2),
 (21,170,'Destilerias Dyc','Madrid',27);
UNLOCK TABLES;
/*!40000 ALTER TABLE `etapa` ENABLE KEYS */;


--
-- Table structure for table `cicli80_03`.`llevar`
--

DROP TABLE IF EXISTS `llevar`;
CREATE TABLE `llevar` (
  `dorsal` smallint(5) NOT NULL,
  `netapa` smallint(5) NOT NULL,
  `codigo` varchar(3) NOT NULL,
  PRIMARY KEY  (`netapa`,`codigo`),
  KEY `ciclistallevar` (`dorsal`),
  KEY `etapallevar` (`netapa`),
  KEY `maillotllevar` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cicli80_03`.`llevar`
--

/*!40000 ALTER TABLE `llevar` DISABLE KEYS */;
LOCK TABLES `llevar` WRITE;
INSERT INTO `llevar` VALUES  (1,1,'MGE'),
 (1,1,'MMO'),
 (1,1,'MMV'),
 (1,1,'MRE'),
 (1,1,'MSE'),
 (1,2,'MGE'),
 (1,3,'MGE'),
 (1,4,'MGE'),
 (1,16,'MGE'),
 (1,17,'MGE'),
 (1,18,'MGE'),
 (1,19,'MGE'),
 (1,20,'MGE'),
 (1,21,'MGE'),
 (2,5,'MGE'),
 (2,6,'MGE'),
 (2,7,'MGE'),
 (2,21,'MMO'),
 (3,11,'MGE'),
 (3,12,'MGE'),
 (4,8,'MGE'),
 (8,2,'MSE'),
 (8,4,'MSE'),
 (10,18,'MSE'),
 (12,3,'MSE'),
 (12,5,'MSE'),
 (12,6,'MSE'),
 (16,2,'MMV'),
 (16,3,'MMV'),
 (16,5,'MMV'),
 (16,6,'MMV'),
 (17,4,'MMV'),
 (20,6,'MRE'),
 (20,7,'MRE'),
 (20,8,'MRE'),
 (20,9,'MRE'),
 (20,10,'MRE'),
 (20,11,'MRE'),
 (20,12,'MRE'),
 (20,13,'MRE'),
 (20,14,'MRE'),
 (20,15,'MRE'),
 (20,16,'MRE'),
 (20,17,'MRE'),
 (20,18,'MMV'),
 (20,19,'MRE'),
 (20,20,'MRE'),
 (20,21,'MRE'),
 (22,14,'MSE'),
 (22,15,'MSE'),
 (22,16,'MSE'),
 (22,17,'MSE'),
 (22,19,'MSE'),
 (22,20,'MSE'),
 (22,21,'MSE'),
 (24,4,'MMO'),
 (25,2,'MMO'),
 (25,3,'MMO'),
 (25,5,'MMO'),
 (26,6,'MMO'),
 (26,7,'MMO'),
 (26,8,'MMO'),
 (26,9,'MGE'),
 (26,9,'MMO'),
 (26,10,'MGE'),
 (26,18,'MMO');
INSERT INTO `llevar` VALUES  (27,2,'MRE'),
 (27,3,'MRE'),
 (27,4,'MRE'),
 (27,5,'MRE'),
 (27,18,'MRE'),
 (28,14,'MMO'),
 (28,15,'MMO'),
 (28,16,'MMO'),
 (28,17,'MMO'),
 (28,19,'MMO'),
 (28,20,'MMO'),
 (30,10,'MMO'),
 (30,11,'MMO'),
 (30,12,'MMO'),
 (30,13,'MGE'),
 (30,13,'MMO'),
 (30,14,'MGE'),
 (30,15,'MGE'),
 (33,7,'MMV'),
 (33,8,'MMV'),
 (42,14,'MMV'),
 (42,15,'MMV'),
 (42,16,'MMV'),
 (42,17,'MMV'),
 (42,19,'MMV'),
 (42,20,'MMV'),
 (42,21,'MMV'),
 (48,9,'MMV'),
 (48,10,'MMV'),
 (48,11,'MMV'),
 (48,12,'MMV'),
 (48,13,'MMV'),
 (67,1,'MMS'),
 (67,3,'MMS'),
 (69,2,'MMS'),
 (69,4,'MMS'),
 (99,7,'MSE'),
 (99,8,'MSE'),
 (99,9,'MSE'),
 (99,10,'MSE'),
 (99,11,'MSE'),
 (99,12,'MSE'),
 (99,13,'MSE');
UNLOCK TABLES;
/*!40000 ALTER TABLE `llevar` ENABLE KEYS */;


--
-- Table structure for table `cicli80_03`.`maillot`
--

DROP TABLE IF EXISTS `maillot`;
CREATE TABLE `maillot` (
  `codigo` varchar(3) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `color` varchar(20) NOT NULL,
  `premio` int(10) NOT NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cicli80_03`.`maillot`
--

/*!40000 ALTER TABLE `maillot` DISABLE KEYS */;
LOCK TABLES `maillot` WRITE;
INSERT INTO `maillot` VALUES  ('MGE','General','Amarillo',8000000),
 ('MMO','Montaña','Blanco y Rojo',2000000),
 ('MMS','Mas Sufrido','Estrellitas moradas',2000000),
 ('MMV','Metas volantes','Rojo',2000000),
 ('MRE','Regularidad','Verde',2000000),
 ('MSE','Sprints especiales','Rosa',2000000);
UNLOCK TABLES;
/*!40000 ALTER TABLE `maillot` ENABLE KEYS */;


--
-- Table structure for table `cicli80_03`.`puerto`
--

DROP TABLE IF EXISTS `puerto`;
CREATE TABLE `puerto` (
  `nompuerto` varchar(35) NOT NULL,
  `altura` smallint(5) NOT NULL,
  `categoria` varchar(1) NOT NULL,
  `pendiente` double(15,5) default NULL,
  `netapa` smallint(5) NOT NULL,
  `dorsal` smallint(5) default NULL,
  PRIMARY KEY  (`nompuerto`),
  KEY `ciclistapuerto` (`dorsal`),
  KEY `etapapuerto` (`netapa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cicli80_03`.`puerto`
--

/*!40000 ALTER TABLE `puerto` DISABLE KEYS */;
LOCK TABLES `puerto` WRITE;
INSERT INTO `puerto` VALUES  ('Alto del Naranco',565,'1',6.90000,10,30),
 ('Arcalis',2230,'E',6.50000,10,4),
 ('Cerler-Circo de Ampriu',2500,'E',5.87000,11,9),
 ('Coll de la Comella',1362,'1',8.07000,10,2),
 ('Coll de Ordino',1980,'E',5.30000,10,7),
 ('Cruz de la Demanda',1850,'E',7.00000,11,20),
 ('Lagos de Covadonga',1134,'E',6.86000,16,42),
 ('Navacerrada',1860,'1',7.50000,19,2),
 ('Puerto de Alisas',672,'1',5.80000,15,1),
 ('Puerto de la Morcuera',1760,'2',6.50000,19,2),
 ('Puerto de Mijares',1525,'1',4.90000,18,24),
 ('Puerto de Navalmoral',1521,'2',4.30000,18,2),
 ('Puerto de Pedro Bernardo',1250,'1',4.20000,18,25),
 ('Sierra Nevada',2500,'E',6.00000,2,26);
UNLOCK TABLES;
/*!40000 ALTER TABLE `puerto` ENABLE KEYS */;

/*Consultas*/
-- EJERCICIO 1. Obtener el nombre del ciclista que tiene más de 20 años:
SELECT nombre, edad FROM ciclista WHERE edad > 20;

-- EJERCICIO 2. Nombre de los ciclistas que pertenezcan a ‘Kelme’:
SELECT nombre, nomeq FROM ciclista WHERE nomeq = "Kelme";

-- EJERCICIO 3. Obtener el nombre de cada puerto indicando el número (netapa) y los kilómetros de la etapa en la que se encuentra el puerto:
SELECT nompuerto, p.netapa, km
FROM puerto p, etapa e
WHERE p.netapa = e.netapa;
SELECT nompuerto, netapa, km FROM puerto NATURAL JOIN etapa;

-- EJERCICIO 4. Nombre de aquellos ciclistas que tengan una edad entre 25 y 30 años y que pertenezcan a los equipos Kelme y Banesto:
SELECT nombre, edad, nomeq
FROM ciclista
WHERE (edad BETWEEN 25 AND 30) AND (nomeq='Kelme' OR nomeq='Banesto');

-- EJERCICIO 5. Obtener el nombre y el director de los equipos a los que pertenezca algún ciclista mayor de 33 años:
SELECT e.nomeq, director
FROM equipo e , ciclista c
WHERE (e.nomeq = c.nomeq) AND (edad>33);
SELECT nomeq, director FROM equipo  e INNER JOIN ciclista c ON (e.nomeq = c.nomeq) WHERE (edad > 33);

-- EJERCICIO 6. Obtener el nombre y el equipo de los ciclistas menores de 30 años que hayan ganado alguna etapa:
SELECT nombre, nomeq
FROM ciclista c, etapa e
WHERE (c.dorsal = e.dorsal) AND (edad<30);

-- EJERCICIO 7. Obtener el nombre y el equipo de los ciclistas mayores de 32 años que hayan ganado algún puerto:
SELECT DISTINCT nombre, nomeq
FROM ciclista c, puerto p
WHERE (c.dorsal = p.dorsal) AND (edad>32);

-- EJERCICIO 8. Obtener el nombre y el equipo de los ciclistas que han ganado alguna etapa llevando el maillot amarillo, mostrando tambien el numero de etapa:
SELECT c.nombre, c.nomeq, e.netapa
FROM ciclista c, etapa e, llevar ll, maillot m
WHERE (c.dorsal = e.dorsal) AND (c.dorsal = ll.dorsal) AND (ll.codigo = m.codigo) AND (e.netapa=ll.netapa) AND (color='Amarillo');

-- EJERCICIO 9. Obtener las poblaciones de salida y de llegada de las etapas donde se encuentran puertos con altura superior a 1300 metros:
SELECT DISTINCT salida, llegada
FROM etapa e, puerto p
WHERE (e.netapa=p.netapa) AND (altura > 1300);

-- EJERCICIO 10. Obtener la edad media de los ciclistas que han ganado alguna etapa:
SELECT AVG(edad) AS media
FROM ciclista c, etapa e
WHERE (c.dorsal = e.dorsal);

SELECT AVG(edad) AS media
FROM ciclista
WHERE dorsal IN (
  SELECT dorsal
  FROM etapa
)

-- EJERCICIO 11. Obtener la edad del ciclista más joven, la del más veterano y la edad media de los ciclistas que han participado en la vuelta:
SELECT MIN(edad), MAX(edad), AVG(edad)
FROM ciclista;