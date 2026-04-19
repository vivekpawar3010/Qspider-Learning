-- CREATE TABLE STUDENT (
--     STUDENT_ID     NUMBER PRIMARY KEY,
--     STUDENT_NAME   VARCHAR2(50),
--     GENDER         VARCHAR2(10),
--     DEPARTMENT     VARCHAR2(30),
--     YEAR_OF_STUDY  NUMBER,
--     MARKS          NUMBER,
--     CITY           VARCHAR2(30),
--     ADMISSION_DATE DATE
-- );
-- INSERT INTO STUDENT VALUES (101, 'AMIT',   'MALE',   'COMPUTER',    1, 78, 'DELHI',       DATE '2023-07-01');
-- INSERT INTO STUDENT VALUES (102, 'RIYA',   'FEMALE', 'COMPUTER',    2, 85, 'MUMBAI',      DATE '2022-06-15');
-- INSERT INTO STUDENT VALUES (103, 'KARAN',  'MALE',   'MECHANICAL',  3, 65, 'PUNE',        DATE '2021-08-20');
-- INSERT INTO STUDENT VALUES (104, 'NEHA',   'FEMALE', 'ELECTRICAL',  4, 90, 'DELHI',       DATE '2020-07-10');
-- INSERT INTO STUDENT VALUES (105, 'RAHUL',  'MALE',   'COMPUTER',    2, 55, 'CHENNAI',     DATE '2022-06-18');
-- INSERT INTO STUDENT VALUES (106, 'SNEHA',  'FEMALE', 'MECHANICAL',  1, 88, 'BANGALORE',   DATE '2023-07-05');
-- INSERT INTO STUDENT VALUES (107, 'ARJUN',  'MALE',   'ELECTRICAL',  3, 72, 'HYDERABAD',   DATE '2021-08-25');
-- INSERT INTO STUDENT VALUES (108, 'POOJA',  'FEMALE', 'COMPUTER',    4, 95, 'MUMBAI',      DATE '2020-07-12');
-- INSERT INTO STUDENT VALUES (109, 'VIKAS',  'MALE',   'CIVIL',       2, 60, 'JAIPUR',      DATE '2022-06-22');
-- INSERT INTO STUDENT VALUES (110, 'ANJALI', 'FEMALE', 'CIVIL',       1, 82, 'DELHI',       DATE '2023-07-08');
-- INSERT INTO STUDENT VALUES (111, 'ROHIT',  'MALE',   'COMPUTER',    3, 68, 'NOIDA',       DATE '2021-08-18');
-- INSERT INTO STUDENT VALUES (112, 'KAVYA',  'FEMALE', 'ELECTRICAL',  2, 91, 'CHENNAI',     DATE '2022-06-10');
-- INSERT INTO STUDENT VALUES (113, 'MOHIT',  'MALE',   'MECHANICAL',  4, 74, 'PUNE',        DATE '2020-07-20');
-- INSERT INTO STUDENT VALUES (114, 'NIDHI',  'FEMALE', 'COMPUTER',    1, 89, 'GURGAON',     DATE '2023-07-02');
-- INSERT INTO STUDENT VALUES (115, 'SANJAY', 'MALE',   'CIVIL',       3, 58, 'BHOPAL',      DATE '2021-08-30');
-- INSERT INTO STUDENT VALUES (116, 'PRIYA',  'FEMALE', 'MECHANICAL',  2, 76, 'INDORE',     DATE '2022-06-25');   
--  COMMIT ; 
-- 🔹 USING *
-- Write a query to display all columns from the STUDENT table using *.
-- Write a query to display complete student details.
-- Write a query to display every record and column from STUDENT.
-- Write a query to display full data of the STUDENT table.
-- Write a query to display student information exactly as stored.



-- 🔹 USING * WITH EXTRA EXPRESSIONS
-- Write a query to display all columns and MARKS + 5 as BONUS_MARKS.
-- Write a query to display all student details and MARKS * 2 as DOUBLE_MARKS.
-- Write a query to display all columns along with YEAR_OF_STUDY + 1 as NEXT_YEAR.
-- Write a query to display all student data and MARKS / 10 as MARKS_RATIO.
-- Write a query to display complete STUDENT table and MARKS + 10 as UPDATED_MARKS.


-- 🔹 USING ALIAS
-- Write a query to display STUDENT_NAME as NAME and MARKS as SCORE.
-- Write a query to display DEPARTMENT as BRANCH and CITY as LOCATION.
-- Write a query to display STUDENT_ID as ID and ADMISSION_DATE as JOIN_DATE.
-- Write a query to display YEAR_OF_STUDY as YEAR and MARKS as TOTAL_MARKS.
-- Write a query to display GENDER as CATEGORY and CITY as STUDENT_CITY.


-- 🔹 USING EXPRESSIONS
-- Write a query to display STUDENT_NAME and MARKS + 2.
-- Write a query to display STUDENT_ID and MARKS * 1.1.
-- Write a query to display MARKS, MARKS + 10, and MARKS − 5.
-- Write a query to display STUDENT_NAME and YEAR_OF_STUDY * 12 as MONTHS_STUDIED.
-- Write a query to display STUDENT_ID and MARKS / 2.


-- USING DISTINCT
-- 21.Write a query to display distinct DEPARTMENT values.
-- 22.Write a query to display distinct CITY values.
-- 23.Write a query to display distinct GENDER values.
-- 24.Write a query to display distinct YEAR_OF_STUDY values.
-- 25.Write a query to display distinct combinations of DEPARTMENT and CITY.

-- DISTINCT WITH MULTIPLE COLUMNS
-- Write a query to display distinct DEPARTMENT and CITY.


-- Write a query to display distinct CITY and GENDER.


-- Write a query to display distinct YEAR_OF_STUDY and DEPARTMENT.


-- Write a query to display distinct GENDER and YEAR_OF_STUDY.


-- Write a query to display distinct DEPARTMENT and YEAR_OF_STUDY.

--  DATE EXPRESSIONS
-- 31.Write a query to display STUDENT_NAME and ADMISSION_DATE.
-- 32.Write a query to display ADMISSION_DATE and ADMISSION_DATE + 30 as REVIEW_DATE.
-- 33.Write a query to display STUDENT_ID and ADMISSION_DATE + 365.
-- 34.Write a query to display STUDENT_NAME and year from ADMISSION_DATE.
-- 35.Write a query to display STUDENT_ID and ADMISSION_DATE + 1 as NEXT_DAY.
-- WHERE CLAUSE 
-- 36. Display all students who belong to the COMPUTER department and are in year 1.
-- 37. Display students whose gender is MALE and city is MUMBAI.
-- 38. Display students who are in year 3 and department is IT.
-- 39. Display students who scored more than 70 and are from CHENNAI.
-- 40. Display students whose department is COMPUTER and gender is FEMALE.
-- 41. Display students who are in year 2 and city is DELHI.
-- 42. Display students who scored less than 40 and are in year 1.
-- 43. Display students whose gender is FEMALE and department is ECE.
-- 44. Display students who are from HYDERABAD and scored more than 60.
-- 45. Display students who are in year 4 and department is MECH.
-- 46. Display students who belong to IT or COMPUTER department.
-- 47. Display students who are from DELHI or MUMBAI.
-- 48. Display students who are in year 1 or year 2.
-- 49. Display students whose gender is MALE or department is CIVIL.
-- 50. Display students who scored more than 80 or are in year 4.
-- 51. Display students who are from PUNE or scored less than 35.
-- 52. Display students who belong to ECE or are in year 3.
-- 53. Display students whose gender is FEMALE or city is CHENNAI.
-- 54. Display students who scored exactly 50 or are in year 2.
-- 55. Display students who belong to MECH or city is BANGALORE.
-- 56. Display students who are not from DELHI.
-- 57. Display students who are not in year 1.
-- 58. Display students who are not in COMPUTER department.
-- 59. Display students who are not FEMALE.
-- 60. Display students who did not score more than 60.
-- 61. Display students who are in IT and not in year 4.
-- 62. Display students who are from MUMBAI and not MALE.
-- 63. Display students who scored more than 50 and not from CHENNAI.
-- 64. Display students who are in year 3 and not in MECH department.
-- 65. Display students who belong to ECE and not FEMALE.
-- 66. Display students who are from DELHI or not in year 2.
-- 67. Display students who are MALE and not from HYDERABAD.
-- 68. Display students who are in year 1 or not in COMPUTER department.
-- 69. Display students who scored less than 45 and not from PUNE.
-- 70. Display students who belong to CIVIL or not in year 4.
-- 71. Display students who are FEMALE and scored more than 65 and are from CHENNAI.
-- 72. Display students who are in IT and year 2 and city is DELHI.
-- 73. Display students who are MALE and scored more than 70 and not from MUMBAI.
-- 74. Display students who are in year 3 and department is COMPUTER and not FEMALE.
-- 75. Display students who are from PUNE and scored less than 40 and not in year 4.
-- 76. Display students who are in MECH or ECE and year 2.
-- 77. Display students who are from BANGALORE or scored more than 75 and not MALE.
-- 78. Display students who are in year 1 and from DELHI or not in IT department.
-- 79. Display students who scored more than 55 and are FEMALE or not in year 3.
-- 80. Display students who belong to COMPUTER and are from CHENNAI or not in year 2.
-- 81. Display students who are not from MUMBAI and scored more than 60.
-- 82. Display students who are not in IT department and in year 4.
-- 83. Display students who are not MALE and belong to ECE.
-- 84. Display students who are not in year 1 and scored less than 50.
-- 85. Display students who are not from DELHI or scored more than 80.






   