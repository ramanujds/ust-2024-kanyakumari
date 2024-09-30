import { Component, Input } from '@angular/core';
import { Task } from '../model/Task';

@Component({
  selector: 'app-task-card',
  standalone: true,
  imports: [],
  templateUrl: './task-card.component.html',
  styleUrl: './task-card.component.css'
})
export class TaskCardComponent {

  @Input('task')
  task?:Task;

 

}
