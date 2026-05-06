
-- Project 8(12 Tables )
-- ZOMATO DATABASE PROJECT

-- Create a table named RESTAURANT
-- To store restaurant details.
-- Columns:
-- RESTAURANT_ID – Primary Key Number(10)
-- NAME – Not Null Varchar2(100)
-- PHONE – Unique Varchar2(15)
-- EMAIL – Unique Varchar2(100)
-- CITY – Not Null Varchar2(100)
-- AREA – Not Null Varchar2(100)
-- RATING – Check (RATING BETWEEN 1 AND 5)
-- CREATED_DATE – Default SYSDATE

-- Create a table named CATEGORY
-- To store food categories like "Chinese", "Indian", etc.
-- Columns:
-- CATEGORY_ID – Primary Key Number(10)
-- CATEGORY_NAME – Not Null Varchar2(100)
-- DESCRIPTION Varchar2(200)

-- Create a table named RESTAURANT_CATEGORY

-- To store which restaurant serves which category (many-to-many relation).
-- Columns:
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- CATEGORY_ID – Foreign Key references CATEGORY

-- Create a table named MENU

-- To store each restaurant’s menu information.
-- Columns:
-- MENU_ID – Primary Key Number(10)
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- MENU_NAME – Not Null Varchar2(100)
-- CREATED_DATE – Default SYSDATE

-- Create a table named MENU_ITEM
-- To store food items under each menu.
-- Columns:
-- ITEM_ID – Primary Key Number(10)
-- MENU_ID – Foreign Key references MENU
-- ITEM_NAME – Not Null Varchar2(100)
-- PRICE – Check (PRICE > 0)
-- AVAILABLE_STATUS – Default ‘YES’, Check (Available_Status IN ('YES', 'NO'))

-- Create a table named CUSTOMER
-- To store customer details.
-- Columns:
-- CUSTOMER_ID – Primary Key Number(10)
-- FULL_NAME – Not Null Varchar2(100)
-- PHONE – Unique Varchar2(15)
-- EMAIL – Unique Varchar2(100)
-- GENDER – Check (Gender IN ('M','F','O'))
-- REGISTRATION_DATE – Default SYSDATE

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

-- Create a table named DELIVERY_PERSON
-- To store details of delivery boys.
-- Columns:
-- DELIVERY_ID – Primary Key Number(10)
-- NAME – Not Null Varchar2(100)
-- PHONE – Unique Varchar2(15)
-- VEHICLE_NO – Unique Varchar2(20)
-- STATUS – Default ‘AVAILABLE’, Check (STATUS IN ('AVAILABLE','BUSY'))


-- Create a table named ORDERS
-- To store customer order details.Columns:
-- ORDER_ID – Primary Key Number(10)
-- CUSTOMER_ID – Foreign Key references CUSTOMER
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- DELIVERY_ID – Foreign Key references DELIVERY_PERSON
-- ORDER_DATE – Default SYSDATE
-- TOTAL_AMOUNT – Check (TOTAL_AMOUNT >= 0)
-- ORDER_STATUS – Default ‘PLACED’, Check (Order_Status IN ('PLACED','ONWAY','DELIVERED','CANCELLED'))


-- Create a table named ORDER_ITEM
-- To store all items under each order.
-- Columns:
-- ORDER_ID – Foreign Key references ORDERS
-- ITEM_ID – Foreign Key references MENU_ITEM
-- QUANTITY – Check (QUANTITY > 0)
-- PRICE – Check (PRICE > 0)
-- Combination of ORDER_ID and ITEM_ID – Primary Key


-- Create a table named PAYMENT
-- To store payment details for each order.Columns:
-- PAYMENT_ID – Primary Key Number(10)
-- ORDER_ID – Foreign Key references ORDERS
-- PAYMENT_MODE – Check (Payment_Mode IN ('CARD','CASH','UPI'))
-- PAYMENT_DATE – Default SYSDATE
-- AMOUNT – Check (AMOUNT >= 0)
-- PAYMENT_STATUS – Default ‘PENDING’, Check (Payment_Status IN ('SUCCESS','FAILED','PENDING'))



-- Create a table named REVIEW
-- To store customer reviews for restaurants.
-- Columns:
-- REVIEW_ID – Primary Key Number(10)
-- CUSTOMER_ID – Foreign Key references CUSTOMER
-- RESTAURANT_ID – Foreign Key references RESTAURANT
-- RATING – Check (Rating BETWEEN 1 AND 5)
-- COMMENTS – Varchar2(200)
-- REVIEW_DATE – Default SYSDATE


-- Relationship 

-- 1)CUSTOMER→ORDERS 1-to-Many
-- 2)RESTAURANT→ORDERS	1-to-Many
-- 3)MENU_CATEGORY→MENU_ITEM 1-to-Many
-- RESTAURANT→MENU_ITEM	1-to-Many
-- ORDERS→ORDER_DETAILS 1-to-Many 
-- MENU_ITEM →ORDER_DETAILS. 1-to-Many
-- ORDERS→PAYMENT  1-to-1
-- DELIVERY_PERSON	→DELIVERY 1-to-Many
-- ORDERS→DELIVERY 1-to-1
-- CUSTOMER→REVIEW 1-to-Many
-- RESTAURANT→REVIEW 1-to-Many
-- COUPON→ORDER_COUPON 1-to-Many
