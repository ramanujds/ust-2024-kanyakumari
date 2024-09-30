import { Component } from '@angular/core';
import { Task } from '../model/Task';
import { ViewTaskListComponent } from "../view-task-list/view-task-list.component";

@Component({
  selector: 'app-add-task',
  standalone: true,
  imports: [ViewTaskListComponent],
  templateUrl: './add-task.component.html',
  styleUrl: './add-task.component.css'
})
export class AddTaskComponent {

  taskList:Array<Task> = [{
    id: 1,
    name: 'Learn Java',
    description: 'Learn Java Description',
    dueDate: '2024-09-01',
    completed: true
  },
  {
    id: 2,
    name: 'Learn Angular',
    description: 'Learn Angular Description',
    dueDate: '2024-10-10',
    completed: false
  },
  {
    id: 3,
    name: 'Learn Python',
    description: 'Learn Python Description',
    dueDate: '2024-09-01',
    completed: false
  }];

  addTask(id:string, name:string, description:string, dueDate:string, completed:string){ 
    let task = new Task(parseInt(id), name, description, dueDate, completed?true:false);
    this.taskList.push(task);
    this.taskList.forEach(task => console.log(task));
    
  }

  deleteTask(id:number){
    confirm('Are you sure you want to delete this task?');
    const index = this.taskList.findIndex(task => task.id == id);
    if(index !== -1){
      this.taskList.splice(index, 1);
    }
  }

}
