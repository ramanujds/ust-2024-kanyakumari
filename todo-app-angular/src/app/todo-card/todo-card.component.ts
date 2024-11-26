import { Component, Input, OnChanges } from '@angular/core';
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
export class TodoCardComponent implements OnChanges {


  @Input('todo')
  todo?:Todo;

  ngOnChanges(): void {
    console.log(this.todo);
  }

  isUpadting:boolean = false;

  toggleUpdate(){
    this.isUpadting = !this.isUpadting;
  }

}
