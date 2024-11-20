import { Injectable } from '@angular/core';
import { Todo } from './model/Todo';

@Injectable({
  providedIn: 'root'
})
export class TodoDataService {

  constructor() { }

  todos:Array<Todo>=[];

  addTodo(todo:Todo){
    this.todos.push(todo)
  }

  deleteTodo(title:string){
    const index = this.todos.findIndex(t => t.title === title)
    if(index != -1)
        this.todos.splice(index,1)
  }

  

}
