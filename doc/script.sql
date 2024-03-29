

CREATE TABLE shop_group (
  ID int(11) NOT NULL AUTO_INCREMENT,
  NAME varchar(45) NOT NULL,
  PRIMARY KEY (ID)
) 




CREATE TABLE shop (
  ID int(11) NOT NULL AUTO_INCREMENT,
  NUMBER int(11) NOT NULL,
  SQRT_FEET decimal(11,0) NOT NULL,
  RENT_PER_SQRT_FEET decimal(11,0) NOT NULL,
  GROUP_ID int(11) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_GROUP_ID_idx (GROUP_ID),
  CONSTRAINT FK_GROUP_ID FOREIGN KEY (GROUP_ID) REFERENCES shop_group (ID) ON DELETE NO ACTION ON UPDATE NO ACTION
) 





CREATE TABLE tenant (
  ID int(11) NOT NULL AUTO_INCREMENT,
  SHOP_NAME varchar(45) NOT NULL,
  CONTACT_PERSON_NAME varchar(45) NOT NULL,
  MOBILE_NUMBER int(10) DEFAULT NULL,
  LAND_LINE_NUMBER int(15) DEFAULT NULL,
  STREET varchar(45) DEFAULT NULL,
  CITY varchar(45) DEFAULT NULL,
  STATE varchar(45) DEFAULT NULL,
  COUNTRY varchar(45) DEFAULT NULL,
  PINCODE int(6) DEFAULT NULL,
  SHOP_ID int(11) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_SHOP_ID_idx (SHOP_ID),
  CONSTRAINT FK_SHOP_ID FOREIGN KEY (SHOP_ID) REFERENCES shop (ID) ON DELETE NO ACTION ON UPDATE NO ACTION
)





CREATE TABLE rent (
  ID int(11) NOT NULL AUTO_INCREMENT,
  ADVANCE_AMOUNT decimal(10,0) DEFAULT NULL,
  EXCESS_AMOUNT decimal(10,0) DEFAULT NULL,
  BOOKING_DATE date DEFAULT NULL,
  SHOP_ID int(11) DEFAULT NULL,
  TENANT_ID int(11) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_TENANT_ID_idx (TENANT_ID),
  KEY FK_SHOP_RENT_ID_idx (SHOP_ID),
  CONSTRAINT FK_SHOP_RENT_ID FOREIGN KEY (SHOP_ID) REFERENCES shop (ID) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT FK_TENANT_ID FOREIGN KEY (TENANT_ID) REFERENCES tenant (ID) ON DELETE NO ACTION ON UPDATE NO ACTION
) 




CREATE TABLE schedule (
  ID int(11) NOT NULL,
  LAST_DUE_DATE date DEFAULT NULL,
  DUE_DATE date DEFAULT NULL,
  DUE_AMOUNT decimal(10,0) DEFAULT NULL,
  PAYMENT_DATE date DEFAULT NULL,
  PAYMENT_AMOUNT decimal(10,0) DEFAULT NULL,
  RENT_ID int(11) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_RENT_ID_idx (RENT_ID),
  CONSTRAINT FK_RENT_ID FOREIGN KEY (RENT_ID) REFERENCES rent (ID) ON DELETE NO ACTION ON UPDATE NO ACTION
) 


CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  USER_NAME varchar(30) NOT NULL,
  PASSWORD varchar(30) NOT NULL,
  FIRST_NAME varchar(30) NOT NULL,
  MIDDLE_NAME varchar(30) DEFAULT NULL,
  LAST_NAME varchar(30) DEFAULT NULL,
  EMAIL varchar(30) DEFAULT NULL,
  CREATED_BY varchar(30) DEFAULT NULL,
  CREATED_DATE date DEFAULT NULL,
  UPDATED_BY varchar(30) DEFAULT NULL,
  UPDATED_DATE date DEFAULT NULL,
  PRIMARY KEY (id)
) 

