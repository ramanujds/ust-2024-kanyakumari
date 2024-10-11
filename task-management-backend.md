## **Assignment: Build a Personal Task Management Web Application**

### **Objective:**
Develop a Spring Boot application that allows users to manage their personal tasks. 

### **Task Model:**
The application should include a `Task` model with the following attributes:
- **id**: `int` 
- **name**: `String` 
- **description**: `String` 
- **dueDate**: `LocalDate`
- **status**: `enum` (`PENDING`, `COMPLETED`)

**Any extra field you can add as per your need**

### **API Endpoints:**

- **POST** `/api/v1/tasks`: Create a new task.
- **GET** `/api/v1/tasks`: Retrieve a list of all tasks.
- **GET** `/api/v1/tasks/{id}`: Retrieve a specific task by its ID.
- **GET** `/api/v1/tasks/status`: Retrieve tasks based on their status (e.g., `PENDING`, `COMPLETED`).
- **GET** `/api/v1/tasks/overdue`: Retrieve all overdue tasks.
- **PUT** `/api/v1/tasks/{id}`: Update a specific task by its ID.
- **DELETE** `/api/v1/tasks/{id}`: Delete a specific task by its ID.
- **GET** `/api/v1/tasks/sort`: Retrieve tasks sorted by due date
- **GET** `/api/v1/tasks/deleted` : Retrieve all deleted tasks

### **Exception Handling:**
Implement proper exception handling to manage cases such as:

- Task not found (e.g., when accessing or deleting a non-existing task).
- Invalid input data (e.g., creating or updating a task with missing or incorrect fields).
- Use proper status codes
