-- Project 8(12 Tables )
-- ZOMATO DATABASE PROJECT

-- Creating the Database ZOMATO DATABASE PROJECT
CREATE DATABASE ZOMATO_DATABASE_PROJECT;
USE ZOMATO_DATABASE_PROJECT;


-- Create a table named RESTAURANT
-- To store restaurant details.
-- Columns:
-- RESTAURANT_ID – Primary Key Number(10)
-- NAME – Not Null Varchar2(100)
-- PHONE – Unique Varchar2(10)
-- EMAIL – Unique Varchar2(100)
-- CITY – Not Null Varchar2(100)
-- AREA – Not Null Varchar2(100)
-- RATING – Check (RATING BETWEEN 1 AND 5)
-- CREATED_DATE – Default SYSDATE

CREATE TABLE RESTAURANT(
    RESTAURANT_ID NUMBER(10) PRIMARY KEY,
    RESTAURANT_NAME VARCHAR2(100) NOT NULL,
    PHONE VARCHAR2(10) UNIQUE,
    EMAIL VARCHAR2(100) UNIQUE,
    CITY VARCHAR2(100) NOT NULL,
    AREA VARCHAR2(100) NOT NULL,
    RATING NUMBER(3,2) CHECK (RATING BETWEEN 1 AND 5),
    CREATED_DATE DATE DEFAULT SYSDATE
);

-- Create a table named CATEGORY
-- To store food categories like "Chinese", "Indian", etc.
-- Columns:
-- CATEGORY_ID – Primary Key Number(10)
-- CATEGORY_NAME – Not Null Varchar2(100)
-- DESCRIPTION Varchar2(200)

CREATE TABLE CATEGORY(
    CATEGORY_ID NUMBER(10) PRIMARY KEY,
    CATEGORY_NAME VARCHAR2(100) NOT NULL,
    DESCRIPTION VARCHAR2(200)
);

-- Create a table named RESTAURANT_CATEGORY
-- To store which restaurant serves which category (many-to-many relation).
-- Columns:
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- CATEGORY_ID – Foreign Key references CATEGORY
CREATE TABLE RESTAURANT_CATEGORY(
    RESTAURANT_ID NUMBER(10), 
    CATEGORY_ID NUMBER(10),
    FOREIGN KEY (RESTAURANT_ID) REFERENCES RESTAURANT(RESTAURANT_ID),
    FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORY(CATEGORY_ID)
);


-- Create a table named MENU
-- To store each restaurant’s menu information.
-- Columns:
-- MENU_ID – Primary Key Number(10)
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- MENU_NAME – Not Null Varchar2(100)
-- CREATED_DATE – Default SYSDATE
CREATE TABLE MENU(
    MENU_ID NUMBER(10) PRIMARY KEY,
    RESTAURANT_ID NUMBER(10),
    MENU_NAME VARCHAR2(100) NOT NULL,
    CREATED_DATE DATE DEFAULT SYSDATE,
    FOREIGN KEY (RESTAURANT_ID) REFERENCES RESTAURANT(RESTAURANT_ID)
);


-- Create a table named MENU_ITEM
-- To store food items under each menu.
-- Columns:
-- ITEM_ID – Primary Key Number(10)
-- MENU_ID – Foreign Key references MENU
-- ITEM_NAME – Not Null Varchar2(100)
-- PRICE – Check (PRICE > 0)
-- AVAILABLE_STATUS – Default ‘YES’, Check (Available_Status IN ('YES', 'NO'))
CREATE TABLE MENU_ITEM(
    ITEM_ID NUMBER(10) PRIMARY KEY,
    MENU_ID NUMBER(10),
    ITEM_NAME VARCHAR2(100) NOT NULL,
    PRICE NUMBER(10,2) CHECK (PRICE > 0),
    AVAILABLE_STATUS VARCHAR2(3) DEFAULT 'YES' CHECK (AVAILABLE_STATUS IN ('YES', 'NO')),
    FOREIGN KEY (MENU_ID) REFERENCES MENU(MENU_ID)
);


-- Create a table named CUSTOMER
-- To store customer details.
-- Columns:
-- CUSTOMER_ID – Primary Key Number(10)
-- FULL_NAME – Not Null Varchar2(100)
-- PHONE – Unique Varchar2(10)
-- EMAIL – Unique Varchar2(100)
-- GENDER – Check (Gender IN ('M','F','O'))
-- REGISTRATION_DATE – Default SYSDATE
CREATE TABLE CUSTOMER(
    CUSTOMER_ID NUMBER(10) PRIMARY KEY,
    FULL_NAME VARCHAR2(100) NOT NULL,
    PHONE VARCHAR2(10) UNIQUE,
    EMAIL VARCHAR2(100) UNIQUE,
    GENDER VARCHAR2(1) CHECK (GENDER IN ('M','F','O')),
    REGISTRATION_DATE DATE DEFAULT SYSDATE  
);


-- Create a table named ADDRESS
-- To store multiple addresses for each customer.
-- Columns:
-- ADDRESS_ID – Primary Key Number(10)
-- CUSTOMER_ID – Foreign Key references CUSTOMER
-- HOUSE_NO – Not Null Varchar2(50)
-- STREET – Not Null Varchar2(100)
-- CITY – Not Null Varchar2(100)
-- PINCODE – Not Null Varchar2(10)
-- ADDRESS_TYPE – Check (Address_Type IN ('HOME','OFFICE','OTHER'))
CREATE TABLE ADDRESS(
    ADDRESS_ID NUMBER(10) PRIMARY KEY,
    CUSTOMER_ID NUMBER(10),
    HOUSE_NO VARCHAR2(50) NOT NULL,
    STREET VARCHAR2(100) NOT NULL,
    CITY VARCHAR2(100) NOT NULL, 
    PINCODE VARCHAR2(10) NOT NULL,
    ADDRESS_TYPE VARCHAR2(6) CHECK (ADDRESS_TYPE IN ('HOME', 'OFFICE', 'OTHER')),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
)



-- Create a table named DELIVERY_PERSON
-- To store details of delivery boys.
-- Columns:
-- DELIVERY_ID – Primary Key Number(10)
-- NAME – Not Null Varchar2(100)
-- PHONE – Unique Varchar2(10)
-- VEHICLE_NO – Unique Varchar2(20)
-- STATUS – Default ‘AVAILABLE’, Check (STATUS IN ('AVAILABLE','BUSY'))
CREATE TABLE DELIVERY_PERSON(
    DELIVERY_ID NUMBER(10) PRIMARY KEY,
    PERSON_NAME VARCHAR(10) NOT NULL,
    PHONE VARCHAR2(10) UNIQUE,
    VEHICLE_NO VARCHAR2(20) UNIQUE,
    STATUS VARCHAR2(9) DEFAULT 'AVAILABLE' CHECK (STATUS IN ('AVAILABLE', 'BUSY')),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID)
);

-- Create a table named ORDERS
-- To store customer order details.Columns:
-- ORDER_ID – Primary Key Number(10)
-- CUSTOMER_ID – Foreign Key references CUSTOMER
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- DELIVERY_ID – Foreign Key references DELIVERY_PERSON
-- ORDER_DATE – Default SYSDATE
-- TOTAL_AMOUNT – Check (TOTAL_AMOUNT >= 0)
-- ORDER_STATUS – Default ‘PLACED’, Check (Order_Status IN ('PLACED','ONWAY','DELIVERED','CANCELLED'))
CREATE TABLE ORDERS(
    ORDER_ID NUMBER(10) PRIMARY KEY,
    CUSTOMER_ID NUMBER(10),
    RESTAURANT_ID NUMBER(10),
    DELIVERY_ID NUMBER(10),
    ORDER_DATE DATE DEFAULT SYSDATE,    
    TOTAL_AMOUNT NUMBER(10,2) CHECK (TOTAL_AMOUNT >= 0),
    ORDER_STATUS VARCHAR2(10) DEFAULT 'PLACED' CHECK (ORDER_STATUS IN ('PLACED', 'ONWAY', 'DELIVERED', 'CANCELLED')),
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),
    FOREIGN KEY (RESTAURANT_ID) REFERENCES RESTAURANT(RESTAURANT_ID),
    FOREIGN KEY (DELIVERY_ID) REFERENCES DELIVERY_PERSON(DELIVERY_ID)
);



-- Create a table named ORDER_ITEM
-- To store all items under each order.
-- Columns:
-- ORDER_ID – Foreign Key references ORDERS
-- ITEM_ID – Foreign Key references MENU_ITEM
-- QUANTITY – Check (QUANTITY > 0)
-- PRICE – Check (PRICE > 0)
-- Combination of ORDER_ID and ITEM_ID – Primary Key
CREATE TABLE ORDER_ITEM(
    ORDER_ID NUMBER(10),
    ITEM_ID NUMBER(10),
    QUANTITY NUMBER(10) CHECK (QUANTITY > 0),
    PRICE NUMBER(10,2) CHECK (PRICE > 0),
    PRIMARY KEY (ORDER_ID, ITEM_ID),
    FOREIGN KEY (ORDER_ID) REFERENCES ORDERS(ORDER_ID), 
    FOREIGN KEY (ITEM_ID) REFERENCES MENU_ITEM(ITEM_ID)
);





-- Create a table named PAYMENT
-- To store payment details for each order.Columns:
-- PAYMENT_ID – Primary Key Number(10)
-- ORDER_ID – Foreign Key references ORDERS
-- PAYMENT_MODE – Check (Payment_Mode IN ('CARD','CASH','UPI'))
-- PAYMENT_DATE – Default SYSDATE
-- AMOUNT – Check (AMOUNT >= 0)
-- PAYMENT_STATUS – Default ‘PENDING’, Check (Payment_Status IN ('SUCCESS','FAILED','PENDING'))
CREATE TABLE PAYMENT(
    PAYMENT_ID NUMBER(10) PRIMARY KEY,
    ORDER_ID NUMBER(10),
    PAYMENT_MODE VARCHAR2(4) CHECK (PAYMENT_MODE IN ('CARD', 'CASH', 'UPI')),
    PAYMENT_DATE DATE DEFAULT SYSDATE,
    AMOUNT NUMBER(10,2) CHECK (AMOUNT >= 0),
    PAYMENT_STATUS VARCHAR2(7) DEFAULT 'PENDING' CHECK (PAYMENT_STATUS IN ('SUCCESS', 'FAILED', 'PENDING')),
    FOREIGN KEY (ORDER_ID) REFERENCES ORDERS(ORDER_ID)
);


-- Create a table named REVIEW
-- To store customer reviews for restaurants.
-- Columns:
-- REVIEW_ID – Primary Key Number(10)
-- CUSTOMER_ID – Foreign Key references CUSTOMER
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- RATING – Check (Rating BETWEEN 1 AND 5)
-- COMMENTS – Varchar2(200)
-- REVIEW_DATE – Default SYSDATE

CREATE TABLE REVIEW(
    REVIEW_ID NUMBER(10) PRIMARY KEY,
    CUSTOMER_ID NUMBER(10),
    RESTAURANT_ID NUMBER(10),
    RATING NUMBER(3,2) CHECK (RATING BETWEEN 1 AND 5),
    COMMENTS VARCHAR2(200),
    REVIEW_DATE DATE DEFAULT SYSDATE,
    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),
    FOREIGN KEY (RESTAURANT_ID) REFERENCES RESTAURANT(RESTAURANT_ID)
);


-- =====================
-- RESTAURANT
-- =====================
INSERT INTO RESTAURANT (NAME, PHONE, EMAIL, CITY, AREA, RATING) VALUES
('Spice Hub','9876543210','spice@gmail.com','Pune','FC Road',4.5),
('Pizza Point','9876543211','pizza@gmail.com','Mumbai','Andheri',4.2),
('Burger Town','9876543212','burger@gmail.com','Nashik','College Road',4.0),
('Food Corner','9876543213','food@gmail.com','Pune','Baner',4.3),
('Tasty Treat','9876543214','tasty@gmail.com','Mumbai','Dadar',4.1),
('Cafe Delight','9876543215','cafe@gmail.com','Nashik','Gangapur',4.4),
('Urban Bites','9876543216','urban@gmail.com','Pune','Kothrud',4.2),
('Desi Dhaba','9876543217','dhaba@gmail.com','Mumbai','Dadar',4.6),
('Quick Eats','9876543218','quick@gmail.com','Nashik','CIDCO',3.9),
('Royal Feast','9876543219','royal@gmail.com','Pune','Shivaji Nagar',4.8);

-- =====================
-- CATEGORY
-- =====================
INSERT INTO CATEGORY (CATEGORY_NAME) VALUES
('Indian'),('Italian'),('Chinese'),('Fast Food'),
('South Indian'),('Dessert'),('Beverages'),
('Street Food'),('Healthy'),('Seafood');

-- =====================
-- RESTAURANT_CATEGORY
-- =====================
INSERT INTO RESTAURANT_CATEGORY VALUES
(1,1),(2,2),(3,4),(4,1),(5,6),
(6,7),(7,8),(8,1),(9,4),(10,1);

-- =====================
-- MENU
-- =====================
INSERT INTO MENU (RESTAURANT_ID, MENU_NAME) VALUES
(1,'Main Menu'),
(2,'Pizza Menu'),
(3,'Burger Menu'),
(4,'Special Menu'),
(5,'Dessert Menu'),
(6,'Cafe Menu'),
(7,'Snacks Menu'),
(8,'Dhaba Menu'),
(9,'Quick Menu'),
(10,'Royal Menu');

-- =====================
-- MENU_ITEM
-- =====================
INSERT INTO MENU_ITEM (MENU_ID, ITEM_NAME, PRICE) VALUES
(1,'Paneer Butter Masala',250),
(1,'Dal Fry',150),
(2,'Margherita Pizza',300),
(2,'Farmhouse Pizza',450),
(3,'Veg Burger',120),
(3,'Cheese Burger',150),
(4,'Chicken Tandoori',400),
(5,'Ice Cream',100),
(6,'Cold Coffee',120),
(7,'Sandwich',80),
(8,'Butter Roti',50),
(9,'French Fries',100),
(10,'Biryani',300);

-- =====================
-- CUSTOMER
-- =====================
INSERT INTO CUSTOMER (NAME, PHONE) VALUES
('Vivek','9000000001'),
('Rahul','9000000002'),
('Sneha','9000000003'),
('Amit','9000000004'),
('Pooja','9000000005'),
('Karan','9000000006'),
('Neha','9000000007'),
('Ravi','9000000008'),
('Anjali','9000000009'),
('Suresh','9000000010');

-- =====================
-- ADDRESS
-- =====================
INSERT INTO ADDRESS (CUSTOMER_ID, CITY) VALUES
(1,'Pune'),
(2,'Mumbai'),
(3,'Nashik'),
(4,'Pune'),
(5,'Mumbai'),
(6,'Nashik'),
(7,'Pune'),
(8,'Mumbai'),
(9,'Nashik'),
(10,'Pune');

-- =====================
-- DELIVERY_PERSON
-- =====================
INSERT INTO DELIVERY_PERSON (NAME, PHONE) VALUES
('Amit','8000000001'),
('Rohit','8000000002'),
('Sanjay','8000000003'),
('Vikas','8000000004'),
('Raj','8000000005'),
('Deepak','8000000006'),
('Arjun','8000000007'),
('Manoj','8000000008'),
('Nikhil','8000000009'),
('Yash','8000000010');

-- =====================
-- ORDERS
-- =====================
INSERT INTO ORDERS (CUSTOMER_ID, RESTAURANT_ID, DELIVERY_ID, TOTAL_AMOUNT) VALUES
(1,1,1,400),
(2,2,2,750),
(3,3,3,150),
(4,4,4,500),
(5,5,5,300),
(6,6,6,200),
(7,7,7,350),
(8,8,8,600),
(9,9,9,250),
(10,10,10,800);

-- =====================
-- ORDER_ITEM
-- =====================
INSERT INTO ORDER_ITEM VALUES
(1,1),(1,2),
(2,3),(2,4),
(3,5),
(4,7),
(5,8),
(6,9),
(7,10),
(8,11),
(9,12),
(10,13);

-- =====================
-- PAYMENT
-- =====================
INSERT INTO PAYMENT (ORDER_ID, MODE) VALUES
(1,'UPI'),
(2,'CARD'),
(3,'CASH'),
(4,'UPI'),
(5,'CARD'),
(6,'CASH'),
(7,'UPI'),
(8,'CARD'),
(9,'UPI'),
(10,'CASH');

-- =====================
-- REVIEW
-- =====================
INSERT INTO REVIEW (CUSTOMER_ID, RESTAURANT_ID, RATING, COMMENTS) VALUES
(1,1,5,'Excellent'),
(2,2,4,'Good'),
(3,3,3.5,'Average'),
(4,4,4.5,'Nice'),
(5,5,3,'Okay'),
(6,6,4,'Tasty'),
(7,7,4.2,'Good'),
(8,8,5,'Best'),
(9,9,3.8,'Fine'),
(10,10,5,'Amazing');