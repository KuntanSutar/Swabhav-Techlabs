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
 MGR                 integer,
 HIREDATE            DATETIME,
 SAL                 INTEGER,
 COMM                INTEGER,
 DEPTNO              integer NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT MGR_FOREIGN_KEY FOREIGN KEY (MGR) REFERENCES EMP (EMPNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO));
 
INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'1983-01-12',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);
INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'1983-01-12',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);

select * from emp;
select * from dept;

--display emp names:
select ename 
from emp;

--display emp names in lowercase
select lower(ename) 
from emp;

--display emp names in ascending order
select ename 
from emp order by ename asc;

--display emp names in descending order
select ename 
from emp order by ename desc;

--display department number from emp
select deptno from emp;

--display unique department number from emp
select distinct deptno 
from emp;

-- display ename , salary of 'king'
select ename, sal 
from emp 
where ename='king';

--display emp names in dept 10
select ename 
from emp 
where deptno=10;

--display all employee where name starts with s
select * 
from emp 
where ename like 's%';

--display all employee where name ends with n
select * 
from emp 
where ename like '%n';

--display all employees with commission is null
select * 
from emp 
where comm is null; 

--display all emloyees who are in department 10 and 20
select * 
from emp 
where deptno=10 or deptno=20;

--display salary , commission , ctc(salary + commission) of all employee
select sal,comm,((sal) + (comm)) as ctc 
from emp;
select sal,comm,ctc=sal+comm 
from emp;
select sal,comm,coalesce(sal+comm,sal,comm) as ctc 
from emp;

--display all employee who are clerk
select * 
from emp 
where job='clerk';

--display current date
select current_timestamp;

--display all employee who are 'analyst' and 'manager'
select * 
from emp 
where job in ('analyst','manager');

--display joining date and tenure
select hiredate,current_timestamp,datediff(current_timestamp,hiredate) as tenure 
from emp;

--display employee who are working in department same dept of smith
select * 
from emp 
where deptno=(select deptno from emp where ename='smith');

--display employee who has same salary of scott
select * 
from emp 
where sal=(select sal from emp where ename='scott');

--display employee who has same designation as blake
select * 
from emp 
where job=(select job from emp where ename='blake');

--display average salary and sum of salary and total count of employee 
select avg(sal) as average_salary,sum(sal)as total_salary,count(empno)as total_employee  from emp;

--display department wise employee number
select deptno,count(empno) as total_employee 
from emp group by deptno;

--display department wise job wise number of employees
select job,count(empno) as total_employee 
from emp group by job;

--which department has max number of employees
select  count(deptno) as max_employee,deptno 
from emp group by deptno order by count(deptno) desc limit 1;

--which department has max number of employees greater than 3
select  count(deptno) as max_employee,deptno 
from emp group by deptno having count(deptno)>3 order by count(deptno) desc;


--select top 3 salary of employee
select sal 
from emp order by sal desc limit 3;

--display employee name and deptname by join
select emp.ename,dept.dname 
from emp 
inner join dept on emp.deptno=dept.deptno;

--display count of employee number and deptname by join deptname wise
select count(emp.ename) as count_emp,dept.dname 
from emp 
inner join dept on emp.deptno=dept.deptno 
group by dname;

--self 

select e.ename as emp_name,d.ename as boss_name 
from emp as e 
inner join emp as d on e.empno=d.mgr;


--join on three tables
select e.ename as emp_name,d.ename as boss_name,dept.dname
from ((emp as e 
inner join emp as d on e.empno=d.mgr) inner join dept on e.deptno=dept.deptno);

--display all department names and associated employess
select dept.dname, emp.ename
from dept
left join emp on dept.deptno = emp.deptno;

--display all department names where no employees
select dept.dname, emp.ename
from dept
left join emp on dept.deptno = emp.deptno where emp.ename is null;