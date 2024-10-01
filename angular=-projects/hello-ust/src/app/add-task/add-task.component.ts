import { Component } from '@angular/core';
import { Task } from '../model/Task';
import { ViewTaskListComponent } from "../view-task-list/view-task-list.component";
import { TaskManagementService } from '../task-management.service';

@Component({
  selector: 'app-add-task',
  standalone: true,
  imports: [ViewTaskListComponent],
  templateUrl: './add-task.component.html',
  styleUrl: './add-task.component.css'
})
export class AddTaskComponent {

  constructor(private taskService:TaskManagementService) { }
  

  addTask(id:string, name:string, description:string, dueDate:string, completed:string){ 
    let task = new Task(parseInt(id), name, description, dueDate, completed?true:false);
    this.taskService.addTask(task);
    
  }

 
}
