CREATE TABLE DEPT (
 DEPTNO              integer NOT NULL,
 DNAME               varchar(14),
 LOC                 varchar(13),
 CONSTRAINT DEPT_PRIMARY_KEY PRIMARY KEY (DEPTNO));

INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

CREATE TABLE EMP (
 EMPNO               integer NOT NULL,
 ENAME               varchar(10),
 JOB                 varchar(9),
 MGR                 integer CONSTRAINT EMP_SELF_KEY REFERENCES EMP (EMPNO),
 HIREDATE            DATEtime,
 SAL                 money,
 COMM                money,
 DEPTNO              integer NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO));

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'17-NOV-81',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1-MAY-81',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'9-JUN-81',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'2-APR-81',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'28-SEP-81',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'20-FEB-81',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'8-SEP-81',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'3-DEC-81',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'22-FEB-81',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'3-DEC-81',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'17-DEC-80',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'09-DEC-82',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'12-JAN-83',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'23-JAN-82',1300,NULL,10);

SELECT * 
from DEPT;

SELECT *
from EMP;

--Display EMP Names
SELECT ENAME 
from EMP;

--Display EMP Names in small case
SELECT LOWER(ENAME) AS ENAME 
from EMP;

--Display EMP Names in ascending order
SELECT ENAME 
from EMP order by ENAME ASC;

--Display EMP Names in descending order
SELECT ENAME 
from EMP order by ENAME DESC;

--Display DEPARTMENT NO From EMP
SELECT DEPTNO 
from EMP;

--Display unique department number from EMP
SELECT DISTINCT(DEPTNO) 
from EMP;

--Display ENAME, Salary of KING
SELECT ENAME, SAL 
from EMP 
where ENAME='King';

--Display ENAME from DEPT 10
Select ENAME 
from EMP 
where DEPTNO=10;

--Display all employee where ENAME starts with S
Select * 
from EMP 
WHERE ENAME LIKE 's%';

--Display all employee where ENAME ends with N
Select * 
from EMP 
WHERE ENAME LIKE '%N';


--Display all emp whose commision is null
Select * 
from EMP 
WHERE COMM IS NULL;

--Display all emp in dept no 10,20
Select * 
from EMP 
WHERE DEPTNO=10 or DEPTNO=20;

--Display salary comm ctc of each emp
select SAL, COMM, COALESCE(SAL+COMM,SAL,COMM) as CTC 
from EMP;

--Display all emp who are cleark
select * 
from EMP 
where JOB='CLERK';

--Display current date
select CURRENT_TIMESTAMP;

--Display EMP who are 'Analyst' & 'Manager'
Select * 
from EMP 
WHERE JOB IN ('Analyst','Manager');

--Display joining date & experience
select HIREDATE, datediff(year, HIREDATE, CURRENT_TIMESTAMP) as EXPERIENCE 
from EMP;

--Emp who are works in same depart as scott
select * 
from EMP 
where DEPTNO=(select DEPTNO from EMP where ENAME='SMITH');

--Emp who has same salary of scott
select * 
from EMP 
where SAL=(select SAL from EMP where ENAME='SCOTT');

--Emp who has same designation as black
select * 
from EMP 
where JOB=(select JOB from EMP where ENAME='BLAKE');

--Display sum & avg of salaries
select sum(sal) AS SUM, avg(sal) AS AVG, count(EMPNO) as COUNT
from EMP

--department wise number of employees
select DEPTNO, count(DEPTNO) AS COUNT 
from emp 
group by DEPTNO;

--Job wise number of employees
select JOB, count(JOB) AS COUNT 
from emp 
group by JOB;

--department wise, job wisenumber of emp
select DEPTNO, count(DEPTNO) AS DEPTCOUNT, JOB, count(JOB) AS JOBCOUNT 
from emp
group by DEPTNO, JOB

--which dept has max emp
select top 1 DEPTNO, count(DEPTNO) AS EMPCOUNT 
from EMP
group by DEPTNO
order by count(DEPTNO) desc
 
--which dept has max emp having count greater than 3
select DEPTNO, count(DEPTNO) AS EMPCOUNT 
from EMP
group by DEPTNO
having count(DEPTNO) >3 
order by count(DEPTNO) desc

--select top three salaried emp
select top 3 * 
from EMP
order by sal desc 

--inner join emp & dept
select EMP.ENAME, DEPT.DNAME
from DEPT
INNER JOIN EMP ON DEPT.DEPTNO=EMP.DEPTNO

--department name wise number of emp
select DNAME, count(ENAME) AS EMPCOUNT
from DEPT
INNER JOIN EMP ON DEPT.DEPTNO=EMP.DEPTNO 
group by DNAME

--emp & manager inner join (self join)
select a.ENAME as EMP, b.ENAME as MGR
from EMP a, EMP b
where a.MGR=b.EMPNO

--display emp name, mngr name & depart name
select EMP.ENAME as EMP, BOSS.ENAME as MGR, DEPT.DNAME as DEPART
from ((EMP
inner join EMP as Boss on EMP.EMPNO=Boss.MGR)
inner join DEPT on EMP.DEPTNO=DEPT.DEPTNO);

--Display all DNAME with ENAME
select DEPT.DNAME, EMP.ENAME
from DEPT
left join EMP on DEPT.DEPTNO=EMP.DEPTNO

--Display dname not having any emp
select DEPT.DNAME, EMP.ENAME
from DEPT
left join EMP on DEPT.DEPTNO=EMP.DEPTNO
where EMP.ENAME is null
