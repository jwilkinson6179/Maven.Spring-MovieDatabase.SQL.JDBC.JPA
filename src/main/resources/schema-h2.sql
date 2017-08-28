DROP TABLE PERSON;

CREATE TABLE PERSON (
  ID INT NOT NULL AUTO_INCREMENT,
  FIRST_NAME VARCHAR2(255) NOT NULL DEFAULT '',
  LAST_NAME VARCHAR2(255) NOT NULL DEFAULT '',
  MOBILE VARCHAR2(20) NOT NULL DEFAULT '',
  BIRTHDAY DATE DEFAULT NULL,
  PRIMARY KEY (ID));

DROP TABLE HOME;

CREATE TABLE HOME (
  ID INT NOT NULL AUTO_INCREMENT,
  ADDRESS VARCHAR2(255) not null default '',
  HOMENUMBER varchar2(255) NOT NULL DEFAULT '',
  PRIMARY KEY (ID)
);


-- Tables for in-class example

DROP TABLE cars;

CREATE TABLE cars (
  id INT NOT NULL AUTO_INCREMENT,
  make VARCHAR2(50) NOT NULL DEFAULT '',
  model VARCHAR2(50) NOT NULL DEFAULT '',
  year VARCHAR2(5) NOT NULL DEFAULT '01907',
  PRIMARY KEY (id),
  CONSTRAINT 'unique_make_model_year' UNIQUE (make, model, year)
);

DROP TABLE auto_prices;

CREATE TABLE auto_prices (
  id INT PRIMARY KEY AUTO_INCREMENT,
  car_id INT REFERENCES car(id),
  package VARCHAR2(15) NOT NULL,
  price NUMBER(10,2) NOT NULL CHECK(price > 0),
  CONSTRAINT 'unique_package_per_car' UNIQUE (car_id, package)
);

DROP SEQUENCE hibernate_sequence;

CREATE SEQUENCE hibernate_sequence;