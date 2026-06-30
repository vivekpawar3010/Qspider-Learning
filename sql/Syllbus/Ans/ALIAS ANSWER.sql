1] WAQTD TOTAL SAL GIVEN TO EACH EMP(SAL+COMM).. 
 
select sal+comm from emp;

SQL> select sal+comm from emp;

  SAL+COMM
----------

      1900
      1750

      2650




      1500





14 rows selected.


2] WAQTD ALL THE DETAILS OF EMP ALONG WITH ANNUAL SAL... 
  
 select emp.*, sal*12 as anuals_salary 
 from emp;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO ANUALS_SALARY
------ ---------- --------- ---------- --------- ---------- ---------- ---------- -------------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20          9600
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30         19200
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30         15000
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20         35700
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30         15000
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30         34200
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10         29400
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20         36000
  7839 KING       PRESIDENT            17-NOV-81       5000                    10         60000
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30         18000
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20         13200
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30         11400
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20         36000
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10         15600


3] WAQTD ALL THE DETAILS OF EMP ALONG WITH ANNUAL BONUS OF 2000.... 

select emp.*,sal+2000 bonus from emp;
  


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO      BONUS
---------- ---------- --------- ---------- --------- ---------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20       2800
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30       3600
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30       3250
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20       4975
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30       3250
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30       4850
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10       4450
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20       5000
      7839 KING       PRESIDENT            17-NOV-81       5000                    10       7000
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30       3500
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20       3100
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30       2950
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20       5000
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10       3300


4] WAQTD ALL THE DETAILS OF EMP ALONG WITH SAL HIKE OF 50RPS..  
   
select emp.*, sal+sal*50 "50Rs_HIke"
from emp;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO  50Rs_HIke
------ ---------- --------- ---------- --------- ---------- ---------- ---------- ----------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20      40800
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30      81600
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30      63750
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20     151725
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30      63750
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30     145350
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10     124950
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20     153000
  7839 KING       PRESIDENT            17-NOV-81       5000                    10     255000
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30      76500
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20      56100
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30      48450
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20     153000
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10      66300

5] WAQTD ALL THE DETAILS OF EMP ALONG WITH DEDUCTION OF 50 IN SAL... 
  
select emp.*, sal-(sal-50) "50rs_diducation"
from emp;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO 50rs_diducation
------ ---------- --------- ---------- --------- ---------- ---------- ---------- ---------------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20              50
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30              50
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30              50
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20              50
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30              50
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30              50
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10              50
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20              50
  7839 KING       PRESIDENT            17-NOV-81       5000                    10              50
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30              50
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20              50
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30              50
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20              50
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10              50


6] WAQTD ALL THE DETAILS ABOUT EMPLOYEE AND HIS 2 MONTHS SAL.. 
   
 select emp.*, SAL*2 "2 MONTH SAL"
 FROM EMP;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO 2 MONTH SAL
------ ---------- --------- ---------- --------- ---------- ---------- ---------- -----------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20        1600
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30        3200
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30        2500
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20        5950
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30        2500
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30        5700
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10        4900
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20        6000
  7839 KING       PRESIDENT            17-NOV-81       5000                    10       10000
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30        3000
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20        2200
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30        1900
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20        6000
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10        2600


7] WAQTD ALL THE DETAILS OF EMP ALONG WITH DEDUCTION OF 25% IN THERE 
ANNUAL SAL.. 
  
 SELECT EMP.*,SAL*12-(SAL*12)*25/100 "25% DIDUCTION"
  FROM EMP;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO 25% DIDUCTION
------ ---------- --------- ---------- --------- ---------- ---------- ---------- -------------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20          7200
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30         14400
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30         11250
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20         26775
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30         11250
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30         25650
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10         22050
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20         27000
  7839 KING       PRESIDENT            17-NOV-81       5000                    10         45000
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30         13500
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20          9900
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30          8550
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20         27000
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10         11700

8] WAQTD ALL THE DETAILS OF EMP ALONG WITH HIKE OF 33% IN HIS MONTHLY 
SAL.. 

 SELECT EMP.*, SAL+(SAL)*33/100 "33HIKE"
 FROM EMP;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO     33HIKE
------ ---------- --------- ---------- --------- ---------- ---------- ---------- ----------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20       1064
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30       2128
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30     1662.5
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20    3956.75
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30     1662.5
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30     3790.5
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10     3258.5
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20       3990
  7839 KING       PRESIDENT            17-NOV-81       5000                    10       6650
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30       1995
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20       1463
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30     1263.5
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20       3990
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10       1729

  
9] WAQTD ALL DETAILS OF EMP ALONG WITH HIKE OF 35% IN THERE ANNUAL 
SAL.. 
  
SELECT EMP.*, SAL*12+(SAL*12)*35/100 "35% HIKE"
FROM EMP;

EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO   35% HIKE
----- ---------- --------- ---------- --------- ---------- ---------- ---------- ----------
 7369 SMITH      CLERK           7902 17-DEC-80        800                    20      12960
 7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30      25920
 7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30      20250
 7566 JONES      MANAGER         7839 02-APR-81       2975                    20      48195
 7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30      20250
 7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30      46170
 7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10      39690
 7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20      48600
 7839 KING       PRESIDENT            17-NOV-81       5000                    10      81000
 7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30      24300
 7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20      17820
 7900 JAMES      CLERK           7698 03-DEC-81        950                    30      15390
 7902 FORD       ANALYST         7566 03-DEC-81       3000                    20      48600
 7934 MILLER     CLERK           7782 23-JAN-82       1300                    10      21060


10] WAQTD ALL DETAILS OF EMP ALONG WITH DEDUCTION OF 500 IN THERE 5 
MONTHS SAL.. 
 
 SELECT EMP.*,(SAL*5)-500 "500 DIDUCTION FORM SAL"
 FROM EMP;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO 500 DIDUCTION FORM SAL
------ ---------- --------- ---------- --------- ---------- ---------- ---------- ----------------------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20                   3500
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30                   7500
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30                   5750
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20                  14375
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30                   5750
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30                  13750
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10                  11750
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20                  14500
  7839 KING       PRESIDENT            17-NOV-81       5000                    10                  24500
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30                   7000
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20                   5000
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30                   4250
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20                  14500
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10                   6000

 
  
11] WAQTD ALL DETAILS OF EMP ALONG WITH 28% OF HIKE IN THE SAL & 33% 
DEDUCTION IN HIS HALF TERM SAL& 45% HIKE IN HIS ANNUAL SAL... 

 SELECT EMP.*, SAL+(SAL)*28/100 "28% HIKE" , SAL*6-(SAL*6)*33/100 "33% DIDUCTION" , SAL*12+(SAL*12)*45/100 "ANUAL SAL 45 % HIKE"
 FROM EMP;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO   28% HIKE 33% DIDUCTION ANUAL SAL 45 % HIKE
------ ---------- --------- ---------- --------- ---------- ---------- ---------- ---------- ------------- -------------------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20       1024          3216               13920
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30       2048          6432               27840
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30       1600          5025               21750
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20       3808       11959.5               51765
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30       1600          5025               21750
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30       3648         11457               49590
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10       3136          9849               42630
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20       3840         12060               52200
  7839 KING       PRESIDENT            17-NOV-81       5000                    10       6400         20100               87000
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30       1920          6030               26100
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20       1408          4422               19140
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30       1216          3819               16530
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20       3840         12060               52200
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10       1664          5226               22620
 
12] WAQTD ALL THE DETAILS OF EMP ALONG WITH 45% DEDUCTION IN THE 
SALARY FOR ALL THE EMP’S. 

 SELECT EMP.*,SAL-SAL*45/100 FROM EMP;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO SAL-SAL*45/100
------ ---------- --------- ---------- --------- ---------- ---------- ---------- --------------
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20            440
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30            880
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30          687.5
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20        1636.25
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30          687.5
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30         1567.5
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10         1347.5
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20           1650
  7839 KING       PRESIDENT            17-NOV-81       5000                    10           2750
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30            825
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20            605
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30          522.5
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20           1650
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10            715
 
13] WAQTD NAME, SALARY, 4 MONTHS SALARY,  32% HIKE IN THE 4 MONTHS 
SALARY FOR ALL THE EMP’S. 

SQL> SELECT ENAME, SAL, SAL*4, SAL*4+SAL*4*32/100 "32% HIKE SALARY"
  2  FROM EMP;

ENAME             SAL      SAL*4 32% HIKE SALARY
---------- ---------- ---------- ---------------
SMITH             800       3200            4224
ALLEN            1600       6400            8448
WARD             1250       5000            6600
JONES            2975      11900           15708
MARTIN           1250       5000            6600
BLAKE            2850      11400           15048
CLARK            2450       9800           12936
SCOTT            3000      12000           15840
KING             5000      20000           26400
TURNER           1500       6000            7920
ADAMS            1100       4400            5808
JAMES             950       3800            5016
FORD             3000      12000           15840
MILLER           1300       5200            6864
 
14] WAQTD NAME, SALARY, 9 MONTHS SALARY, 12.34% DEDUCTION IN THE 9 
MONTHS SALARY FOR ALL THE EMP’S. 
 
SQL> SELECT ENAME ,SAL,SAL*9,SAL*9-(SAL*9)*12.34/100 "12.34 DIDUCTION IN 9 MON SAL"
  2  FROM EMP;

ENAME             SAL      SAL*9 12.34 DIDUCTION IN 9 MON SAL
---------- ---------- ---------- ----------------------------
SMITH             800       7200                      6311.52
ALLEN            1600      14400                     12623.04
WARD             1250      11250                      9861.75
JONES            2975      26775                    23470.965
MARTIN           1250      11250                      9861.75
BLAKE            2850      25650                     22484.79
CLARK            2450      22050                     19329.03
SCOTT            3000      27000                      23668.2
KING             5000      45000                        39447
TURNER           1500      13500                      11834.1
ADAMS            1100       9900                      8678.34
JAMES             950       8550                      7494.93
FORD             3000      27000                      23668.2
MILLER           1300      11700                     10256.22


15] WAQTD ALL THE DETAILS ALONG WITH HALF_TERM SALARY, 
ANNUAL_SALARY, TOTAL SALARY FOR ALL THE EMP’S.

 SELECT EMP.*, SAL*6 "HALF_TERM_SAL", SAL*12 "ANUAL SAL", SAL+COMM
 FROM EMP;

 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO HALF_TERM_SAL  ANUAL SAL  
------ ---------- --------- ---------- --------- ---------- ---------- ---------- ------------- ---------- -
  7369 SMITH      CLERK           7902 17-DEC-80        800                    20          4800       9600
  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30          9600      19200  
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30          7500      15000  
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20         17850      35700
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30          7500      15000  
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30         17100      34200
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10         14700      29400
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20         18000      36000
  7839 KING       PRESIDENT            17-NOV-81       5000                    10         30000      60000
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30          9000      18000  
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20          6600      13200
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30          5700      11400
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20         18000      36000
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10          7800      15600


