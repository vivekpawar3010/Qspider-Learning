-- select ename, manager name, mangader manager name along with location
-- if mangaers manager sal is last min sal and
-- manageer sal is 3rd last and 4th last min sal and 
-- emp sal is in first half min sal


SELECT E1.ENAME EMPNAME, E2.ENAME MGRNAME, E3.ENAME MGRMGENAME 
FROM EMP E1 JOIN EMP E2 
ON E1.MGR = E2.EMPNO JOIN EMP E3
ON E2.MGR = E3.EMPNO
WHERE E3.SAL IN (SELECT SAL 
                    FROM (SELECT ROWNUM SLNO, SAL 
                                    FROM (SELECT DISTINCT SAL 
                                                FROM EMP ORDER BY SAL DESC))
                    WHERE SLNO = 1
                )
AND
E2.SAL IN (SELECT SAL 
                    FROM (SELECT ROWNUM SLNO, SAL 
                                    FROM (SELECT DISTINCT SAL 
                                                FROM EMP ORDER BY SAL DESC))
                    WHERE SLNO = 4 OR SLNO IN (SELECT COUNT(DISTINCT SAL) - 2 FROM EMP)
                )
AND
E1.SAL IN (SELECT SAL 
            FROM (SELECT ROWNUM SLNO, SAL 
                            FROM (SELECT DISTINCT SAL 
                                            FROM (SELECT * FROM (SELECT ROWNUM SLNO, EMP.* FROM EMP)
                                                    WHERE SLNO <= (SELECT COUNT(*)/2 FROM EMP))
                                    ORDER BY SAL ASC
                                )
                )
            WHERE SLNO = 1
            );


           