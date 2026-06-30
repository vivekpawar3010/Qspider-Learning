-- SELF JOIN

-- 1] WAQTD employees SAL & managers SAL.

-- 14 ROWS SELECTED

select e.ename, e.sal, m.ename, m.sal 
from emp e join emp m 
on e.mgr in m.empno;


-- 2] WAQTD employees name & managers name of if employee is working in DEPTNO 20.
-- EMPNAME    MGRNAME        DEPTNO
-- ---------- ---------- ----------
-- SMITH      FORD               20
-- JONES      KING               20
-- SCOTT      JONES              20
-- ADAMS      SCOTT              20
-- FORD       JONES              20
select e.ename empname, m.ename mgrname, e.deptno
from emp e join emp m
on e.mgr in m.empno
where e.deptno = 20;

-- 3] WAQTD employee name, manager's name if manager is working as 'PRESIDENT'.
-- EMPNAME    MGRNAME    MANAGER_J
-- ---------- ---------- ---------
-- JONES      KING       PRESIDENT
-- BLAKE      KING       PRESIDENT
-- CLARK      KING       PRESIDENT
select e.ename empname, m.ename mgrname , m.job manager_job
from emp e join emp m
on e.mgr in m.empno
where m.job = 'PRESIDENT';


-- 4] WAQTD employee name, employee SAL, manager name, manager SAL if employee is earning MORE THAN 1000.

-- 11 ROWS SELECTED

select e.ename empname, e.sal empsal, m.ename mgrname, m.sal mgrsal 
from emp e, emp m
where e.mgr in m.empno and 
e.sal > 1000;


-- -- 5] WAQTD employee name, employee HIREDATE, manager's name, manager's HIREDATE if employees is hired after 1980 & manager hired before 1987.
-- EMPNAME    EMPHIREDA MGRNAME    MGRHIREDA
-- ---------- --------- ---------- ---------
-- ALLEN      20-FEB-81 BLAKE      01-MAY-81
-- WARD       22-FEB-81 BLAKE      01-MAY-81
-- JONES      02-APR-81 KING       17-NOV-81
-- MARTIN     28-SEP-81 BLAKE      01-MAY-81
-- BLAKE      01-MAY-81 KING       17-NOV-81
-- CLARK      09-JUN-81 KING       17-NOV-81
-- SCOTT      19-APR-87 JONES      02-APR-81
-- TURNER     08-SEP-81 BLAKE      01-MAY-81
-- JAMES      03-DEC-81 BLAKE      01-MAY-81
-- FORD       03-DEC-81 JONES      02-APR-81
-- MILLER     23-JAN-82 CLARK      09-JUN-81

-- 11 ROWS SELECTED

select e.ename empname, e.hiredate emphiredate, m.ename mgrname, m.hiredate mgrhiredate
from emp e, emp m
where e.mgr = m.empno and
e.hiredate > '31-DEC-1980' and
m.hiredate < '01-JAN-1987' ;

-- 6] WAQTD name of the employee & his manager's name if employee is working as 'CLERK'.

-- EMPNAME    MGRNAME
-- ---------- ----------
-- SMITH      FORD
-- ADAMS      SCOTT
-- JAMES      BLAKE
-- MILLER     CLARK
select e.ename empname, m.ename mgrname
from emp e, emp m
where e.mgr = m.empno and
e.job = 'CLERK';

-- 7] WAQTD ENAME, MGR designation if manager is working in DEPTNO 10 or 20.
-- ENAME      ENAME      JOB
-- ---------- ---------- ---------
-- SMITH      FORD       ANALYST
-- JONES      KING       PRESIDENT
-- BLAKE      KING       PRESIDENT
-- CLARK      KING       PRESIDENT
-- SCOTT      JONES      MANAGER
-- ADAMS      SCOTT      ANALYST
-- FORD       JONES      MANAGER
-- MILLER     CLARK      MANAGER

select e.ename empname, m.ename mgrname, m.job mgrjob
from emp e, emp m
where e.mgr = m.empno and 
m.deptno in (10, 20);


-- 8] WAQTD employee name & manager name if employee is hired before 1982.
-- 10 rows
-- EMPNAME    MGRNAME
-- ---------- ----------
-- SMITH      FORD
-- ALLEN      BLAKE
-- WARD       BLAKE
-- JONES      KING
-- MARTIN     BLAKE
-- BLAKE      KING
-- CLARK      KING
-- TURNER     BLAKE
-- JAMES      BLAKE
-- FORD       JONES
select e.ename empname, m.ename mgrname 
from emp e, emp m
where e.mgr = m.empno and 
e.hiredate < '01-JAN-1982';



-- 9] WAQTD employee name, manager's name if employee & manager both earn more that 2300

-- EMPNAME    MGRNAME
-- ---------- ----------
-- JONES      KING
-- BLAKE      KING
-- CLARK      KING
-- SCOTT      JONES
-- FORD       JONES
select e.ename empname, m.ename mgrname
from emp e, emp m 
where e.mgr = m.empno and 
e.sal > 2300 and m.sal > 2300;



-- 10] WAQTD employee name, employee SAL, manager name, manager SAL if employee is earning more than his manager.

-- EMPNAME        EMPSAL MGRNAME        MGRSAL
-- ---------- ---------- ---------- ----------
-- SCOTT            3000 JONES            2975
-- FORD             3000 JONES            2975
select e.ename empname, e.sal empsal, m.ename mgrname, m.sal mgrsal
from emp e, emp m
where e.mgr = m.empno and
e.sal > m.sal;


-- 11] WAQTD employee name, employee HIREDATE, manager name, manager HIREDATE if manager hired after emp

-- EMPNAME    EMPHIREDA MGRNAME    MGRHIREDA
-- ---------- --------- ---------- ---------
-- SMITH      17-DEC-80 FORD       03-DEC-81
-- ALLEN      20-FEB-81 BLAKE      01-MAY-81
-- WARD       22-FEB-81 BLAKE      01-MAY-81
-- JONES      02-APR-81 KING       17-NOV-81
-- BLAKE      01-MAY-81 KING       17-NOV-81
-- CLARK      09-JUN-81 KING       17-NOV-81

select e.ename empname, e.hiredate emphiredate, m.ename mgrname, m.hiredate mgrhiredate 
from emp e, emp m
where e.mgr = m.empno and  
e.hiredate < m.hiredate;


-- 12] WAQTD employee name & his managers name if employee is hired in the year 1980 and manager is hired in the year 1981.
-- EMPNAME    MGRNAME
-- ---------- ----------
-- SMITH      FORD
select e.ename empname, m.ename mgrname
from emp e, emp m
where e.mgr = m.empno and  
e.hiredate like '%-80' and  m.hiredate like '%-81';


-- 13] WAQTD employee name & managers name if employee & manager both hired in the year 1987.
-- EMPNAME    MGRNAME
-- ---------- ----------
-- ADAMS      SCOTT

select e.ename empname, m.ename mgrname
from emp e, emp m
where e.mgr = m.empno and  
e.hiredate like '%-87' and  m.hiredate like '%-87';



-- 14] WAQTD employee name & manager name if employee & manager both hired in the month of DEC.
-- EMPNAME    MGRNAME
-- ---------- ----------
-- SMITH      FORD

select e.ename empname, m.ename mgrname
from emp e, emp m
where e.mgr = m.empno and  
e.hiredate like '%-DEC-%' and  m.hiredate like '%-DEC-%';





-- 15] WAQTD employee name & manager name if employee is earning more than 2900 & manager is earning more than 3000.

-- -EMPNAME    MGRNAME
-- ---------- ----------
-- JONES      KING


select e.ename empname, m.ename mgrname
from emp e, emp m
where e.mgr = m.empno and  
e.sal > 2900 and  m.sal > 3000;


-- 16] WAQTD employee name, manager name If employee is working as ANALYST & manager is working as actual manager.
-- EMPNAME    MGRNAME
-- ---------- ----------
-- SCOTT      JONES
-- FORD       JONES

select e.ename empname, m.ename mgrname
from emp e, emp m
where e.mgr = m.empno and  
e.job = 'ANALYST' and  m.job = 'MANAGER';



-- 17] WAQTD employee name & manager's name if employee is earning less than 1000 & dept number 30.
-- EMPNAME    MGRNAME
-- ---------- ----------
-- JAMES      BLAKE
select e.ename empname, m.ename mgrname
from emp e, emp m
where e.mgr = m.empno and  
e.sal < 1000 and  m.deptno = 30;


-- 18] WAQTD employee name, employee LOC, manager's name, & manager's LOC.
-- EMPNAME    EMPLOC        MGRNAME    MGRLOC
-------- ------------- ---------- -------------
-- SMITH      DALLAS        FORD       DALLAS
-- ALLEN      CHICAGO       BLAKE      CHICAGO
-- WARD       CHICAGO       BLAKE      CHICAGO
-- JONES      DALLAS        KING       NEW YORK
-- MARTIN     CHICAGO       BLAKE      CHICAGO
-- BLAKE      CHICAGO       KING       NEW YORK
-- CLARK      NEW YORK      KING       NEW YORK
-- SCOTT      DALLAS        JONES      DALLAS
-- TURNER     CHICAGO       BLAKE      CHICAGO
-- ADAMS      DALLAS        SCOTT      DALLAS
-- JAMES      CHICAGO       BLAKE      CHICAGO
-- FORD       DALLAS        JONES      DALLAS
-- MILLER     NEW YORK      CLARK      NEW YORK
select e.ename empname,ed.loc emploc, m.ename mgrname, md.loc mgrloc
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno;

-- 19] WAQTD employee name, employee LOC, manager name, manager LOC if employee is working as a 'CLERK' & manager is working in 'DALLAS'.
-- EMPNAME    EMPLOC        MGRNAME    MGRLOC
-- ---------- ------------- ---------- -------------
-- SMITH      DALLAS        FORD       DALLAS
-- ADAMS      DALLAS        SCOTT      DALLAS

select e.ename empname,ed.loc emploc, m.ename mgrname, md.loc mgrloc
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno and
        e.job = 'CLERK' and 
        md.loc = 'DALLAS';



-- 20] WAQTD employee name, employee LOC, manager name, manager LOC if employee is working as a 'CLERK' & manager is working in 'DALLAS'.
-- EMPNAME    EMPLOC        MGRNAME    MGRLOC
-- ---------- ------------- ---------- -------------
-- SMITH      DALLAS        FORD       DALLAS
-- ADAMS      DALLAS        SCOTT      DALLAS

select e.ename empname,ed.loc emploc, m.ename mgrname, md.loc mgrloc
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno and
        e.job = 'CLERK' and 
        md.loc = 'DALLAS';



-- 21] WAQTD employee name, employee LOC, manager name, manager LOC if employee working as 'SALESMAN' in 'SALES' department & manager is working as actual manager in 'CHICAGO'.
-- EMPNAME    EMPLOC        MGRNAME    MGRLOC
-- ---------- ------------- ---------- -------------
-- ALLEN      CHICAGO       BLAKE      CHICAGO
-- WARD       CHICAGO       BLAKE      CHICAGO
-- MARTIN     CHICAGO       BLAKE      CHICAGO
-- TURNER     CHICAGO       BLAKE      CHICAGO
select e.ename empname,ed.loc emploc, m.ename mgrname, md.loc mgrloc
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno and
        e.job = 'SALESMAN' and ed.dname = 'SALES' and 
        m.job = 'MANAGER' and md.loc = 'CHICAGO';


-- 22] WAQTD employee name, employee DNAME, manager name, manager DNAME if employee is hired in the year 81 working as 'CLERK' & manager working in 'SALES' department.

-- EMPNAME    EMPDNAME       MGRNAME    MGRDNAME
-- ---------- -------------- ---------- --------------
-- JAMES      SALES          BLAKE      SALES

select e.ename empname,ed.dname empdname, m.ename mgrname, md.dname mgrdname
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno and
        e.job = 'CLERK' and e.hiredate like '%-81' and 
        md.dname = 'SALES';




-- 23] WAQTD employee name, employee LOC, manager name, manager LOC if employee is working in DEPTNO 10 or 20 and hired after 1982 & manager is working as actual mangaer in RESEARCH  department.
-- EMPNAME    EMPDLOC       MGRNAME    MGRLOC
-- ---------- ------------- ---------- -------------
-- SCOTT      DALLAS        JONES      DALLAS

select e.ename empname,ed.loc empdloc, m.ename mgrname, md.loc mgrloc
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno and
        e.deptno in (10, 20) and e.hiredate > '31-DEC-1982' and 
        md.dname = 'RESEARCH' and m.job = 'MANAGER';

-- 24] WAQTD employee name, employee LOC, manager name, manager LOC if employee is hired after 'JONES' into 'SALES' department & manager is earning less than 'KING' in 'CHICAGO'.
-- EMPNAME    EMPDLOC       MGRNAME    MGRLOC
-- ---------- ------------- ---------- -------------
-- MARTIN     CHICAGO       BLAKE      CHICAGO
-- TURNER     CHICAGO       BLAKE      CHICAGO
-- JAMES      CHICAGO       BLAKE      CHICAGO
select e.ename empname,ed.loc empdloc, m.ename mgrname, md.loc mgrloc
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno and
        ed.dname = 'SALES' and e.hiredate > (select hiredate from emp where ename = 'JONES') and 
        md.loc = 'CHICAGO' and m.sal < (select sal from emp where ename = 'KING');



-- 25] WAQTD employee name, employee DNAME, manager name, manager DNAME if employee is earning more than 'ALLEN' in 'ACCOUNTING' department & manager is working as a 'PRESIDENT' in 'NEW YORK.


-- EMPNAME    EMPDNAME       MGRNAME    MGRDNAME
-- ---------- -------------- ---------- --------------
-- CLARK      ACCOUNTING     KING       ACCOUNTING
select e.ename empname,ed.dname empdname, m.ename mgrname, md.dname mgrdname
from emp e, emp m, dept ed, dept md
where e.mgr = m.empno and  
        e.deptno = ed.deptno and 
        m.deptno = md.deptno and
        ed.dname = 'ACCOUNTING' and e.sal > (select sal from emp where ename = 'ALLEN') and 
        m.job = 'PRESIDENT' and md.loc = 'NEW YORK';
