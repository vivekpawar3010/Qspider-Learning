1)





ENAME             SAL  DEDUCTION
---------- ---------- ----------
ALLEN            1600       1403
BLAKE            2850       2498
CLARK            2450       2148
KING             5000       4383
TURNER           1500       1315


2)
select deptno, count(*) from emp
where hiredate > '31-DEC-1980'
group by deptno
having avg(sal) > 2000
order by deptno

    DEPTNO   COUNT(*)
---------- ----------
        10          3
        20          4


3)
select ename from emp
 where hiredate > (select hiredate from emp where ename = 'ALLEN')
 and sal > (select sal from emp where ename = 'ADAMS')
 and deptno not in (select deptno from emp where sal = 800)

ENAME
----------
WARD
MARTIN
BLAKE
CLARK
KING
TURNER
MILLER


4}
select ename, loc
from emp inner join dept
on emp.deptno in dept.deptno
where mod(to_char(hiredate, 'DD'), 2) = 0 and
mod(empno, 2) = 1
/


ENAME      LOC
---------- -------------
ALLEN      CHICAGO
WARD       CHICAGO


5)
select e.ename, m.ename 
from emp e join emp m
on e.mgr in m.empno
where e.hiredate > m.hiredate and 
e.hiredate > (select hiredate from emp where ename = 'JAMES') and
m.hiredate < (select hiredate from emp where ename = 'SCOTT');


EMPNAME    MGRNAME    HIREDATE  HIREDATE
---------- ---------- --------- ---------
SCOTT      JONES      19-APR-87 02-APR-81
MILLER     CLARK      23-JAN-82 09-JUN-81


6)select e.ename emp_name,ed.loc, m.ename MGR_NAME,md.loc, mm.ename "MGR'S MGR_NAME", mmd.loc
from emp e join emp m
on e.mgr = m.empno join emp mm
on m.mgr = mm.empno inner join dept ed
on ed.deptno = e.deptno inner join dept md
on md.deptno = m.deptno inner join dept mmd
on mmd.deptno = mm.deptno
where m.deptno in (select deptno from emp group by deptno having count(*) = 6)
and
to_char(e.hiredate , 'MM') in (select to_char(hiredate, 'MM') from emp where ename in ('TURNER','JONES'))
and mm.sal in (select max(sal) from emp)

no row selected

7)
 select dname from dept
 where deptno in (select deptno
                    from (select rownum slno, emp.* from emp)
            where slno = 7)

DNAME
--------------
ACCOUNTING
