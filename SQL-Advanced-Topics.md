
### 1. Views
**Explanation**: Views are virtual tables that provide a way to simplify complex queries, encapsulate logic, and enhance security by restricting access to specific data.
**Use Cases**:
- Simplifying complex joins and aggregations.
- Providing a consistent interface to data for reporting.
- Restricting access to sensitive columns.

**Example**:
```sql
CREATE VIEW ActiveProjects AS
SELECT id, title, start_date, end_date, status
FROM Project
WHERE status = 'Active';
```
This view can be used to quickly access all active projects without writing the full query each time.

### 2. User-Defined Functions (UDF)
**Explanation**: UDFs encapsulate reusable logic that can be used in SQL queries. They can be scalar (return a single value) or table-valued (return a table).
**Use Cases**:
- Performing calculations.
- Formatting data.
- Encapsulating business logic.

**Example**:
```sql
CREATE FUNCTION GetProjectDuration (@ProjectID INT)
RETURNS INT
AS
BEGIN
    DECLARE @Duration INT;
    SELECT @Duration = DATEDIFF(DAY, start_date, end_date)
    FROM Project
    WHERE id = @ProjectID;
    RETURN @Duration;
END;
```
This function calculates the duration of a project in days.

### 3. Triggers
**Explanation**: Triggers automatically execute predefined actions in response to certain events on a table, such as INSERT, UPDATE, or DELETE.
**Use Cases**:
- Enforcing business rules.
- Auditing changes.
- Synchronizing tables.

**Example**:
```sql
CREATE TRIGGER trgAfterUpdate
ON Trainee
AFTER UPDATE
AS
BEGIN
    INSERT INTO AuditLog (TraineeID, ChangeDate, ChangeType)
    SELECT id, GETDATE(), 'Update'
    FROM inserted;
END;
```
This trigger logs updates to the `Trainee` table in an `AuditLog` table.

### 4. Stored Procedures
**Explanation**: Stored procedures are precompiled collections of SQL statements that can be executed as a single unit. They improve performance and security.
**Use Cases**:
- Encapsulating complex business logic.
- Automating repetitive tasks.
- Enhancing security by controlling access to data.

**Example**:
```sql
CREATE PROCEDURE AssignProject
    @TraineeID INT,
    @ProjectID INT
AS
BEGIN
    UPDATE Trainee
    SET project_id = @ProjectID
    WHERE id = @TraineeID;
END;
```
This procedure assigns a trainee to a project.

### 5. OVER Clause and PARTITION BY
**Explanation**: The OVER clause allows you to perform calculations across a set of table rows related to the current row. PARTITION BY divides the result set into partitions.
**Use Cases**:
- Calculating running totals.
- Ranking rows within partitions.
- Calculating moving averages.

**Example**:
```sql
SELECT id, salary,
       AVG(salary) OVER (PARTITION BY location) AS AvgLocationSalary
FROM Trainee;
```
This query calculates the average salary for trainees in each location.

### 6. CASE-WHEN, EXISTS
**Explanation**: CASE-WHEN provides conditional logic in SQL queries. EXISTS checks for the existence of rows in a subquery.
**Use Cases**:
- Conditional data transformation.
- Filtering based on complex conditions.
- Checking for the existence of related data.

**Example**:
```sql
SELECT id, 
       CASE 
           WHEN EXISTS (SELECT 1 FROM Project WHERE Project.id = Trainee.project_id)
           THEN 'Assigned to Project'
           ELSE 'Not Assigned'
       END AS ProjectStatus
FROM Trainee;
```
This query checks if a trainee is assigned to a project.

### 7. OUTER APPLY in Joins
**Explanation**: OUTER APPLY is used to join a table with a table-valued function. It returns all rows from the left table and the matched rows from the right table.
**Use Cases**:
- Joining with table-valued functions.
- Performing complex joins that require row-by-row processing.

**Example**:
```sql
SELECT t.id, t.name, p.title
FROM Trainee t
OUTER APPLY (SELECT title FROM Project p WHERE t.project_id = p.id) p;
```
This query retrieves the project title for each trainee, if available.

### 8. Common Table Expressions (CTE)
**Explanation**: CTEs provide a way to define temporary result sets that can be referenced within a SELECT, INSERT, UPDATE, or DELETE statement.
**Use Cases**:
- Simplifying complex queries.
- Improving readability and maintainability.
- Recursive queries.

**Example**:
```sql
WITH TraineeCTE AS (
    SELECT id, name, location, date_joined, language, project_id, salary
    FROM Trainee
)
SELECT * FROM TraineeCTE WHERE location = 'Hyderabad';
```
This CTE simplifies the query to retrieve trainees from Hyderabad.

### 9. Temporary Tables
**Explanation**: Temporary tables store temporary data that is visible only within the session that created them.
**Use Cases**:
- Storing intermediate results.
- Breaking down complex queries.
- Improving performance by reducing the number of joins.

**Example**:
```sql
CREATE TABLE #TempTrainee (id INT, name VARCHAR(50), location VARCHAR(50));
INSERT INTO #TempTrainee VALUES (1, 'John Doe', 'Hyderabad');
SELECT * FROM #TempTrainee;
DROP TABLE #TempTrainee;
```
This temporary table stores trainee data for intermediate processing.

### 10. Table Variables
**Explanation**: Table variables are used to store a set of records temporarily within a batch or stored procedure.
**Use Cases**:
- Storing small sets of data.
- Reducing locking and logging overhead.
- Simplifying code.

**Example**:
```sql
DECLARE @TraineeVar TABLE (id INT, name VARCHAR(50), location VARCHAR(50));
INSERT INTO @TraineeVar VALUES (1, 'Jane Doe', 'Bangalore');
SELECT * FROM @TraineeVar;
```
This table variable stores trainee data for temporary use.

### 11. Local Temp Tables (#)
**Explanation**: Local temporary tables are visible only to the session that created them and are automatically dropped when the session ends.
**Use Cases**:
- Storing session-specific data.
- Reducing the scope of temporary data.
- Improving performance by limiting visibility.

**Example**:
```sql
CREATE TABLE #LocalTemp (id INT, name VARCHAR(50), location VARCHAR(50));
INSERT INTO #LocalTemp VALUES (1, 'Alice', 'Chennai');
SELECT * FROM #LocalTemp;
DROP TABLE #LocalTemp;
```
This local temporary table stores trainee data for the current session.

### 12. Global Temp Tables (##)
**Explanation**: Global temporary tables are visible to all sessions and are dropped when the last session referencing them ends.
**Use Cases**:
- Sharing temporary data across sessions.
- Storing data that needs to be accessed by multiple users.
- Reducing the need for permanent tables.

**Example**:
```sql
CREATE TABLE ##GlobalTemp (id INT, name VARCHAR(50), location VARCHAR(50));
INSERT INTO ##GlobalTemp VALUES (1, 'Bob', 'Mumbai');
SELECT * FROM ##GlobalTemp;
DROP TABLE ##GlobalTemp;
```
This global temporary table stores trainee data accessible by all sessions.

### 13. Persistent Temp Tables (TempDB)
**Explanation**: Persistent temp tables are stored in the TempDB database and can be used for temporary data storage.
**Use Cases**:
- Storing large sets of temporary data.
- Reducing the need for permanent tables.
- Improving performance by using TempDB.

**Example**:
```sql
USE TempDB;
CREATE TABLE PersistentTemp (id INT, name VARCHAR(50), location VARCHAR(50));
INSERT INTO PersistentTemp VALUES (1, 'Charlie', 'Delhi');
SELECT * FROM PersistentTemp;
DROP TABLE PersistentTemp;
```
This persistent temp table stores trainee data in TempDB.

### 14. Execution Plan Analysis
**Explanation**: Execution plans show how SQL Server executes a query, including the steps and resources used.
**Use Cases**:
- Identifying performance bottlenecks.
- Understanding query execution.
- Optimizing queries.

**Example**:
```sql
-- To view the execution plan
SET SHOWPLAN_ALL ON;
GO
SELECT * FROM Trainee;
GO
SET SHOWPLAN_ALL OFF;
```
This command enables the display of the execution plan for a query.

### 15. Query Optimization
**Explanation**: Query optimization involves improving the performance of SQL queries by using various techniques and best practices.
**Use Cases**:
- Reducing query execution time.
- Minimizing resource usage.
- Improving overall database performance.

**Example**:
- **Use indexes**: Create indexes on columns used in WHERE clauses and joins.
- **Avoid SELECT ***: Select only the columns you need.
- **Use joins instead of subqueries**: Joins are generally more efficient than subqueries.

### 16. Isolation Levels, Locks, Deadlocks
**Explanation**: Isolation levels control the visibility of changes made by one transaction to other transactions. Locks prevent multiple transactions from accessing the same data simultaneously. Deadlocks occur when two transactions block each other.
**Use Cases**:
- Ensuring data consistency.
- Preventing data corruption.
- Managing concurrent access to data.

**Example**:
```sql
-- Setting isolation level
SET TRANSACTION ISOLATION LEVEL READ COMMITTED;
BEGIN TRANSACTION;
-- Transactional operations
COMMIT;
```
This command sets the isolation level
