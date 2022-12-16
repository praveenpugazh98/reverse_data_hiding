/*
SQLyog Ultimate v9.02 
MySQL - 5.0.41-community-nt : Database - register
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`register` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `register`;

/*Table structure for table `detail` */

DROP TABLE IF EXISTS `detail`;

CREATE TABLE `detail` (
  `uname` varchar(50) NOT NULL,
  `password` varchar(50) default NULL,
  `receiver` varchar(50) default NULL,
  `imgname` varchar(100) default NULL,
  PRIMARY KEY  (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detail` */

insert  into `detail`(`uname`,`password`,`receiver`,`imgname`) values ('s','ss','str','C:Documents and SettingsJAVADesktop512x512.JPG'),('sss','s','s','C:Documents and SettingsJAVADesktop512x512.JPG'),('str','s','sss','C:Documents and SettingsJAVAMy Documents	ytrdyry.png'),('tr','t','str','C:Documents and SettingsJAVADesktop512x512.JPG');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
