-- --------------------------------------------------------
-- Create Database
-- --------------------------------------------------------

CREATE DATABASE IF NOT EXISTS HR;
USE HR;

-- --------------------------------------------------------
-- Drop Tables (so script can run again safely)
-- --------------------------------------------------------

DROP TABLE IF EXISTS JOB_HISTORY;
DROP TABLE IF EXISTS EMPLOYEES;
DROP TABLE IF EXISTS DEPARTMENTS;
DROP TABLE IF EXISTS JOBS;
DROP TABLE IF EXISTS LOCATIONS;
DROP TABLE IF EXISTS COUNTRIES;
DROP TABLE IF EXISTS REGIONS;

-- --------------------------------------------------------
-- 1. REGIONS TABLE
-- --------------------------------------------------------

CREATE TABLE REGIONS (
    REGION_ID INT PRIMARY KEY,
    REGION_NAME VARCHAR(25)
);

INSERT INTO REGIONS VALUES
(1,'Europe'),
(2,'Americas'),
(3,'Asia'),
(4,'Middle East and Africa');

-- --------------------------------------------------------
-- 2. COUNTRIES TABLE
-- --------------------------------------------------------

CREATE TABLE COUNTRIES (
    COUNTRY_ID CHAR(2) PRIMARY KEY,
    COUNTRY_NAME VARCHAR(40),
    REGION_ID INT,
    FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID)
);

INSERT INTO COUNTRIES VALUES
('IT','Italy',1),
('JP','Japan',3),
('US','United States of America',2),
('UK','United Kingdom',1),
('IN','India',3),
('CA','Canada',2),
('DE','Germany',1),
('CH','Switzerland',1),
('CN','China',3),
('BR','Brazil',2);

-- --------------------------------------------------------
-- 3. LOCATIONS TABLE
-- --------------------------------------------------------

CREATE TABLE LOCATIONS (
    LOCATION_ID INT PRIMARY KEY,
    STREET_ADDRESS VARCHAR(40),
    POSTAL_CODE VARCHAR(12),
    CITY VARCHAR(30),
    STATE_PROVINCE VARCHAR(25),
    COUNTRY_ID CHAR(2),
    FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
);

INSERT INTO LOCATIONS VALUES
(1000,'1297 Via Cola di Rie','00989','Roma',NULL,'IT'),
(1100,'93091 Calle della Testa','10934','Venice',NULL,'IT'),
(1200,'2017 Shinjuku-ku','1689','Tokyo','Tokyo Prefecture','JP'),
(1300,'9450 Kamiya-cho','6823','Hiroshima',NULL,'JP'),
(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US'),
(1500,'2011 Interiors Blvd','99236','South San Francisco','California','US'),
(1700,'2004 Charade Rd','98199','Seattle','Washington','US'),
(1800,'147 Spadina Ave','M5V 2L7','Toronto','Ontario','CA'),
(2100,'1298 Vileparle (E)','490231','Mumbai','Maharashtra','IN');

-- --------------------------------------------------------
-- 4. JOBS TABLE
-- --------------------------------------------------------

CREATE TABLE JOBS (
    JOB_ID VARCHAR(10) PRIMARY KEY,
    JOB_TITLE VARCHAR(35),
    MIN_SALARY INT,
    MAX_SALARY INT
);

INSERT INTO JOBS VALUES
('AD_PRES','President',20000,40000),
('AD_VP','Administration Vice President',15000,30000),
('IT_PROG','Programmer',4000,10000),
('SA_MAN','Sales Manager',10000,20000),
('SA_REP','Sales Representative',6000,12000),
('HR_REP','Human Resources Representative',4000,9000),
('FI_ACCOUNT','Accountant',4200,9000),
('PU_CLERK','Purchasing Clerk',2500,5500);

-- --------------------------------------------------------
-- 5. DEPARTMENTS TABLE
-- --------------------------------------------------------

CREATE TABLE DEPARTMENTS (
    DEPARTMENT_ID INT PRIMARY KEY,
    DEPARTMENT_NAME VARCHAR(30),
    MANAGER_ID INT,
    LOCATION_ID INT,
    FOREIGN KEY (LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
);

INSERT INTO DEPARTMENTS VALUES
(10,'Administration',200,1700),
(20,'Marketing',201,1800),
(30,'Purchasing',114,1700),
(40,'Human Resources',203,2100),
(50,'Shipping',121,1500),
(60,'IT',103,1400),
(80,'Sales',145,1500),
(90,'Executive',100,1700);

-- --------------------------------------------------------
-- 6. EMPLOYEES TABLE
-- --------------------------------------------------------

CREATE TABLE EMPLOYEES (
    EMPLOYEE_ID INT PRIMARY KEY,
    FIRST_NAME VARCHAR(20),
    LAST_NAME VARCHAR(25),
    EMAIL VARCHAR(25),
    PHONE_NUMBER VARCHAR(20),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(10),
    SALARY DECIMAL(8,2),
    COMMISSION_PCT DECIMAL(2,2),
    MANAGER_ID INT,
    DEPARTMENT_ID INT,
    FOREIGN KEY (JOB_ID) REFERENCES JOBS(JOB_ID),
    FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);

INSERT INTO EMPLOYEES VALUES
(100,'Steven','King','SKING','515.123.4567','1987-06-17','AD_PRES',24000,NULL,NULL,90),
(101,'Neena','Kochhar','NKOCHHAR','515.123.4568','1989-09-21','AD_VP',17000,NULL,100,90),
(102,'Lex','De Haan','LDEHAAN','515.123.4569','1993-01-13','AD_VP',17000,NULL,100,90),
(103,'Alexander','Hunold','AHUNOLD','590.423.4567','1990-01-03','IT_PROG',9000,NULL,102,60),
(104,'Bruce','Ernst','BERNST','590.423.4568','1991-05-21','IT_PROG',6000,NULL,103,60),
(145,'John','Russell','JRUSSEL','011.44.1344.429268','1996-10-01','SA_MAN',14000,0.40,100,80),
(146,'Karen','Partners','KPARTNER','011.44.1344.467268','1997-01-05','SA_MAN',13500,0.30,100,80);

-- --------------------------------------------------------
-- 7. JOB HISTORY TABLE
-- --------------------------------------------------------

CREATE TABLE JOB_HISTORY (
    EMPLOYEE_ID INT,
    START_DATE DATE,
    END_DATE DATE,
    JOB_ID VARCHAR(10),
    DEPARTMENT_ID INT,
    PRIMARY KEY (EMPLOYEE_ID, START_DATE),  
    FOREIGN KEY (EMPLOYEE_ID) REFERENCES EMPLOYEES(EMPLOYEE_ID)
);

INSERT INTO JOB_HISTORY VALUES
(102,'1993-01-13','1998-07-24','IT_PROG',60);

-- --------------------------------------------------------
-- Show Tables
-- --------------------------------------------------------

SHOW TABLES;

-- View data
SELECT * FROM REGIONS;
SELECT * FROM COUNTRIES;
SELECT * FROM LOCATIONS;
SELECT * FROM DEPARTMENTS;
SELECT * FROM JOBS;
SELECT * FROM EMPLOYEES;