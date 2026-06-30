

-- -- ### 1] WAQTD 5TH RECORD FROM EMP TABLE.
-- --       SLNO      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
-- -- ---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
-- --          5       7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30


SELECT * 
FROM (SELECT ROWNUM AS SLNO, EMP.*  FROM EMP)
WHERE SLNO = 5;



-- ### 2] WAQTD ENAME, SAL FROM 7TH RECORD.

-- ENAME             SAL
-- ---------- ----------
-- CLARK            2450

SELECT ENAME, SAL
FROM (SELECT ROWNUM AS SLNO, EMP.*  FROM EMP)
WHERE SLNO = 7;


-- ### 3] WAQTD DETAILS OF 1ST, 3RD, 5TH, 8TH RECORD.
--       SLNO      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
-- ---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
--          1       7369 SMITH      CLERK           7902 17-DEC-80        800                    20
--          3       7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
--          5       7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30
--          8       7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20


SELECT * 
FROM (SELECT ROWNUM AS SLNO, EMP.*  FROM EMP)
WHERE SLNO IN (1, 3, 5, 8);

-- ### 4] WAQTD ENAME OF 8TH, 7TH & 6TH RECORD.


-- ENAME
-- ----------
-- BLAKE
-- CLARK
-- SCOTT


SELECT ENAME
FROM (SELECT ROWNUM AS SLNO, EMP.*  FROM EMP)
WHERE SLNO IN (6, 7, 8);

-- ### 5] WAQTD DNAME OF 4TH RECORD.


-- DNAME
-- --------------
-- OPERATIONS

SELECT DNAME
FROM (SELECT ROWNUM AS SLNO, DEPT.*  FROM DEPT)
WHERE SLNO IN (4);
--------------------------------------------------------------
-- DNAME
-- --------------
-- RESEARCH

SELECT DNAME FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
            FROM (SELECT ROWNUM AS SLNO, EMP.*  FROM EMP)
               WHERE SLNO IN (4));

-- ### 6] WAQTD DNAME OF 6TH RECORD IN EMP TABLE.

-- DNAME
-- --------------
-- SALES

SELECT DNAME FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
            FROM (SELECT ROWNUM AS SLNO, EMP.*  FROM EMP)
               WHERE SLNO IN (6));

-- ### 7] WAQTD 2ND MAX SAL.
--       SAL
-- ----------
--       3000

SELECT SAL 
FROM (SELECT ROWNUM AS SLNO, SAL 
            FROM (SELECT SAL FROM EMP
                    ORDER BY SAL DESC))
WHERE SLNO = 2;
-- ### 8] WAQTD 3RD MAX SAL USING ROWNUM.

--        SAL
-- ----------
--       2975

SELECT SAL 
FROM (SELECT ROWNUM AS SLNO, SAL 
            FROM (SELECT DISTINCT SAL FROM EMP
                    ORDER BY SAL DESC))
WHERE SLNO = 3;


-- ### 9] WAQTD ENAME WHO EARNS 4TH MIN SAL.

--        SAL
-- ----------
--       1250

SELECT SAL 
FROM (SELECT ROWNUM AS SLNO, SAL 
            FROM (SELECT SAL FROM EMP
                    ORDER BY SAL ASC))
WHERE SLNO = 4;
-- ### 10] WAQTD 7TH 8TH & 9TH MAX SAL.
--        SAL
-- ----------
--       1500
--       1300


SELECT SAL 
FROM (SELECT ROWNUM AS SLNO, SAL 
            FROM (SELECT SAL FROM EMP
                    ORDER BY SAL DESC))
WHERE SLNO IN (8, 9);



-- ### 11] WAQTD DNAME OF EMP EARNING 6TH MIN SAL.


-- DNAME
-- --------------
-- ACCOUNTING


SELECT DNAME FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP 
                WHERE SAL IN(SELECT SAL 
                FROM (SELECT ROWNUM AS SLNO, SAL 
                        FROM (SELECT SAL FROM EMP
                                ORDER BY SAL ASC))
                        WHERE SLNO IN (6)));

-- ### 12] WAQTD DETAILS OF EMP WHO EARNS 10TH MAX SAL.


-- MAX_10TH_SAL
-- ------------
--         1250


SELECT SAL AS MAX_10TH_SAL 
FROM (SELECT ROWNUM AS SLNO, SAL 
            FROM (SELECT SAL FROM EMP
                    ORDER BY SAL DESC))
WHERE SLNO IN (10);

-- ### 13] WAQTD LOC OF EMP WHO EARNS 2ND MIN SAL.

-- LOC_2ND_MIN_S
-- -------------
-- CHICAGO


SELECT LOC AS LOC_2ND_MIN_SAL FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO FROM EMP 
                WHERE SAL IN(SELECT SAL 
                FROM (SELECT ROWNUM AS SLNO, SAL 
                        FROM (SELECT SAL FROM EMP
                                ORDER BY SAL ASC))
                        WHERE SLNO IN (2)));


-- ### 14] WAQTD DEPTNO OF EMP EARNING 12TH MAX SAL.

--     DEPTNO
-- ----------
--         20

SELECT DEPTNO FROM EMP 
WHERE SAL IN(SELECT SAL 
                FROM (SELECT ROWNUM AS SLNO, SAL 
                        FROM (SELECT SAL FROM EMP
                                ORDER BY SAL DESC))
                        WHERE SLNO IN (12));


-- ### 15] WAQTD ENAME, SAL, COMM WHO EARNS 7TH MAX SAL.

-- ENAME             SAL       COMM
-- ---------- ---------- ----------
-- ALLEN            1600        300

SELECT ENAME, SAL, COMM FROM EMP 
WHERE SAL IN(SELECT SAL 
                FROM (SELECT ROWNUM AS SLNO, SAL 
                        FROM (SELECT SAL FROM EMP
                                ORDER BY SAL DESC))
                        WHERE SLNO IN (7));

-- ### 16] WAQTD LAST 3 RECORDS FROM EMP TABLE.

--       SLNO      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
-- ---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
--         12       7900 JAMES      CLERK           7698 03-DEC-81        950                    30
--         13       7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
--         14       7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SELECT * 
FROM (SELECT ROWNUM AS SLNO, EMP.* FROM EMP)
WHERE SLNO > (SELECT COUNT(*) - 3 FROM EMP);

-- ### 17] WAQTD 7TH MIN SAL.

-- MIN_7TH_SAL
-- -----------
--        1500

SELECT SAL AS MIN_7TH_SAL 
FROM (SELECT ROWNUM AS SLNO, SAL 
            FROM (SELECT SAL FROM EMP
                    ORDER BY SAL ASC))
WHERE SLNO IN (7);


-- ### 18] WAQTD LAST RECORD FROM EMP TABLE.

--       SLNO      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
-- ---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
--         14       7934 MILLER     CLERK           7782 23-JAN-82       1300                    10


SELECT * 
FROM (SELECT ROWNUM AS SLNO, EMP.* FROM EMP)
WHERE SLNO = (SELECT COUNT(*) FROM EMP);

-- ### 19] WAQTD LAST 5 RECORDS IN EMP TABLE.
--       SLNO      EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
-- ---------- ---------- ---------- --------- ---------- --------- ---------- ---------- ----------
--         10       7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
--         11       7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
--         12       7900 JAMES      CLERK           7698 03-DEC-81        950                    30
--         13       7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
--         14       7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

SELECT * 
FROM (SELECT ROWNUM AS SLNO, EMP.* FROM EMP)
WHERE SLNO > (SELECT COUNT(*) - 5 FROM EMP);


-- ### 20] WAQTD 10TH MAX SALARY.

--        SAL
-- ----------
--       1100

SELECT SAL
FROM (SELECT ROWNUM SLNO, SAL 
                FROM (SELECT DISTINCT SAL FROM EMP ORDER BY SAL DESC))
WHERE SLNO IN (10);

-- *