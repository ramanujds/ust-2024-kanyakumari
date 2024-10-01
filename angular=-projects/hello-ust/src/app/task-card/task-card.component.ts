import { Component, Input } from '@angular/core';
import { Task } from '../model/Task';
import { CommonModule } from '@angular/common';
import { TaskManagementService } from '../task-management.service';

@Component({
  selector: 'app-task-card',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './task-card.component.html',
  styleUrl: './task-card.component.css'
})
export class TaskCardComponent {

  @Input('task')
  task?:Task;

  constructor(private taskService:TaskManagementService) { }
 
  deleteTask(id:any){
    confirm('Are you sure you want to delete this task?');
    this.taskService.delteTask(id);
  }

}
