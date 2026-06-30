-- 1] LIST OUT ALL THE OPERATORS IN SQL.
--  SQL Operators are used to perform operations on data stored in database tables.

-- => TYPE OF SQL OPERATOR

-- i] Arithmetic Operator
-- -----------------------
-- 1] +   >  Addition
-- 2] -   >  Subtraction
-- 3] * >  Multiplication
-- 4] /   >  Division
-- 5] %   >  Modulus


-- ii] Relational (comparison) Operators
-- -------------------------------------
-- 1] =   >  Equal to
-- 2] != or <> > Not equal to
-- 3] >   >  Greater than
-- 4] <   >  Less than
-- 5] >=  >  Greater than equal to
-- 6] <=  >  Less than equal to


-- iii] Logical Operator
-- ---------------------
-- 1] AND >  Both conditions true
-- 2] OR  >  If any one condition true
-- 3] NOT >  To Negative condition

-- iv] Special Operators
-- ----------------------
-- 1] IS & IS NOT >
-- 2] BETWEEN & NOT BETWEEN > 
-- 3] LIKE &  NOT LIKE
-- 4] IN & NOT IN 
-- 


-- 2] EXPLAIN BETWEEN AND LIKE OPERATOR WITH EXAMPLE.


-- iv] Between Operator
-- --------------------
-- - Used to display rows based on a range of values.
-- - It is inclusive (includes both start and end values).

-- Example:
-- SELECT * FROM EMP WHERE SAL BETWEEN 1000 AND 3000;

-- vi] LIKE Operator
-- -----------------
-- - Used for pattern matching using wildcards:
--   1] %  → Matches zero or more characters.
--   2] _  → Matches exactly one character.

-- Example:
-- SELECT * FROM EMP WHERE ENAME LIKE 'S%';


-- 3] WHAT IS SELECTION ? EXPLAIN DISTINCT CLAUSE

-- -----------------------------------------
--  Selection is the process of retrieving specific rows from a table based on a condition using the WHERE clause.

-- Syntax:
-- SELECT * FROM table_name WHERE column_name condition;

-- Example:
-- SELECT * FROM EMP WHERE DEPTNO = 10;
-- Represents the employee rows working in department 10.


-- ------------------------
--  DISTINCT clause is used to remove duplicate values from the output.

-- Syntax:
-- SELECT DISTINCT column_name FROM table_name;

Example:
SELECT DISTINCT DEPTNO FROM EMP;
--> Represents unique department numbers present in the EMP table.

-- 4] WAQTD NAME, WAGES, 12% DEDUCTION IN WAGES FOR THE EMP'S WHO HIRED AFTER 1981 WITHOUT HAVING ANY COMMISSION.
select ename, sal, sal - (sal*12/100) as deduction from emp 
where hiredate > '31-DEC-1981' and 
comm is null;

-- 5] WAQTD DIFFERENT DEPTNO AND DESIGNATION WHO ARE WORKING IN DEPTNO 20 OR 30 EXCLUDING PRESIDENT, THE EMP SHOULD EARN AT LEAST 1500 RPS.
select distinct deptno, job from emp 
where deptno in (20,30) and 
job != 'PRESIDENT' and 
sal >= 1500;


-- 6] WAQTD DETAILS WITH 7 MONTHS OF SALARY FOR THE EMP'S WHO ARE HAVING VOWEL AT 4TH PLACE
select emp.* ,(sal*7) as "7 months salary" from emp 
where regexp_like(ename, '^...[AEIOU].*');

-- 7] WAQTD NAMES OF THE EMP'S WHO HIRED IN THE YEAR 1981 EXCEPT SEPTEMBER AND NOVEMBER EXCLUDING THE EMP'S WHO ARE EARNING SAL IN RANGE 1250 TO 2450 , BUT SHOULD HAVE MANAGER ID 7839 OR 7568 OR NO MANAGER ID.
select ename from emp 
where hiredate between '01-JAN-1981' and '31-DEC-1981' and 
hiredate not like '%-SEP-%' and hiredate not like '%-NOV-%' and 
(sal < 1250 or sal > 2450) and 
(mgr in (7839,7568) or 
mgr is null);

-- 8] WAQTD THE O/P IN THE FOLLOWING FORMAT WHO WORKING AS 'CLERK' OR 'SALESMAN' IN DETNO 20 WITH AT MOST SALARY OF 2850 , CROSSING THE 10% HlKE 879 RPS.
select ename, job, deptno, sal from emp 
where job in('CLERK','SALESMAN') and 
deptno = 20 and 
sal <= 2850 and sal > 879;

-- 9] WAQTD THE EMP'S NAME, DESIGNATION WITH JOINING DATE WHO ARE HIRED BEFORE 1982 WITH MANAGER ID EXCEEDING 7566 WITH EMPID NOT EXCEEDING 7844 , EMP SHOULD HIRED IN THE MONTH OF SEPTEMBER OR DECEMBER.
select ename, job, hiredate from emp 
where hiredate < '01-JAN-1982' and 
mgr > 7566 and empno <= 7844 and 
(hiredate like '%-SEP-%' or hiredate like '%-DEC-%');

-- 10] WAQTD NAME WITH ANNUAL SALARY FOR THE EMP'S WHO ARE WORKING IN DEPTNO 10 OR 20 EXCEPT THE 'CLERK' AND 'SALESMAN' HIRED AFTER MARCH 1981 ,EMP NAME'S 3RD CHAR SHOULD NOT BE VOWEL.

select ename, sal*12 as "annual salary" from emp 
where deptno in (10,20) and 
job not in ('CLERK','SALESMAN') and 
hiredate > '31-MAR-1981' and  
(not regexp_like(ename, '^..[^AEIOU].*')) ;