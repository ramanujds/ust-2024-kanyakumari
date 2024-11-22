import { Component, Input } from '@angular/core';
import { Todo } from '../model/Todo';
import { UpdateTodoComponent } from "../update-todo/update-todo.component";
import { CommonModule } from '@angular/common';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-todo-card',
  standalone: true,
  imports: [UpdateTodoComponent,CommonModule, RouterModule],
  templateUrl: './todo-card.component.html',
  styleUrl: './todo-card.component.css'
})
export class TodoCardComponent {


  @Input('todo')
  todo?:Todo;

  isUpadting:boolean = false;

  toggleUpdate(){
    this.isUpadting = !this.isUpadting;
  }

}
