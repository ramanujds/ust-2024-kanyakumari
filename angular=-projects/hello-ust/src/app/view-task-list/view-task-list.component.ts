import { Component, Input } from '@angular/core';
import { Task } from '../model/Task';
import { TaskCardComponent } from "../task-card/task-card.component";
import { CommonModule } from '@angular/common';
import { TaskManagementService } from '../task-management.service';

@Component({
  selector: 'app-view-task-list',
  standalone: true,
  imports: [TaskCardComponent, CommonModule],
  templateUrl: './view-task-list.component.html',
  styleUrl: './view-task-list.component.css'
})
export class ViewTaskListComponent {

 constructor(public taskService:TaskManagementService) { 
 }




}