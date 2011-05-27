CREATE SCHEMA `extjs` ;

USE `extjs` ;



-- -----------------------------------------------------
-- Table `extjs`.`COMPANY`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `extjs`.`COMPANY` ;

CREATE  TABLE IF NOT EXISTS `extjs`.`COMPANY` (

  `COMPANY_ID` INT NOT NULL AUTO_INCREMENT ,

  `COMPANY_NAME` VARCHAR(45) NOT NULL ,

  `COMPANY_PRICE` DECIMAL NOT NULL ,

  `COMPANY_CHANGE` DECIMAL NOT NULL ,

  `COMPANY_PCT_CHANGE` DECIMAL NOT NULL ,

  `COMPANY_LAST_CHANGE` DATE NOT NULL ,

  PRIMARY KEY (`COMPANY_ID`) )

ENGINE = InnoDB;