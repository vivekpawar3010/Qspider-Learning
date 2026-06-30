SELECT T1.SLNO, T1.FIRST_HALF_SAL, T2.SLNO, T2.SECOND_HALF_SAL
FROM 
    (SELECT SLNO, SAL AS FIRST_HALF_SAL 
     FROM (SELECT ROWNUM SLNO, SAL 
           FROM (SELECT DISTINCT SAL 
                 FROM (SELECT * FROM (SELECT ROWNUM RN, EMP.* FROM EMP)
                       WHERE RN <= (SELECT COUNT(*)/2 FROM EMP)) 
                 ORDER BY SAL DESC
                )
          )
    ) T1, 
    (SELECT SLNO, SAL AS SECOND_HALF_SAL 
     FROM (SELECT ROWNUM SLNO, SAL 
           FROM (SELECT DISTINCT SAL 
                 FROM (SELECT * FROM (SELECT ROWNUM RN, EMP.* FROM EMP)
                       WHERE RN > (SELECT COUNT(*)/2 FROM EMP)) 
                 ORDER BY SAL ASC
                )
          )
     ) T2
WHERE T1.SLNO != 2000 AND T2.SLNO != 3000;