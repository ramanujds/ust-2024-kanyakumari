CREATE table trainee(id numeric(4),name varchar(50), 
location varchar(100), date_joined date);

select * from trainee;

insert into trainee (id,name,location, date_joined) VALUES
        (1,'Charan','Chennai','10-10-2024');
        

insert into trainee values(2, 'Kodi Bharadwaj', 'Srikakulam', '01-01-2020');
insert into trainee values (3, 'Maarcus', 'Chennai', '04-03-2021')

INSERT INTO Trainee VALUES (4, 'Pavan', 'Trivadrum', '10-10-2000');
INSERT INTO Trainee VALUES (5, 'Akash', 'Palakkad','10-10-2024');
insert into trainee values (6, 'Chandra Lokesh', 'Hyderabad','10-10-2024');
insert into trainee values(7,'Sahithi','Hyderabad','10-08-2024');
insert into trainee values (8,'Hariprasad','Kerala','10-10-2024');
insert into trainee(id,name,location,date_joined) VALUES (9,'Sharon','Chennai','20-08-2024');
INSERT INTO trainee VALUES(10,'Arun','Chennai','10-10-2024');

insert into trainee values(103,'sujitha','chennai','10-10-2024');
insert into trainee values(104,'yamini','hyderabad','10-10-2024');
insert into trainee values(105,'susrutha','warangal','10-10-2024');
insert into trainee values(121,'Eugene','chennai','11-08-2024');

ALTER table trainee add language varchar(30);

alter table trainee alter COLUMN id NUMERIC(4) not null;

update trainee set language='Tamil' where id=1;

alter table trainee add primary key(id);

insert into trainee (id) VALUES
        (1001);

delete from trainee where id = 1001;


select * from trainee;

UPDATE trainee set language='Malayalam' where language is NULL;

SELECT * from trainee ORDER by date_joined desc;

SELECT distinct location from trainee;

SELECT location,COUNT(1) as 'Total Trainees' from trainee group by location;

select * from trainee where date_joined like '2024-%';

SELECT * from trainee where YEAR(date_joined)=2024

SELECT * from trainee where MONTH(date_joined)=1


SELECT id,name,date_joined, DATEDIFF(YEAR,date_joined,getdate()) as 'Days since joined' from trainee;

SELECT id,name,date_joined, DATEDIFF(YEAR,date_joined,getdate()) as 'Years', DATEDIFF(MONTH,date_joined,getdate())%12 as 'Months' from trainee;


-- create a new table project with columns id, title, start_date, end_date, status

CREATE table project (id numeric(4) not null primary key,title varchar(50), start_date date, end_date date, status char(20));

INSERT into project VALUES(101,'User Portfolio Management', '10-15-2024','11-15-2024','Not Started');
INSERT into project VALUES(102,'Stock Exchange', '8-10-2024','10-10-2024','On Going');
INSERT into project VALUES(103,'Banking System', '6-20-2024','8-20-2024','Completed');
INSERT into project VALUES(104,'Hospital Management', '10-10-2024','12-10-2024','Not Started');
INSERT into project VALUES(105,'E-Commerce', '10-10-2024','12-10-2024','Not Started');

SELECT * from project;

-- Constraint

-- Primary Key

-- Not Null

-- Unique

-- Default

-- Check

-- Foreign Key

select * from trainee;

ALTER table trainee add project_id NUMERIC(4);

ALTER table trainee add project_lead NUMERIC(4);

update trainee set project_id=100 where id in(1,3,5);
update trainee set project_id=102 where id in(2,6);
update trainee set project_id=103 where id in(4,103,104);
update trainee set project_id=104 where project_id is null;

update trainee set project_lead=3 where id=3;

-- foreign key

ALTER TABLE trainee add CONSTRAINT fk_project_id FOREIGN KEY(project_id) REFERENCES project(id)


-- joins

-- Outer Join
-- Left Join
-- Right Join
-- Full Join

-- Inner Join

-- Cross Join

-- Self Join

insert into trainee values(131,'Suhel','Hyderabad','11-08-2024','Telugu',null);

SELECT t.id,t.name,t.project_id,p.id,p.title from trainee t JOIN project p on t.project_id=p.id;

-- find projects that are not been allocated to any trainee

SELECT p.id,p.title from project p left JOIN trainee t on t.project_id=p.id where t.id is null;


-- find the trainee who is not been assigned to a project

SELECT t.* from trainee t left JOIN project p on t.project_id=p.id where p.id is null;

-- Find all the project leads

select distinct project_lead from trainee;

SELECT id, name from trainee where id in (select distinct project_lead from trainee);

SELECT distinct p.name from trainee t join trainee p on t.project_lead=p.id;


-- Find the trainne names along with their leads

SELECT t.name, p.name from trainee t join trainee p on t.project_lead=p.id;


-- find the total trainees under each leads

SELECT p.name, COUNT(t.id) as 'Team Size' from 
trainee t join trainee p on t.project_lead=p.id group by p.name;

-- find the the trainees who are working under team leads having same language

SELECT t.name, p.name as 'Team Lead' from trainee t join trainee p on t.project_lead=p.id WHERE p.language=t.language and p.id <> t.id;

-- add a new column salary

ALTER table trainee add salary DECIMAL(7,2); 

UPDATE trainee set salary=72000.00 where id = 6;

select * from trainee;

-- find the highest paid team lead

select distinct p.id, p.name, p.salary
        FROM trainee t JOIN trainee p 
        on t.project_lead = p.id where 
        p.salary=(select MAX(salary) FROM trainee t where id IN
        (select project_lead from trainee) );



-- find the trainee along with the project names


SELECT t.id, t.name, t.project_id, 
                (select p.title from project p where p.id=t.project_id) 
                as 'Project Title' from trainee t; 


-- find the project name along with the project lead


SELECT p.title, t.name FROM trainee t join project p on t.project_id=p.id where t.id in(select project_lead from trainee);


SELECT p.title, (select t.name from trainee t where t.project_id=p.id and t.id in(select project_lead from trainee)) 
                as 'Trainne Name' from project p;


-- find the trainees who is getting the highest salary as a non team lead

SELECT id,name,salary,project_id from trainee 
        where id not in(SELECT distinct project_lead from trainee
                         where project_lead is not null) and 
                         salary = (select max(salary) from trainee 
        where id not in(SELECT distinct project_lead from trainee
                         where project_lead is not null))
                



-- find the average salaries being paid to each trainee project wise

SELECT p.id,p.title,AVG(t.salary) as 'Average Salaries' 
                FROM project p JOIN trainee t on p.id=t.project_id
                GROUP by p.id,p.title; 

-- find the project that has the highest paid team lead

select p.id,p.title from trainee t join project p on t.project_id = p.id where t.id in (select project_lead from trainee) and t.salary = (select max(salary) from trainee where id in (select project_lead from trainee));



select id, name, salary, project_id from trainee where id in(select distinct project_lead from trainee)



-- creating procedures


CREATE PROCEDURE getProjectsByStatus(@status CHAR(20))
AS
BEGIN
SELECT * FROM project WHERE status=@status;
END;

-- execute the procedure

EXEC getProjectsByStatus 'Not Started';

-- create a procedure to get the trainees by project status

CREATE PROCEDURE getTraineesByProjectStatus(@status CHAR(20))
AS
BEGIN
SELECT name FROM trainee WHERE project_id in
                (select id from project where status=@status);
END;

drop PROCEDURE getTraineesByProjectStatus

EXEC getTraineesByProjectStatus 'Completed';

-- Creating a Function

CREATE FUNCTION CalculateExperience(@joinedDate DATE)
RETURNS INT
AS
BEGIN
DECLARE @experience INT;
SET @experience = DATEDIFF(YEAR, @joinedDate, GETDATE());
RETURN @experience;
END;

-- execute the function

SELECT dbo.CalculateExperience('10-10-2024');

SELECT name, date_joined, dbo.CalculateExperience(date_joined) as 'Experience' from trainee;

-- create an update trigger to ensure that the salary is not less than 5000

CREATE TRIGGER update_trainee
ON trainee
FOR UPDATE
AS
BEGIN
IF EXISTS (SELECT * FROM inserted WHERE salary < 5000)
BEGIN
RAISERROR ('Error: Salary cannot be negative', 16, 1);
ROLLBACK TRANSACTION;
END
END;


-- raiseerror('message', severity, state)

-- severity 0-10: Informational messages

-- severity 11-16: Warnings

-- severity 17-25: System errors

-- severity 26-50: Fatal errors

-- state: 1-255 : User defined state

-- state 0: No state

-- state 1: User defined state

-- state 2: Foreign key constraint violation

-- state 3: Primary key constraint violation

-- state 4: Unique key constraint violation



update trainee set salary=-500 where id=2;


-- create a trigger to backup the trainee before delete

-- delete trigger

-- create a table trainee_backup

-- create trigger backup_deleted_trainees before delete
-- on trainees
-- for each row
-- begin
-- 	INSERT INTO trainees_backup VALUES(OLD.id,OLD.trainee_name,OLD.email,OLD.location,OLD.laptop_id,OLD.dob,OLD.team_lead);  
-- end

-- convert this mysql trigger to sql server trigger

CREATE table trainee_backup(id numeric(4),name varchar(50),location varchar(100), date_joined date, language varchar(30),project_id numeric(4),project_lead numeric(4), salary decimal(7,2));

create trigger backup_deleted_trainees on trainee
for delete
as
begin
        INSERT INTO trainee_backup SELECT * FROM deleted;
end;

DELETE from trainee where id=1;

SELECT * from trainee_backup;

-- insert the deleted trainee back to the trainee table

INSERT INTO trainee SELECT * FROM trainee_backup WHERE id=1;

EXEC sp_columns trainee;

BEGIN TRANSACTION;
SAVE TRAN p1;

delete from trainee;

ROLLBACK TRANSACTION p1;
COMMIT;



-- exercise queries

-- find the resturants with location

-- id name location

-- find the menu items with price

-- name price categoty

-- find the orders with order date

-- id date rest_id item cust_id quantity total 

-- find the orders in the month of january

-- find most ordered item

-- find the resturants with most orders

-- find the resturants with most orders in the month of january

-- find most ordered items of each resturant

-- find customers who ordered in the month of january

-- find the customers who ordered most

-- top 5 ordered items

-- top 5 resturants with most orders

-- top 5 customers with most orders