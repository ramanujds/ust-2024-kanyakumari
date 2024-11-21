import { Component, OnInit } from '@angular/core';
import { TodoDataService } from '../todo-data.service';
import { CommonModule } from '@angular/common';
import { TodoCardComponent } from "../todo-card/todo-card.component";
import { TodoApiService } from '../todo-api.service';
import { Todo } from '../model/Todo';

@Component({
  selector: 'app-view-todos',
  standalone: true,
  imports: [CommonModule, TodoCardComponent],
  templateUrl: './view-todos.component.html',
  styleUrl: './view-todos.component.css'
})
export class ViewTodosComponent implements OnInit {


  constructor(public todoDataService:TodoDataService){}

  ngOnInit(): void {
    this.todoDataService.fetchTodos()
   
  }

  


}
