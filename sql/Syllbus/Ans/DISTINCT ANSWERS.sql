-- 1] WAQTD DIFFERENT DESIGNATIONS IN EMP TABLE. 
 

SELECT DISTINCT JOB FROM EMP;

-- JOB
-- ---------
-- CLERK
-- SALESMAN
-- PRESIDENT
-- MANAGER
-- ANALYST
  
-- 2] WAQTD DIFFERENT DEPTNO IN EMP TABLE. 
   
SQL> SELECT DISTINCT DEPTNO FROM EMP;

--     DEPTNO
-- ----------
--         30
--         20
--         10

3] WAQTD DIFFERENNT JOB & DEPTNO IN EMP TABLEE. 
   

SQL> SELECT DISTINCT JOB, DEPTNO FROM EMP;

JOB           DEPTNO
--------- ----------
MANAGER           20
PRESIDENT         10
CLERK             10
SALESMAN          30
ANALYST           20
MANAGER           30
MANAGER           10
CLERK             30
CLERK             20

4] WAQTD DIFF DEPTNO & SAL IN EMP TABLE. 

SQL> SELECT DISTINCT DEPTNO,SAL FROM EMP;

    DEPTNO        SAL
---------- ----------
        10       5000
        20        800
        20       2975
        10       2450
        30       1250
        20       3000
        30        950
        20       1100
        10       1300
        30       1600
        30       2850
        30       1500
   
5] WAQTD DIFF JOB, SAL IN EMP TABLE. 

SQL> SELECT DISTINCT JOB,SAL FROM EMP;

JOB              SAL
--------- ----------
CLERK           1300
SALESMAN        1600
SALESMAN        1250
CLERK            950
CLERK            800
MANAGER         2450
PRESIDENT       5000
ANALYST         3000
MANAGER         2850
MANAGER         2975
SALESMAN        1500
CLERK           1100

   
6] WAQTD DIFF HIREDATE IN EMP TABLE. 

SQL> SELECT DISTINCT HIREDATE FROM EMP;

HIREDATE
---------
23-MAY-87
17-NOV-81
03-DEC-81
23-JAN-82
22-FEB-81
17-DEC-80
09-JUN-81
20-FEB-81
02-APR-81
19-APR-87
01-MAY-81
08-SEP-81
28-SEP-81

   
7] WAQTD DIFF JOB, SAL, DEPTNO IN EMP TABLE. 

SQL> SELECT DISTINCT JOB, SAL, DEPTNO FROM EMP;

JOB              SAL     DEPTNO
--------- ---------- ----------
ANALYST         3000         20
SALESMAN        1500         30
SALESMAN        1250         30
MANAGER         2850         30
MANAGER         2450         10
MANAGER         2975         20
SALESMAN        1600         30
CLERK            800         20
PRESIDENT       5000         10
CLERK            950         30
CLERK           1300         10
CLERK           1100         20
  
8] WAQTD DIFF HIREDATE & JOB IN EMP TABLE. 

SQL> SELECT DISTINCT HIREDATE, JOB FROM EMP;

HIREDATE  JOB
--------- ---------
23-MAY-87 CLERK
22-FEB-81 SALESMAN
01-MAY-81 MANAGER
19-APR-87 ANALYST
17-NOV-81 PRESIDENT
17-DEC-80 CLERK
20-FEB-81 SALESMAN
28-SEP-81 SALESMAN
08-SEP-81 SALESMAN
09-JUN-81 MANAGER
23-JAN-82 CLERK
02-APR-81 MANAGER
03-DEC-81 CLERK
03-DEC-81 ANALYST

   
9] WAQTD DIFF SAL, DEPTNO, JOB, HIREDATE IN EMP TABLE. 

SQL> SELECT DISTINCT SAL, DEPTNO, JOB,HIREDATE FROM EMP;

       SAL     DEPTNO JOB       HIREDATE
---------- ---------- --------- ---------
       800         20 CLERK     17-DEC-80
      1250         30 SALESMAN  22-FEB-81
      1500         30 SALESMAN  08-SEP-81
       950         30 CLERK     03-DEC-81
      3000         20 ANALYST   03-DEC-81
      2450         10 MANAGER   09-JUN-81
      3000         20 ANALYST   19-APR-87
      5000         10 PRESIDENT 17-NOV-81
      2850         30 MANAGER   01-MAY-81
      1300         10 CLERK     23-JAN-82
      1600         30 SALESMAN  20-FEB-81
      1100         20 CLERK     23-MAY-87
      2975         20 MANAGER   02-APR-81
      1250         30 SALESMAN  28-SEP-81

14 rows selected.

   
10] WAQTD DIFFERENT RECORDS PRESENT IN EMP TABLE. 

SQL> SELECT DISTINCT EMP.* FROM EMP;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
