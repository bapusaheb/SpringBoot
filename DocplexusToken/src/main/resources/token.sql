/*
SQLyog Community Edition- MySQL GUI v8.05 
MySQL - 5.6.27-0ubuntu0.14.04.1 : Database - tokenMgt
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`tokenMgt` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `tokenMgt`;

/*Table structure for table `bank` */

DROP TABLE IF EXISTS `bank`;

CREATE TABLE `bank` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bank` */

/*Table structure for table `banker` */

DROP TABLE IF EXISTS `banker`;

CREATE TABLE `banker` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `bankId` bigint(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1_bank` (`bankId`),
  CONSTRAINT `FK1_bank` FOREIGN KEY (`bankId`) REFERENCES `bank` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `banker` */

/*Table structure for table `branch` */

DROP TABLE IF EXISTS `branch`;

CREATE TABLE `branch` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `counters` int(10) DEFAULT '1',
  `bankid` bigint(100),
  PRIMARY KEY (`id`),
  KEY `FK1_branch_bank` (`bankid`),
  CONSTRAINT `FK1_branch_bank` FOREIGN KEY (`bankid`) REFERENCES `bank` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `branch` */

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `previladged` tinyint(1) DEFAULT '0',
  `bankId` bigint(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1_cust_bank` (`bankId`),
  CONSTRAINT `FK1_cust_bank` FOREIGN KEY (`bankId`) REFERENCES `bank` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `counter` bigint(100) DEFAULT NULL,
  `priority` tinyint(1) DEFAULT '0',
  `served` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `token` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
