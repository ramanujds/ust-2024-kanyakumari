import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {Todo} from '../model/Todo';
import { TodoDataService } from '../todo-data.service';

@Component({
  selector: 'app-add-todos',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './add-todos.component.html',
  styleUrl: './add-todos.component.css'
})
export class AddTodosComponent {

  constructor(private todoDataSercice:TodoDataService){}

  addTodos(todo:Todo){
    this.todoDataSercice.addTodo(todo)
    alert(`${todo.title} Added`);
  }

  printTodos(){
    this.todoDataSercice.todos.forEach(t=>console.log(t))
  }

}
