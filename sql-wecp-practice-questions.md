## SQL Query for Movie Reviews

### Problem Statement
You want to retrieve a list of movie reviewer names based on the ratings they have given.

Write a SQL query to display all distinct movie reviewer names who have given review stars greater than or equal to 6.

```sql
select distinct R.REV_NAME 
from REVIEWER R 
join MOVIES M on R.REV_ID = M.REV_ID
where M.REV_STARS >= 6;
```

## SQL Query: Average Prices

### Problem Statement
You want to perform a comparative analysis of the average price of various items based on manufacturing company code.

Write a SQL query to display the average ITEM_PRICE of all items for each manufacturing company along with the MAN_COM_CODE.

```sql
select avg(ITEM_PRICE), MAN_COM_CODE
from ITEMS
group by MAN_COM_CODE;
```

## Customer Order Retrieval

### Problem Statement
You want to retrieve customer details based on the order placed.

Write a SQL query to display the name of all customers who have placed an order after 31-AUGUST-2023.

```sql
select distinct name 
from customers c 
join orders o on c.id = o.customer_id
where o.order_date > '2023-08-31';
```

## Highest GPA Query

### Problem Statement
You want to display student details based on the GPA.

Write a SQL query to display the stu_id, and first_name for students having the highest GPA.

```sql
select stu_id, first_name
from students
where gpa in (
    select max(gpa)
    from students
);
```

## Course Enrollment Report

### Problem Statement
You want to generate a report of all the courses based on enrollments.

Write a SQL query to display the course_id where at least one student has joined after September 25th.

```sql
select distinct course_id 
from enrollments
where join_date > '2023-09-25';
```

## Customer Purchase Report

### Problem Statement
You want to generate a report of customers based on the purchases made.

Write a SQL query to display the name and total_amount of all customers who have made a purchase of over $100.

```sql
select name, total_amount
from customers c 
join purchases p on c.id = p.customer_id
where total_amount > 100;
```

## High Scorers

### Problem Statement
You want to retrieve student details based on their scores.

Write a SQL query to display the name of all students who have scored above 90% in the exam.

```sql
select s.name, e.score 
from students s 
join exams e on s.id = e.student_id
where e.score >= 90;
```
