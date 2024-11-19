# UST Classroom Repository

## Welcome to UST

## MacOS Docker Build to Build x86 Image

docker buildx build --platform=linux/amd64 -t [iamge-name] .

## Online Shopping Case Study

https://github.com/ramanujds/online-shopping-app


## College-Student Management Example

https://github.com/suhas991/College_Management

## Team Assignments

## Team 1: HTML Forms
**Topic**: HTML Forms: Input types, labels, buttons, and form structure.  
**Demo**: Creating an HTML Form and adding validations.

## Team 2: Styling Forms with CSS
**Topic**: Focus on enhancing user interface (button styles, form layout, focus effects).  
**Demo**: Styling a form with CSS for better layout and user interaction.

## Team 3: CSS Positioning Techniques
**Topic**: Overview of CSS positioning techniques (relative, absolute, fixed, sticky).  
**Demo**: Building a simple webpage with a sticky header or floating elements.


## Team 4: Flexbox Layout Model
**Topic**: Introduction to the Flexbox layout model.  
**Demo**: Building a simple navigation bar with CSS Flexbox.

## Team 5: Introduction to Semantic HTML, CSS Selectors
**Topic**: Understanding Semantic HTML.  
**Demo**: Creating a well-structured webpage with semantic elements like `<header>`, `<nav>`, `<article>`, and `<footer>`.

## Team 6: HTML IFrames and Embedding Content
**Topic**: Embedding external content with `<iframe>`.  
**Demo**: Embedding a YouTube video or Google Maps into a webpage and styling it.

## Team 7: CSS Box Model, Media Query
**Topic**: Understanding the CSS Box Model (content, padding, border, margin).  
**Demo**: Designing a card or section layout with proper padding, borders, and margins.

## Team 8: CSS Units and Float Property, Transition
**Topic**: Exploring CSS units (`px`, `em`, `rem`, `%`) and the float property.  
**Demo**: Creating a simple page and adjusting the font size using different units, and creating a basic layout with floated elements.



## MS SQL Server Installation

### Docker Commands

```bash
docker pull mcr.microsoft.com/mssql/server
```

```bash
docker run -e "ACCEPT_EULA=1" -e "MSSQL_SA_PASSWORD=MyStrongPass123" -e "MSSQL_PID=Developer" -e "MSSQL_USER=SA" -p 1433:1433 -d --name=sql mcr.microsoft.com/mssql/server
```

### Install Azure Data Studio


## Day 1 - Aug-19-2024

### **What Are We Going to Learn?**

1. **Java SE:** Core Java syntax, OOP concepts, and essential libraries.
2. **Java EE:** Enterprise features for building large-scale web applications.
3. **Database:** Basics of SQL and database interaction with Java.
4. **Spring Framework:** Simplifying Java development with Spring Boot.
5. **Microservices:** Architecting small, independently deployable services.
6. **Docker:** Containerization for consistent and scalable deployments.
7. **AWS:** Introduction to cloud services for deploying Java applications.
8. **React/Angular:** Building dynamic, front-end web applications.

### **Agile:**

- Overview of Agile principles and practices in software development.

### **SDLC:**

- Introduction to the Software Development Life Cycle and its stages.

### **Daily Standup:**

- Understanding the purpose and format of daily Agile meetings.

---

### **What Did We Learn Yesterday?**

- A quick recap of the previous day's topics and key takeaways.

---

### **What Are We Going to Learn Today?**

- Overview of the day's agenda and learning objectives.

---

### **Any Challenges?**

- Discussing any obstacles faced during the training or development process.

---

### **4Ls:**

- **Loved:** What was particularly enjoyable or valuable.
- **Lacked:** Areas where information or resources were insufficient.
- **Learned:** New knowledge or skills gained.
- **Longed For:** What could have been included or improved.

---

### **Dev Setup:**

- **JDK 21:** Installing and configuring the latest Java Development Kit.
- **IDEA/VSCode:** Setting up your preferred IDE for Java development.
- **Git:** Version control setup and basics.
- **MySQL/SQLServer:** Database setup for development.
- **Node.js:** Installing Node.js for full-stack or front-end development.


  How to clone a repository?
  --------------------------


  1. Go to the repository
  2. Click on Clone
  3. Clone SSH
     (_ Copy the link_)
  4. Open Termainal/CMD inside your desired folder

  * <b> Few important points</b>
  * copy the private-key in the desired folder
  * Also add the private key on your on that desired folder using terminal/git-bash
  * Hints - repeat the eval and ssh-add commands

  1. Type ```git clone <repo-link>```

  How commit new changes?
  -----------------------

  1. Add all the changes to stagging
     ```git add .```
  2. Commit the changes
     ```git commit -m "a suitable message"```

  * <b> NB: Commit will save all the changes to local repository </b>

  1. Update/Push the commit to remote
     ``` git push```

  <b> NB: To see the status of the repository we can use </b> ```git status```

  How to get all the changes from remote to local?
  ------------------------------------------------

  ```git pull```

  Steps for completing the Exercises/Assignments
  ----------------------------------------------

  1. Go to the respective exercise/assignment repo
  2. Fork the repo
  3. Clone the <b>forked</b> repo on your local machine (Hints - Follow the previous steps)

  * <b> NB. Don't clone a repository inside another repository </b>

  1. Modify/Complete the exercise
  2. Commit and Push

  ```markdown
# Day 2 - Aug 20, 2024

## Standup

### What did we learn yesterday?
- **Git Setup**
  - Git clone, commit, push
- **Software Setup**

### What are we going to do today?
- **Java**
- **Software Development Process**

### Any challenges?
- **Manya** has issues accessing the Company Portal.

## Fullstack Developer Roadmap

### Backend
- **Languages**: Java, .NET, PHP, Python, JavaScript
- **Frameworks**: Spring Framework, Django, Express JS
- **Databases**: MySQL, Postgres, MongoDB
- **Messaging**: Kafka

### Frontend
- **Core Technologies**: HTML, CSS, JavaScript
- **Libraries/Frameworks**: Bootstrap, Angular, React

### DevOps
- **Version Control**: Git
- **Build Tools**: Maven, NPM
- **CI/CD**: Jenkins, SonarQube
- **Cloud Platforms**: AWS, Azure, GCP
- **Containerization**: Docker, Kubernetes
- **Infrastructure as Code**: Terraform, Ansible

### Project Management
- **Tools**: Jira

## Java Concepts

### Variables, Identifiers, Keywords

#### Naming Standards
- **Variables/Methods**: Starts with lowercase, follows camelCase
  - Example: `firstName`, `lastName`, `nextLine()`
- **Class/Interface/Record Names**: Starts with uppercase
  - Example: `Scanner`, `String`
- **Package Naming**: All lowercase
- **Constants/Enums**: Uppercase with underscores
  - Example: `MAX_VALUE = 100`

### Conditional Evaluation
- **If-Else**
- **Loops**
- **Break/Continue**
- **Switch Statement**

## Example: Currency Converter

### Supported Currencies:
1. USD (US Dollar)
2. EUR (Euro)
3. GBP (British Pound)
4. JPY (Japanese Yen)

### Sample Input:
- Enter the amount you want to convert: `100`
- Select the source currency: `1`

## Finding the 2nd Largest Element from an Array

### Example Array:
`6 8 9 2 7 4 3`

# Day 3 - Aug 21, 2024

## Daily Standup

### What did we learn yesterday?
- **Agile**
- **Full-stack Development**
- **Control Structures in Java**

### What are we going to learn today?
- **OOP Concepts**

### Any challenges?
- No

## OOP Concepts in Java

### Example Class:
```java
class Person {
    // Fields and methods
}
```

### Object Creation:
```java
int num = 10;
Person person1 = new Person();
```

### Core OOP Concepts:
- **Encapsulation**
- **Abstraction**
- **Inheritance**
- **Polymorphism**

### Access Modifiers:
- **private**
- **public**
- **protected**
- **default**

# Day 4 - Aug 22, 2024

## Daily Standup

### What did we learn yesterday?
- **OOP Concepts**
- **Practice Programs**

### What are we going to learn today?
- **OOP Concepts**
- **Arrays**
- **Strings**

### Any challenges?
- No

## Arrays in Java

### Example:
```java
int[] arr = new int[10];
Random rand = new Random();

for (int i = 0; i < arr.length; i++) {
    arr[i] = rand.nextInt(90) + 10;
}
```

# Day 5 - Aug 23, 2024

## Daily Standup

### What did we learn yesterday?
- **Arrays**
- **Strings**
- **Layered Architecture**

### What are we going to learn today?
- **Loose Coupling**
- **Interfaces and Inheritance**

### Any challenges?
- No

## Data Types in Java

### Primitive Types:
- `int`, `float`, `long`, `short`, `byte`, `double`, `boolean`, `char`

### Reference Types:
- `String`, `Arrays`, `Object`

## Monday Task Breakdown

### Team Assignments:
- **Team 1**: Method Overloading and Overriding
- **Team 2**: Interface vs Abstract Class with proper use cases for both
- **Team 6**: Arrays and Strings
- **Team 4**: Explore IntelliJ IDEA and shortcuts to streamline the development process
- **Team 3**: Inner classes
- **Team 5**: Association vs Aggregation vs Composition
- **Team 7**: Class Diagram and Sequence Diagram
- **Team 8**: Use Case Diagram, Agile Process

## Day 6 - Aug 26, 2024

## Daily Standup

### What did we learn yesterday?

- **Loose Coupling:**
  - We explored the concept of loose coupling, where components or classes interact with each other with minimal dependencies, making the system more flexible and easier to maintain.
  
- **Interfaces and Inheritance:**
  - We delved into how interfaces provide a way to achieve abstraction and multiple inheritance in Java, and how inheritance allows us to create a new class based on an existing class, promoting code reusability.

### What are we going to learn today?

- **Exception Handling:**
  - We'll be focusing on how Java handles runtime errors, enabling us to write more robust and error-resistant code. Topics include the use of `try`, `catch`, `finally`, `throw`, and `throws`.

### Any challenge?

- No challenges were encountered.

### What are we going to learn this week?

- **Exception Handling:**
  - Continuing our deep dive into managing errors and ensuring our programs handle unexpected situations gracefully.

- **Collection Framework:**
  - We'll learn about Java's powerful collection classes (like `ArrayList`, `HashMap`, etc.) that provide data structures for storing and manipulating groups of objects.

- **Java 8 Stream API:**
  - Understanding the Stream API for processing collections of objects in a functional style, which allows us to write concise and readable code.

- **Multi-Threading:**
  - We'll explore the concepts of concurrent programming, enabling us to execute multiple threads simultaneously to perform tasks in parallel.

- **File Handling:**
  - Learning how to read from and write to files in Java, which is essential for data persistence.

- **MySQL + JDBC:**
  - We'll dive into database connectivity, understanding how Java applications interact with MySQL databases using JDBC (Java Database Connectivity).

---

### Exception Handling

#### `throw`
- Used to explicitly throw an exception from a method or any block of code. The type of exception to be thrown must be derived from the `Throwable` class.

#### `throws`
- Used in method signatures to declare the exceptions that a method can throw, informing the caller that they must handle these exceptions.

#### Exception Handling with respect to Method Overriding

- **When the super method doesn't throw an exception:**
  - The child method cannot throw any checked exception, ensuring that overriding methods remain compatible with the contract of the parent class.

- **When the super method throws an exception:**
  - The child method can throw the same exception or a subclass of the exception, but it cannot throw a broader (super type) exception, maintaining the principle of substitution.


## Day 7 - Aug 27, 2024

## Daily Standup

### What did we learn yesterday?

- **Exception Handling:**
  - We covered how to manage runtime errors in Java using `try`, `catch`, `finally`, `throw`, and `throws`. We also discussed how exception handling integrates with method overriding.

### What are we going to learn today?

- **Collection Framework:**
  - Today's focus will be on the Collection Framework, exploring different types of collections, such as `List`, and understanding their characteristics and performance.

### Any challenge?

- No challenges were encountered.

---

### Collection Framework

#### List
- An **ordered** collection that **allows duplicates** and **maintains insertion order**.
- Elements can be accessed and modified based on their **index**.

#### Comparing Common Collections:

| Collection Type | Insertion Time | Access Time |
|-----------------|----------------|-------------|
| `ArrayList`     | O(1)           | O(n)        |
| `LinkedList`    | O(1)           | O(n)        |
| `HashSet`       | O(1)           | O(1)        |

# Day 8 - Aug 28, 2024

## Map

### HashMap
- A key-value pair data structure that does not maintain any order.
- Provides constant-time performance (O(1)) for basic operations like adding and accessing elements.

### TreeMap
- A key-value pair data structure that maintains a sorted order based on the natural ordering of keys or by a specified comparator.
- Generally slower than `HashMap` but useful when order is important.

### Finding the Occurrences of Characters with a Map

Given the word "Hello":

| Character | Occurrences |
|-----------|-------------|
| H         | 1           |
| e         | 1           |
| l         | 2           |
| o         | 1           |

- Use the `containsKey(key)` method to check if a character is already in the map before updating its count.
