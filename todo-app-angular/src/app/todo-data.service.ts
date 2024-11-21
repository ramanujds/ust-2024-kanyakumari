import { Injectable } from '@angular/core';
import { Todo } from './model/Todo';
import { TodoApiService } from './todo-api.service';

@Injectable({
  providedIn: 'root'
})
export class TodoDataService {

  constructor(private todoApiService:TodoApiService) { }

  todos:Array<Todo>=[];

  addTodo(todo:Todo){
    this.todos.push(todo)
  }

 
  fetchTodos(){
    this.todoApiService.fetchTodos().subscribe(
      response => this.todos=response
    )
  }
  



}
