import { Component, OnInit } from '@angular/core';
import { TodoDataService } from '../todo-data.service';
import { CommonModule } from '@angular/common';
import { TodoCardComponent } from "../todo-card/todo-card.component";
import { TodoApiService } from '../todo-api.service';
import { Todo } from '../model/Todo';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-view-todos',
  standalone: true,
  imports: [CommonModule, TodoCardComponent,RouterModule],
  templateUrl: './view-todos.component.html',
  styleUrl: './view-todos.component.css'
})
export class ViewTodosComponent implements OnInit {

  todos:Array<Todo>=[]

  constructor(private todoApiService:TodoApiService){}

  ngOnInit(): void {
    this.fetchTodos()
   
  }

  
  fetchTodos(){
    this.todoApiService.fetchTodos().subscribe(
      response => this.todos=response,
      
    )
   
  }


}
