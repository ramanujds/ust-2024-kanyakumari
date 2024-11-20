import { Component } from '@angular/core';
import { TodoDataService } from '../todo-data.service';
import { CommonModule } from '@angular/common';
import { TodoCardComponent } from "../todo-card/todo-card.component";

@Component({
  selector: 'app-view-todos',
  standalone: true,
  imports: [CommonModule, TodoCardComponent],
  templateUrl: './view-todos.component.html',
  styleUrl: './view-todos.component.css'
})
export class ViewTodosComponent {

  constructor(public todoDataService:TodoDataService){}


}
