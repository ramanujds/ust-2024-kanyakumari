## **Assignment: Build a Personal Task Management Web App**

### **Objective:**
Create a responsive web app that allows users to manage personal tasks using **HTML, CSS, Bootstrap, and JavaScript**. 

#### The app should include:
- A **header** with a navigation bar.
- A **footer** with contact information.
- A section with **cards** for displaying tasks.
- Implement **CRUD operations** (Create, Read, Update, Delete) for tasks.

---

### **Requirements:**

#### **1. Structure & Layout (HTML & Bootstrap)**
- Create a **navigation bar** (header) using Bootstrap.
    - Include links for "Home", "Tasks", and "About".
- Create a **footer** section at the bottom with some contact info or a copyright statement.
- Create a **card-based layout** to display tasks. Use Bootstrap's card component to organize task details.
    - Each task should be displayed inside a Bootstrap card.
    - Each card should have a title (task name) and description (task details).

#### **2. Use **Bootstrap** for grid layout and responsive design.

  
#### **3. Tasks 

    - Allow users to add new tasks using a form.
    - Once the form is submitted, a new task card should be added to the page. 
    - Display all tasks inside cards when the page is loaded.
    - Allow users to edit task details (both task name and task description).
    - When a task is edited, update the card with the new information.
    - Allow users to delete tasks.
    - Once a task is deleted, remove the corresponding card from the page.


#### Use JSON Server and the floowing tasks.json File


```json

{
  "tasks": [
    {
      "id": 1,
      "name": "Complete Assignment",
      "description": "Finish the HTML, CSS, Bootstrap, and JS task",
      "dueDate": "2024-09-28",
      "completed": false
    },
    {
      "id": 2,
      "name": "Play Cricket",
      "description": "Reach the turf on time tonight to play cricket",
      "dueDate": "2024-09-28",
      "completed": false
    },
    {
      "id": 3,
      "name": "Plan Weekend",
      "description": "Decide on activities for the upcoming weekend",
      "dueDate": "2024-09-29",
      "completed": false
    }
  ]
}

```

