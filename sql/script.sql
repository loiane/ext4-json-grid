-- -----------------------------------------------------
-- Execute this script before before run the app 
-- Database: MySQL
-- 
-- Author: Loiane Groner
-- http://loianegroner.com (English)
-- http://loiane.com (Portuguese)
-- -----------------------------------------------------

CREATE SCHEMA `extjs` ;
USE `extjs` ;

-- -----------------------------------------------------
-- Table `extjs`.`COMPANY`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `extjs`.`COMPANIES` ;

CREATE  TABLE IF NOT EXISTS `extjs`.`COMPANIES` (
  `COMPANY_ID` INT NOT NULL AUTO_INCREMENT ,
  `COMPANY_NAME` VARCHAR(45) NOT NULL ,
  `COMPANY_PRICE` FLOAT NOT NULL ,
  `COMPANY_CHANGE` FLOAT NOT NULL ,
  `COMPANY_PCT_CHANGE` FLOAT NOT NULL ,
  `COMPANY_LAST_CHANGE` DATE NOT NULL ,
  PRIMARY KEY (`COMPANY_ID`) )
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Data for `extjs`.`COMPANY` table
-- -----------------------------------------------------

INSERT INTO `extjs`.`COMPANIES`(`COMPANY_ID`,`COMPANY_NAME`,`COMPANY_PRICE`,`COMPANY_CHANGE`,`COMPANY_PCT_CHANGE`,`COMPANY_LAST_CHANGE`)
VALUES
(1,'3m Co', 71.72, 0.02, 0.03,'2011-09-01'),
(2,'Alcoa Inc', 29.01, 0.42, 1.47, '2011-09-01'),
(3,'Altria Group Inc', 83.81, 0.28, 0.34, '2011-09-01'),
(4,'American Express Company', 52.55, 0.01, 0.02, '2011-09-01'),
(5,'American International Group, Inc.', 64.13, 0.31, 0.49, '2011-09-01'),
(6,'AT&T Inc.', 31.61, -0.48, -1.54, '2011-09-01'),
(7,'Boeing Co.', 75.43, 0.53,  0.71, '2011-09-01'),
(8,'Caterpillar Inc.', 67.27, 0.92, 1.39, '2011-09-01'),
(9,'Citigroup, Inc.', 49.37, 0.02, 0.04, '2011-09-01'),
(10,'E.I. du Pont de Nemours and Company', 40.48, 0.51, 1.28, '2011-09-01'),
(11,'Exxon Mobil Corp', 68.1,  -0.43, -0.64, '2011-09-01'),
(12,'General Electric Company', 34.14, -0.08, -0.23, '2011-09-01'),
(13,'General Motors Corporation', 30.27, 1.09, 3.74, '2011-09-01'),
(14,'Hewlett-Packard Co.', 36.53, -0.03, -0.08, '2011-09-01'),
(15,'Honeywell Intl Inc', 38.77, 0.05, 0.13, '2011-09-01'),
(16,'Intel Corporation', 19.88, 0.31, 1.58, '2011-09-01'),
(17,'International Business Machines', 81.41, 0.44, 0.54, '2011-09-01'),
(18,'Johnson & Johnson', 64.72, 0.06, 0.09, '2011-09-01'),
(19,'JP Morgan & Chase & Co', 45.73, 0.07, 0.15, '2011-09-01'),
(20,'McDonald\'s Corporation', 36.76, 0.86, 2.40, '2011-09-01'),
(21,'Merck & Co., Inc.', 40.96, 0.41, 1.01, '2011-09-01'),
(22,'Microsoft Corporation', 25.84, 0.14, 0.54, '2011-09-01'),
(23,'Pfizer Inc', 27.96, 0.4, 1.45, '2011-09-01'),
(24,'The Coca-Cola Company', 45.07, 0.26, 0.58, '2011-09-01'),
(25,'The Home Depot, Inc.', 34.64, 0.35, 1.02, '2011-09-01'),
(26,'The Procter & Gamble Company', 61.91, 0.01, 0.02, '2011-09-01'),
(27,'United Technologies Corporation', 63.26, 0.55, 0.88, '2011-09-01'),
(28,'Verizon Communications', 35.57, 0.39, 1.11, '2011-09-01'),
(29,'Wal-Mart Stores, Inc.', 45.45, 0.73, 1.63, '2011-09-01');